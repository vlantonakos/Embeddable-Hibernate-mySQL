package com.vlanto.DemoHibe;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class App 
{
    public static void main( String[] args )
    {
    	
    	AlienName an = new AlienName();
    	an.setFname("Antonis");
    	an.setLname("Vlachavas");
    	an.setMname("Rafail");
    	
        Alien myAlien = new Alien();
        myAlien.setAid(101);
        myAlien.setColor("Green");
        myAlien.setAname(an);
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        
        SessionFactory sf = con.buildSessionFactory(reg);
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(myAlien);
        
        tx.commit();
        
        System.out.println(myAlien);
    }
}
