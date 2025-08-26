package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    static Student s;
    @BeforeAll
    static void initial() {
         s = new Student ("6710451143", "Phu");


    }
    @BeforeEach
    void setUp() {
         s = new Student("6710451143", "Phu");

    }



    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน")
    void testAddScore(){

        s.addScore(82.2);
        assertEquals(82.2,s.getScore());
    }
    @Test
    @DisplayName("ทดสอบคำนวณคะแนน")
    void testCalculateScore(){

        s.addScore(90.6);
        assertEquals("A",s.grade());

    }
    @Test
    @DisplayName("ทดสอบการเปลี่ยนชื่อ")
    void testChangeName(){

        s.changeName("NameChanged");
        assertEquals("NameChanged",s.getName());
    }

    @Test
    @DisplayName("ทดสอบ isId")
    void testIsId(){
        s.isId("6710451143");
        assertTrue(s.isId("6710451143"));
        assertFalse(s.isId("123"));

    }

    @Test
    @DisplayName("ทดสอบ Contain ชื่อ")
    void testIsNameContains(){
        s.isNameContains("Phu");
        assertTrue(s.isNameContains("Ph"));
        assertFalse(s.isNameContains("test"));
    }




}