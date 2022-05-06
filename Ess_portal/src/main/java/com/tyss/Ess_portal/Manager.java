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

public class Manager {
	//private static final String Syetem = null;

	static void managers(Employee_info emp) {
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("name");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		System.out.println("Hii "+emp.getEmployee_name());
		System.out.println("\n");
		while(true) {
		System.out.println("1.All leave request\n2.Approve leave\n3.logout");
		Scanner scan = new Scanner(System.in);
		
		int option=scan.nextInt();
		
		if(option==1) {
			Query createQuery = createEntityManager.createQuery("from Leave_info ");
			//createQuery.setParameter("i",emp.getEmployee_Id());
			List<Leave_info> resultList = createQuery.getResultList();
			if(resultList!=null) {
				Iterator<Leave_info> iterator = resultList.iterator();
				while(iterator.hasNext()) {
					Leave_info next = iterator.next();
					System.out.println(next);
				}
			}
			else {
				System.out.println("Request is empty");
			}
			
		}
		if(option==2) {
			
			System.out.println("Give the serial number of the employee");
			Scanner scanner = new Scanner(System.in);
			Leave_info find = createEntityManager.find(Leave_info.class, scanner.nextInt());
			EntityTransaction transaction = createEntityManager.getTransaction();
			System.out.println(find.getEmployee_Id());
			transaction.begin();
			System.out.println("1.Approve or2. Reject");
			Scanner choice = new Scanner(System.in);
			int status=choice.nextInt();
			if(status==1) {
				find.setLeave_Status("Approved");
				
			}
			if(status==2) {
				find.setLeave_Status("Rejected");
			}
			if(status>2) {
				System.out.println("INVALID");
			}
			createEntityManager.persist(find);
			transaction.commit();
		}
		if(option==3) {
			break;
		}
		if(option>3) {
			System.out.println("INVALID");
		}
		}
	}
}
