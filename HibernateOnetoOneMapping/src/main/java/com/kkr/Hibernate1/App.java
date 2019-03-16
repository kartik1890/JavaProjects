package com.kkr.Hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        try {
        	
        StudentInfo s1= new StudentInfo();
        s1.setName("Kartik 007");
        s1.setRollno(700);
        
        SessionFactory sf= new AnnotationConfiguration().configure().buildSessionFactory();
        Session session= sf.openSession();
        
        session.beginTransaction();
        
        session.save(s1);
        session.getTransaction().commit();
        session.close();
        sf.close();
        }
        catch(Exception e)
        {
        	System.out.println(e.getMessage());
        	System.out.println("Bro, something is worng");
        }
        System.out.println("Program ends");
    }
}
