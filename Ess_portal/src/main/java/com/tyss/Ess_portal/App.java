package com.tyss.Ess_portal;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.edb.Employee_info;

/**
 * Hello world!
 *
 */
public class App {
	
	static void register(Employee_info a) {
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("REGISTRATION");
		System.out.println("Employee name:");
		a.setEmployee_name(scan.next());
		System.out.println("Employee ID:");
		a.setEmployee_Id(scan.nextInt());
		System.out.println("Employee type:");
		a.setEmployee_type(scan.next());
		System.out.println("Employee Email:");
		a.setEmail(scan.next());
		System.out.println("Employee password");
		a.setPassword(scan.next());
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("name");
		EntityManager entityManager = createEntityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(a);
		transaction.commit();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Give valid id ");
		}
		
	}

	static void login(Employee_info a) {
		Scanner scan = new Scanner(System.in);
		System.out.println("LOGIN");
		System.out.println("Employee Id:");
		//a.setEmail(scan.next());
		int id=scan.nextInt();
		System.out.println("Employee password");
		//a.setPassword(scan.next());
		String pass=scan.next();
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("name");
		EntityManager entityManager = createEntityManagerFactory.createEntityManager();
		Employee_info find = entityManager.find(Employee_info.class, id);
		//System.out.println("find");
		//System.out.println(find.getEmployee_Id());
		//System.out.println(find.getPassword());
		try {
//		if(find.getEmployee_Id()==0) {
//			//System.out.println("id is 0");
//		}
		
		if(find.getPassword().contentEquals(pass)) {
			System.out.println("login successfully");
			if(find.getEmployee_type().contentEquals("employee")||find.getEmployee_type().contentEquals("Employee")||find.getEmployee_type().contentEquals("EMPLOYEE")) {
				//System.out.println("request leave");
				Employee.employees(find);
			}
			if(find.getEmployee_type().contentEquals("manager")||find.getEmployee_type().contentEquals("Manager")||find.getEmployee_type()=="MANAGER") {
				System.out.println("Approve leave");
				//Employee.(find.getEmployee_Id());
				Manager.managers(find);
			}
		}
		else
			System.out.println("wrong password");
		}
		catch (Exception e) {
			System.out.println("INVALID ID");
		}
		
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Employee_info info = new Employee_info();
		while (true) {
			System.out.println("==================ESS PORTAL==================");
			System.out.println("1.Login\n2.Register");
			Scanner scan = new Scanner(System.in);
			String str=null;
			
			try {
				int option = scan.nextInt();
				if(option==1)
					str="login";
				if(option==2)
					str="register";
				if(option>2)
					str="invalid";
					
			}
			catch (Exception e) {
				String option=scan.next();
				str=option;
			}
			switch (str) {
			
			case "login": {
				login(info);
				break;
			}
			case "register": {
				register(info);
				break;
			}
			default: {
				System.out.println("Give valid option");
				break;
			}
			}

		}
	}
}
