package com.springjpa.learnjpaandhibernate.course.springdatajpa;

import com.springjpa.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> //Long la khoa chinh cua course
{
    List<Course> findByAuthor(String author);
}
