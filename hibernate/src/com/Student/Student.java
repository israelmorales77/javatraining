package com.Student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="Student", schema="java_training")
public class Student 
{	
	public Student(int id, String string, String string2, String string3, int age) {
		super();
		this.id = id;
		this.firstName = string;
		this.lastName = string2;
		this.email = string3;
		this.age = age;
	}
	
	@Id
	private long id = 0L;
	@Column(name="StudentFirstName")
	public String firstName = null;
	@Column(name="StudentLastName")
	public String lastName = null;
	public int age = 0;
	public String email = null;
	public int grade = 0;
	
	/**
	 * @return the id
	 */	
	public long getId() 
	{
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) 
	{
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() 
	{
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() 
	{
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	/**
	 * @return the grade
	 */
	public int getGrade() 
	{
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) 
	{
		this.grade = grade;
	}
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
