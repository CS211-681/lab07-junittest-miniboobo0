package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    static StudentList sl;
    @BeforeAll
    static void initial() {
        sl = new StudentList ();


    }
    @BeforeEach
    void setUp() {
        sl = new StudentList();

    }

    @Test
    void testAddNewStudent() {
        sl.addNewStudent("6710451143", "Phu");
        assertEquals("6710451143", sl.getStudents().get(0).getId());
        assertEquals("Phu", sl.getStudents().get(0).getName());
    }

    @Test
    void testFindStudentById() {
        sl.addNewStudent("6710451143", "Phu");
        Student s = sl.findStudentById("6710451143");
        assertEquals("6710451143", s.getId());

    }

    @Test
    void testFilterByName() {
        sl.addNewStudent("6710451143", "Phu");
        StudentList filter = sl.filterByName("Phu");
        assertTrue(filter.getStudents().get(0).getName().contains("Phu"));
    }

    @Test
    void testGiveScoreToId(){
        sl.addNewStudent("6710451143", "Phu");
        sl.giveScoreToId("6710451143", 85.5);
        Student student = sl.findStudentById("6710451143");
        assertNotNull(student);
        assertEquals(85.5, student.getScore());
    }

    @Test
    void testViewGradeOfId(){
        sl.addNewStudent("6710451143", "Phu");
        sl.viewGradeOfId("6710451143");
        Student student = sl.findStudentById("6710451143");
        assertNotNull(student);
        assertEquals("6710451143", student.getId());
    }



}