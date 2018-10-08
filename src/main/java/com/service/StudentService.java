package com.service;

import com.model.Student;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public interface StudentService {
    long add(Student student) throws SQLException;

    boolean delete(long id) throws SQLException;

    boolean update(Student student) throws SQLException;


    Student showOneI(long id) throws SQLException;

    List<Student> showAll();


}
