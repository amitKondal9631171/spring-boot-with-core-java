package org.school.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.school.entity.Student;
import org.school.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@Scope("prototype")
public class StudentRepositoryImpl   implements StudentRepository {

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean isDbUp(){
        return entityManager.isOpen();
    }

    @Override
    public boolean addStudent(Student student){
        int rowsEffected = (int) hibernateTemplate.save(student);
        student.setLastName(student.getLastName().concat("-Updated"));
        Student studentFromDB = hibernateTemplate.get(Student.class, rowsEffected);
        assert studentFromDB != null;
        student.setLastName(studentFromDB.getLastName().concat("-updated-Updated"));

        return true;
    }

    @Override
    public boolean addStudentInBulk(List<Student> student){

        try(Session session = sessionFactory.openSession()) {


            session.save(student);
        }


        return false;
    }
}

