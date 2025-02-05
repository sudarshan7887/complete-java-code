package com.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project started..." );
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
//        System.out.println(factory);
//        System.out.println(factory.isClosed());
        
        Student st = new Student(101,"ram","mumbai");
         		//st = new Student(102,"shyam","nashik");
         		
//        st.id = 12;
//        st.name = "Sudarshan";
//        st.city = "pune";
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        session.save(st);
        
        tx.commit();
        session.close();
        
    }
}
