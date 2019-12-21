package nuigalway.app;
import java.util.LinkedList;

import org.joda.time.*;

public class Course {

	private String courseName;
	
	private LinkedList<Module> modules = new LinkedList<Module>(); 
	private LinkedList<Student> students = new LinkedList<Student>(); 
	
	private DateTime startDate;
	private DateTime endDate;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	
	

}
