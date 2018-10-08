package com.utility;

import com.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


    @Component
    public class Jump {
        @Autowired
        private StudentMapper studentMapper;

        //总页数
        public long getPages() {
            long num = studentMapper.count();

            long pages;
            if (num % 10 == 0) {
                pages = num / 10;
            } else {
                pages = num / 10 + 1;
            }
            return pages;
        }

        //查询第m页的数据
        public List getPageStudent(long m) {
            long num = (m - 1) * 10;
            return studentMapper.showPage(num);
        }
    }



