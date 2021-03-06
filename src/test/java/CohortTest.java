import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class CohortTest {

    Cohort emptyCohort;
    Cohort cohortWithOne;
    Cohort cohortWithMany;

    @Before
    public void setup(){
        emptyCohort = new Cohort();
        cohortWithOne = new Cohort();
        cohortWithMany = new Cohort();

        Student fer = new Student(1, "Fer M");
        fer.addGrade(90);

        Student trant = new Student(2, "Trant B");
        trant.addGrade(100);
        trant.addGrade(100);
        trant.addGrade(100);

        cohortWithOne.addStudent(fer);
        cohortWithMany.addStudent(fer);
        cohortWithMany.addStudent(trant);
    }

    @Test
    public void testIfGetStudentsWork(){
        Cohort apex = new Cohort();
        assertEquals(0,apex.getStudents().size());
        Student fer = new Student(1l, "Fer");
        apex.addStudent(fer);
        assertEquals(1,apex.getStudents().size());
    }

    @Test
    public void testAddStudentAndGetStudentsWork(){
        assertEquals(0, emptyCohort.getStudents().size());
        assertEquals(1, cohortWithOne.getStudents().size());
//        assertEquals(1, cohortWithOne.getStudents().get(0).getId());
    }


    @Test
    public void testIfAvgIsCorrect(){
        Cohort apex = new Cohort();
        Student fer = new Student (1L, "fer");
        fer.addGrade(100);
        Student douglas = new Student (3l, "douglas");
        douglas.addGrade(80);
        apex.addStudent(fer);
        apex.addStudent(douglas);
        assertEquals(95.0, cohortWithMany.getCohortAverage(), 0);

    }

}