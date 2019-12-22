package nuigalway.app;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

import org.joda.time.DateTime;

public class CourseTest {

	private Course testCourse;
	
	@Before
	public void createCourse() {
		this.testCourse = new Course("CS");
		this.testCourse.addModule(new Module("CT417"));
		this.testCourse.addStudent(new Student("Joe Bloggs"));
		this.testCourse.setStartingDate(new DateTime(2020, 9, 01, 9, 0 ));
		this.testCourse.setEndDate(new DateTime(2021, 5, 13, 18, 0 ));
	}
	
	@Test
	public void testCourseName() {
		assertTrue(this.testCourse.getCourseName().equals("CS"));
	}
	
	@Test
	public void testModules() {
		assertTrue( this.testCourse.getModules().size() == 1);
	}
	
	@Test
	public void testStudnets() {
		assertTrue(this.testCourse.getStudents().size() == 1);
	}
	
	@Test
	public void testStartDate() {
		assertTrue(this.testCourse.getStartDate().equals(new DateTime(2020, 9, 01, 9, 0 )));
	}
	
	@Test
	public void testEndDate() {
		assertTrue(this.testCourse.getEndDate().equals(new DateTime(2021, 5, 13, 18, 0 )));
	}
	
}
