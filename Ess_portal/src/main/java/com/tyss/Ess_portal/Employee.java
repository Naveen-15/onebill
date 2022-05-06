package com.tyss.Ess_portal;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.edb.Employee_info;
import com.tyss.edb.Leave_info;

public class Employee {
	@SuppressWarnings("resource")
	static void employees(Employee_info emp) {
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("name");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		System.out.println("Hii "+emp.getEmployee_name());
		System.out.println("\n");
		while(true) {
		System.out.println("1.Show all the leave status\n2.Request for leave\n3.logout");
		Scanner scan = new Scanner(System.in);
		int option=scan.nextInt();
		if(option==1) {
			Query createQuery = createEntityManager.createQuery("from Leave_info where Employee_Id=:i");
			createQuery.setParameter("i",emp.getEmployee_Id());
			List<Leave_info> resultList = createQuery.getResultList();
			if(resultList!=null) {
				Iterator<Leave_info> iterator = resultList.iterator();
				while(iterator.hasNext()) {
					Leave_info next = iterator.next();
					System.out.println(next);
				}
			}
			
		}
		if(option==2) {
			Leave_info info = new Leave_info();
			System.out.println("Give the date of the leave");
			Scanner scanner = new Scanner(System.in);
			info.setLeave_Date(scanner.next());
			info.setEmployee_Id(emp.getEmployee_Id());
			info.setLeave_Status("Pending");
			EntityTransaction transaction = createEntityManager.getTransaction();
			transaction.begin();
			createEntityManager.persist(info);
			transaction.commit();
		}
		if(option==3) {
			break;
		}
		if(option>3) {
			System.out.println("invalid");
			
		}
	}
	}
}
