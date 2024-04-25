package com.springjpa.learnjpaandhibernate.course.springdatajpa;

import com.springjpa.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner
{
    @Autowired
    private CourseSpringDataJpaRepository courseSpringDataJpaRepository;
    @Override
    public void run(String... args) throws Exception
    {
        courseSpringDataJpaRepository.save(new Course(5,"Oanh","Tran"));
        courseSpringDataJpaRepository.save(new Course(6,"Vu","Vu"));
        courseSpringDataJpaRepository.deleteById(5L);
        System.out.println(courseSpringDataJpaRepository.findById(6L));
    }
}
