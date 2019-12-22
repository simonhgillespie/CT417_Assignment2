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
	
	public void addModule(Module module) {
		this.modules.add(module);
	}
	
	public LinkedList<Module> getModules() {
		return modules;
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	public LinkedList<Student> getStudents() {
		return students;
	}
	
	public void setStartingDate(DateTime startDate) {
		this.startDate = startDate;
	}
	
	public DateTime getStartDate() {
		return startDate;
	}
	
	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	
	public DateTime getEndDate() {
		return endDate;
	}
	

}
