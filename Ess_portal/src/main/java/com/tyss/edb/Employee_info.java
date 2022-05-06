package com.tyss.edb;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee_info {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int Employee_Id;
	private String Employee_name;
	private String Employee_type;
	private String Email;
	private String Password;
	
	
}
