package nuigalway.app;

import static org.junit.Assert.assertTrue;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
	
	private Student testStudent;
	
	@Before
	public void createStudent() {
		this.testStudent = new Student();
		this.testStudent.setName("Joe Bloggs");
		this.testStudent.addCourse(new Course("Computer Science"));
		this.testStudent.addModule(new Module("CT417"));
		this.testStudent.setDateOfBirth(new DateTime(2000,01,01, 00, 00));
		this.testStudent.setId(001);
	}
	
	@Test
	public void testAge() {
		 assertTrue( this.testStudent.getAge() == 190);
	}
	
	@Test
	public void testCourses() {
		assertTrue (this.testStudent.getCourses().size() == 1);
	}
	
	@Test
	public void testModules() {
		assertTrue( this.testStudent.getModules().size() ==1);
	}
	
	@Test
	public void testDateOfBirth() {
		assertTrue(this.testStudent.getDateOfBirth().equals(new DateTime(2000,01,01, 00, 00)));
	}
	
	@Test
	public void testID() {
		assertTrue(this.testStudent.getId() == 001);
	}
	
	@Test
	public void testUserName() {
		
		assertTrue(this.testStudent.getUsername().equals("joebloggs19"));
	}
	
}
