package com.springjpa.learnjpaandhibernate.course.jdbc;

import com.springjpa.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner
{

    @Autowired
    private CourseJdbcRepository repository;
    @Override
    public void run(String... args) throws Exception
    {
        repository.insert(new Course(1, "Learn Spring", "Someone"));
        repository.insert(new Course(2, "Learn Spring boot", "Someone2"));
        repository.insert(new Course(3, "Learn Java", "Someone3"));
        repository.deleteById(1);
        System.out.println(repository.findByID(2));
    }
}
