package nuigalway.app;
import java.util.Date;
import java.util.LinkedList;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Years;

public class Student {
	
	private String name;
	private DateTime dateOfBirth;
	private int id;
	
	private LinkedList<Module> modules = new LinkedList<Module>(); 
	private LinkedList<Course> courses = new LinkedList<Course>();

	public Student(String name) {
		this.name = name;
	}
	
	public String getUsername() {
		return this.name.toLowerCase().replaceAll("\\s","") + this.getAge(); 
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		
		int age = Years.yearsBetween(dateOfBirth, new DateTime(DateTimeZone.UTC)).getYears();
		return age;
	}

	public DateTime getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(DateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LinkedList<Module> getModules() {
		return modules;
	}

	public void addModule(Module module) {
		this.modules.add(module);
	}
	
	public LinkedList<Course> getCourses() {
		return courses;
	}
	
	public void addCourse( Course course) {
		this.courses.add(course);
	}
	
	
}
