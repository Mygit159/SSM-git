package com.HuLi.service.impl;

import com.HuLi.dao.StudentDao;
import com.HuLi.domain.Student;
import com.HuLi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao dao;
    @Override
    public int addStudent(Student student) {
        return dao.insertStudent(student);
    }

    @Override
    public List<Student> queryStudent() {
        return  dao.selectStudent();
    }
}
