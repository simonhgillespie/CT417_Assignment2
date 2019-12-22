package nuigalway.app;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ModuleTest {

	private Module testModule;
	
	@Before
	public void CreateModule() {
		this.testModule = new Module("CT404");
		this.testModule.addStudent(new Student("Joe Bloggs"));
		this.testModule.addCourse(new Course("Computer Science"));
	}
	
	@Test
	public void testModuleName() {
		assertTrue(this.testModule.getModuleName().equals("CT404"));
	}
	
	@Test
	public void testStudents() {
		assertTrue(this.testModule.getStudents().size() == 1);
	}
	
	@Test
	public void testCourses() {
		assertTrue(this.testModule.getCourses().size() == 1);
	}
	
}
