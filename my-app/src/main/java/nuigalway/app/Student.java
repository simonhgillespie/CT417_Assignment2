package nuigalway.app;

import java.util.Date;

public class Student {
	
	private String name;
	private int age;
	private Date dateOfBirth;
	private int id;
	private Module[] modules = new Module[20];
	
	

	
	public String getUsername() {
		return this.name + this.age; 
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Module [] getModules() {
		return modules;
	}
/*
	public void addModules(Module [] modules) {
		this.modules
	}*/
}
