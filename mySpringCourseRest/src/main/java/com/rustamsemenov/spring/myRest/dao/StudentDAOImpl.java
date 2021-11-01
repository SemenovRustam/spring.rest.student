package com.rustamsemenov.spring.myRest.dao;

import com.rustamsemenov.spring.myRest.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl  implements StudentDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Student> getAllStudent() {
        Session session = sessionFactory.getCurrentSession();
        List<Student> allStudent = session.createQuery("from Student", Student.class).getResultList();
        return allStudent;
    }

    @Override
    @Transactional
    public void saveStudent(Student student) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(student);
    }

    @Override
    @Transactional
    public Student getId(int id) {
        Session session = sessionFactory.getCurrentSession();
        Student  student = session.get(Student.class, id);
        return  student;
    }

    @Override
    @Transactional
    public void deleteStudent(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Student> query = session.createQuery("delete from Student where id =:studentId");
        query.setParameter("studentId", id);
        query.executeUpdate();
    }
}
