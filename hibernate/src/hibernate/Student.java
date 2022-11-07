package hibernate;

import org.hibernate.annotations.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="Students")
public class Student 
{

	/**
	 * @return the id
	 */	
	public static long getId() 
	{
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public static void setId(long id) 
	{
		Student.id = id;
	}
	/**
	 * @return the firstName
	 */
	public static String getFirstName() 
	{
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public static void setFirstName(String firstName) 
	{
		Student.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public static String getLastName() 
	{
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public static void setLastName(String lastName) 
	{
		Student.lastName = lastName;
	}
	/**
	 * @return the grade
	 */
	public static int getGrade() 
	{
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public static void setGrade(int grade) 
	{
		Student.grade = grade;
	}
	
	/**
	 * @return the age
	 */
	public static int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public static void setAge(int age) {
		Student.age = age;
	}

	/**
	 * @return the email
	 */
	public static String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public static void setEmail(String email) {
		Student.email = email;
	}

	@Id
	private static long id = 0L;
	@Column(name="StudentFirstName")
	private static String firstName = null;
	@Column(name="StudentLastName")
	private static String lastName = null;
	private static int age = 0;
	private static String email = null;
	private static int grade = 0;

}
