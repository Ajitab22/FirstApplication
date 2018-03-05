package com.ajit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="newemployee")
public class Employee {
	private @Id int empId;
	private String firstName;
	private String lastName;
	private int age;
	private String street;
	private int postalCode;
	private String city;
	private String eMail;
	private String phoneNumber;
	private String info;
}
