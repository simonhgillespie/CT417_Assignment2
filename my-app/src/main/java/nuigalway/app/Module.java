package nuigalway.app;

public class Module {

	private String moduleName;
	
	private Student[] students = new Student[100];
	private Course[] associatedCourses = new Course[20];

	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
	public void addCourse(Course c) {
		//ToDO
	}
}
