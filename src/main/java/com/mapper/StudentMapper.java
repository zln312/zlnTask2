package com.mapper;


import com.model.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
@Repository
public interface StudentMapper {
    //增
    @Insert(value = "insert into student_info(create_at,update_at,name,qq,curricular,school_time,college,id_num,report_link,goal,refree)values(#{create_at},#{update_at},#{name},#{qq},#{curricular},#{school_time},#{college},#{id_num},#{report_link},#{goal},#{refree})")
    @Options(useGeneratedKeys = true)
    long add(Student student) throws SQLException;

    //删
    @Delete(value = " DELETE FROM student_info WHERE id=#{id}")
    boolean delete(long id) throws SQLException;

    //改
    @Update(value = "update student_info set  create_at=#{create_at},update_at=#{update_at},name=#{name},qq=#{qq},curricular=#{curricular},school_time=#{school_time},college=#{college},report_link=#{report_link},goal=#{goal},refree=#{refree} where id=#{id}")
    boolean update(Student student) throws SQLException;

    //查

    //根据名字查询
    @Select(value = "select * from  student_info WHERE name =#{name}")
    List<Student> showOneN(String name) throws SQLException;

    //根据学号查询
    @Select(value = "SELECT *from student_info WHERE id=#{id}")
    Student showOneI(long id) throws SQLException;

    //查询全部
    @Select(value = " SELECT *from student_info")
    List<Student> showAll();

    //查询总条数
    @Select(value = "select count(0) from student_info")
    long count();

    //查询当前页
    @Select(value = "select *from student_info limit #{a},10")
    List<Student>  showPage(long a);


}
