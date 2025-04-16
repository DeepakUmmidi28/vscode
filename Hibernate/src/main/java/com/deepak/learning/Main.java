package com.deepak.learning;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
// import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student(5, "Shreya", 20);

        // Configuration cfg = new Configuration();
        // cfg.configure();
        // cfg.addAnnotatedClass(com.deepak.learning.Student.class);
        // SessionFactory sf=cfg.buildSessionFactory();

        SessionFactory sf=new Configuration()
            .configure()    
            .addAnnotatedClass(com.deepak.learning.Student.class)   
            .buildSessionFactory();

        Session session =sf.openSession();
        // Transaction tx=session.beginTransaction();

        // session.save(s1);
        // session.persist(s1);
        // tx.commit();

        // System.out.println("Student saved successfully");
        // System.out.println(s1);

        // Student stu=session.get(Student.class, 102);
        // System.out.println(stu);

        // session.merge(s1);
        // System.out.println("Student updated successfully");
        
        // session.remove(stu);
        // tx.commit();
        // System.out.println("Student deleted successfully");

        Query query =session.createQuery("from Student");
        List<Student> students=query.getResultList();

        System.out.println("List of Students: "+students);

        session.close();
        sf.close();
    }
}