import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testIfStudentExists() {
        Student nayo = new Student("Nayo", 1);
        assertNotNull("nayo");
    }

    @Test
    public void studentFieldsTest() {
        Student nayo = new Student("Nayo", 1L);
        nayo.addGrade(90);
        assertSame(1L, nayo.getId());
        assertSame("Nayo", nayo.getName());
        assertSame(1,nayo.getGrades().size());
    }

    @Test
    public void addGradesTest(){
        Student nayo = new Student("Nayo", 1L);
        nayo.addGrade(100);
        assertSame(100,nayo.getGrades().get(0));
        nayo.addGrade(65);
        assertSame(60, nayo.getGrades().get(1));
    }

    @Test
    public void getAverageTest(){
        Student nayo = new Student("Nayo", 1L);
        nayo.addGrade(100);
        nayo.addGrade(90);
        assertEquals(95, nayo.getAverage(),0);
    }



}
