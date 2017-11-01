package com.ateeq.hbnate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.ateeq.hbnate.pojo.UserContactDetails;
import com.ateeq.hbnate.pojo.Users;

public class OneToOneMappingMain {

	public static void main(String[] args) {
		System.out.println("One To One Mapping Test");
		
		Configuration configuration = new Configuration();
		
		configuration.configure();
		
		StandardServiceRegistryBuilder serRgstBldr = new StandardServiceRegistryBuilder();
		serRgstBldr.applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(serRgstBldr.build());
		
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		Users user = new Users();
		
		user.setCreateDate(new Date());
		user.setFirstName("test1");
		user.setLastName("test2");
		user.setUserId("test3");
		UserContactDetails userContactDetails = new UserContactDetails();
		user.setUserContactDetails(userContactDetails);
		userContactDetails.setAddressLine1("123");
		userContactDetails.setCity("city");;
		userContactDetails.setCountry("country");
		userContactDetails.setEmail("123@gmail.com");
		userContactDetails.setTelephone("123456789");
		userContactDetails.setZipCode("30087");
		
		session.save(user);
		session.getTransaction().commit();
		
		System.out.println("complete");

	}

}
