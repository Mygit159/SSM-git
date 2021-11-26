package com.HuLi.controller;

import com.HuLi.domain.Student;
import com.HuLi.service.StudentService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/Student")
public class StudentContoller {
    /**
     * 声明引用类型，调用引用类型的业务方法
     * 引用类型自动注入@AutoWired @Resource
     * */
    @Autowired
    private StudentService service;
    @RequestMapping("/addStudent.do")
    public ModelAndView addStudent(Student student){
     ModelAndView mv=new ModelAndView();
         int i=service.addStudent(student);
         String msg="注册失败！！！";
         if (i>0){
             msg="注册成功！！！";
         }
        mv.addObject("msg",student.getName()+","+msg);
         mv.setViewName("show");
     return mv;
    }

    @RequestMapping("/queryStudent.do")
    public void queryStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String ajax="";
        List<Student> stu=service.queryStudent();
        ObjectMapper om=new ObjectMapper();
            ajax=om.writeValueAsString(stu.get(0));
        PrintWriter out=response.getWriter();
        out.println(ajax);
    }
}
