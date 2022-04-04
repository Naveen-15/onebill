package com.tyss.student;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> list = new ArrayList<Student>();
		Scanner scanner=new Scanner(System.in);
		int option=0;
		while(true) {
			System.out.println("1.add student\n2.Edit student\n3.Delete student\n4.List of students\n"
					+ "5.get student\n6.Sort the  list\n7.Exit");
			option=scanner.nextInt();
			switch(option) {
			case 1:{
				System.out.println("Give student id,student name,student marks,student course");
				int id=scanner.nextInt();
				String name=scanner.next();
				int marks=scanner.nextInt();
				String course=scanner.next();
				Student student = new Student(id, name, marks, course);
				list.add(student);
				break;
				}
			
			case 2:{
					System.out.println("Give the id of the student to be edited:");
					int id =scanner.nextInt();
					System.out.println("1.Name\n2.marks\n3.course");
					int option2=scanner.nextInt();
					switch(option2) {
					case 1:{
							System.out.println("Give the name");
							String name1=scanner.next();
							for(Student student:list) {
								if(id==student.id) {
									student.name=name1;
								}
							}
							break;
						}
					case 2:{
							System.out.println("Give the marks");
							int marks1=scanner.nextInt();
							for(Student student:list) {
								if(id==student.id) {
								student.marks=marks1;
								}
						}
							break;
					}
					case 3:{
							System.out.println("Give the course");
							String course1=scanner.next();
							for(Student student:list) {
								if(id==student.id) {
									student.course=course1;
								}
					}
							break;
					}
					default:System.out.println("invalid");
					
					}
					break;
			}
			case 3:{
					System.out.println("Give the id of the student to be deleted");
					int id =scanner.nextInt();
					for(Student student:list) {
						if(id==student.id) {
							list.remove(student);
						}
					}
					break;
				
			}
			
			case 4:{
				System.out.println("Student list:");
				for(Student std:list) {
					System.out.println(std);
				}
				break;
			}
			case 5:{
				System.out.println("Give the id of the student:");
				int id =scanner.nextInt();
				for(Student stud:list) {
					if(id==stud.id)
						System.out.println(stud);
				}
				break;
			}
			case 6:{
				System.out.println("Sort by:\n1.Id\n2.Name\n3.Marks");
				int option1=scanner.nextInt();
				switch(option1) {
				case 1:{
					SortById1 sortid=new SortById1();
					System.out.println("Sort by id");
					Collections.sort(list,sortid);
					System.out.println("sorted");
					break;
				}
				case 2:{
					SortByName sortByName = new SortByName();
					System.out.println("Sort by name");
					Collections.sort(list,sortByName);
					System.out.println("sorted");
					
					break;
					}
				case 3:{
					 SortByMark sortByMark = new SortByMark();
					System.out.println("Sort by marks");
					Collections.sort(list,sortByMark);
					System.out.println("sorted");
					break;
					}
				
				
				default:System.out.println("Invalid option");break;
				}
				break;
				
			}
			case 7:{
				System.out.println("Exit the system");
				return;
				}
			default:System.out.println("invalid");
			}
				
			}
		}
	}


