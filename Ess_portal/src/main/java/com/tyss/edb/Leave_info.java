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
public class Leave_info {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sno;
	private  int Employee_Id;
	private String Leave_Date;
	private String Leave_Status;
	
}
