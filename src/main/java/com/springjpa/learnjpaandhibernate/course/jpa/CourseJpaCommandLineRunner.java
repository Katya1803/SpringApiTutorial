package com.springjpa.learnjpaandhibernate.course.jpa;

import com.springjpa.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner
{
    @Autowired
    private CourseJpaRepository repository;
    @Override
    public void run(String... args) throws Exception
    {
        repository.insert(new Course(4,"Computer Arch","Nguyen Tien"));
        System.out.println(repository.findById(4));
        repository.deleteById(4);


    }
}
