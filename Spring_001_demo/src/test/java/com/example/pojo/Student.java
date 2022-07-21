package com.example.pojo;

public class Student {
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public Student(){
        System.out.println("学生的无参构造方法.....");
    }
    @Override
    public String toString(){
        return "Student(name="+name+"Age="+age+")";
    }
}
