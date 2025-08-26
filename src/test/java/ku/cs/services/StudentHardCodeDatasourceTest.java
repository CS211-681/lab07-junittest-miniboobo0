package ku.cs.services;

import ku.cs.models.Student;
import ku.cs.models.StudentList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {

    static StudentHardCodeDatasource shc;
    @BeforeAll
    static void initial(){
        shc = new StudentHardCodeDatasource();
    }

    @Test
    void testStudentHardCodeDatasource(){

        StudentList list = shc.readData();

        assertEquals(4, list.getStudents().size());

        Student first = list.findStudentById("6710400001");
        assertNotNull(first);
        assertEquals("First", first.getName());

        Student Second = list.findStudentById("6710400002");
        assertNotNull(Second);
        assertEquals("Second", Second.getName());

        Student Third = list.findStudentById("6710400003");
        assertNotNull(Third);
        assertEquals("Third", Third.getName());

        Student fourth = list.findStudentById("6710400004");
        assertNotNull(fourth);
        assertEquals("Fourth", fourth.getName());

    }


}