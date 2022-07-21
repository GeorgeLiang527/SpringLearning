package com.example.test;

import com.example.pojo.Student;
//import org.testng.annotations.Test;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void TestStudent(){
        //程序员创建对象
        Student stu = new Student();
        System.out.println(stu);
    }
    @Test
    public void TestStudentSpring(){
        //由Spring容器进行对象的创建

        //如果想从Spring容器中取出对象，则要先创建容器对象并启动才可以取对象。
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu = (Student) ac.getBean("stu");
        System.out.println(stu);
    }

}
