package nuigalway.app;

import java.util.LinkedList;

public class Module {

	private String moduleName;
	
	private LinkedList<Course> courses = new LinkedList<Course>(); 
	private LinkedList<Student> students = new LinkedList<Student>(); 

	public Module( String moduleName) {
		this.moduleName = moduleName;
	}
	public String getModuleName() {
		return moduleName;
	}

	public void addCourse( Course course) {
		this.courses.add(course);
	}
	
	public LinkedList<Course> getCourses() {
		return courses;
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	public LinkedList<Student> getStudents() {
		return students;
	}
}
