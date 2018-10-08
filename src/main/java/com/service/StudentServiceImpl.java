package com.service;

import com.mapper.StudentMapper;
import com.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;


    @Override
    public long add(Student student) throws SQLException {
        return studentMapper.add(student);
    }

    @Override
    public boolean delete(long id) throws SQLException {
        return studentMapper.delete(id);
    }

    @Override
    public boolean update(Student student) throws SQLException {
        return studentMapper.update(student);
    }


    @Override
    public Student showOneI(long id) throws SQLException {
        return studentMapper.showOneI(id);
    }

    @Override
    public List<Student> showAll() {
        return studentMapper.showAll();
    }


}
