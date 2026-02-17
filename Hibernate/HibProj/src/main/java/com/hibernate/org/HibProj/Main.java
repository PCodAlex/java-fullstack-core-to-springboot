package com.hibernate.org.HibProj;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;

public class Main {
	public static void main(String[]args) {
		
		
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(com.hibernate.org.HibProj.Laptop.class);
		cfg.configure();
		SessionFactory sf= cfg.buildSessionFactory();
		Session sn=sf.openSession();
		
		String os="windows";
		Query q1=sn.createQuery("from Laptop where os like ?1",Laptop.class);
		q1.setParameter(1, os);
		List<Laptop> l1=q1.getResultList();
		System.out.println(l1);
		
		sf.close();
	}
}
