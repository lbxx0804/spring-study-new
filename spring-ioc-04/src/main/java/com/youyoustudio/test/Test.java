package com.youyoustudio.test;


import com.youyoustudio.service.StudentService;
import com.youyoustudio.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class Test {
    @Autowired
    private UserService userService;

    @Autowired
    private StudentService studentService;

    @org.junit.Test
    public void test() {
        userService.saveDb();
        studentService.saveDb();
    }

}
