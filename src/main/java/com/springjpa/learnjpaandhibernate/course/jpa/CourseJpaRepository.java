package com.springjpa.learnjpaandhibernate.course.jpa;

import com.springjpa.learnjpaandhibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CourseJpaRepository
{
    @PersistenceContext
    private EntityManager eM;

    public void insert(Course course){
        eM.merge(course);
    }

    public Course findById(long id){
        return eM.find(Course.class, id);
    }

    public void deleteById(long id){
        Course course = eM.find(Course.class, id);
        eM.remove(course);
    }
}
