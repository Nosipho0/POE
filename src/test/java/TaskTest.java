/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.main.Task;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class TaskTest {
    
    public TaskTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getTaskName method, of class Task.
     */
    @Test
    public void testGetTaskName() {
        System.out.println("getTaskName");
        Task instance = null;
        String expResult = "";
        String result = instance.getTaskName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskNumber method, of class Task.
     */
    @Test
    public void testGetTaskNumber() {
        System.out.println("getTaskNumber");
        Task instance = null;
        int expResult = 0;
        int result = instance.getTaskNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskDescription method, of class Task.
     */
    @Test
    public void testGetTaskDescription() {
        System.out.println("getTaskDescription");
        Task instance = null;
        String expResult = "";
        String result = instance.getTaskDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeveloperDetails method, of class Task.
     */
    @Test
    public void testGetDeveloperDetails() {
        System.out.println("getDeveloperDetails");
        Task instance = null;
        String expResult = "";
        String result = instance.getDeveloperDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskDuration method, of class Task.
     */
    @Test
    public void testGetTaskDuration() {
        System.out.println("getTaskDuration");
        Task instance = null;
        int expResult = 0;
        int result = instance.getTaskDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskId method, of class Task.
     */
    @Test
    public void testGetTaskId() {
        System.out.println("getTaskId");
        Task instance = null;
        String expResult = "";
        String result = instance.getTaskId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskStatus method, of class Task.
     */
    @Test
    public void testGetTaskStatus() {
        System.out.println("getTaskStatus");
        Task instance = null;
        String expResult = "";
        String result = instance.getTaskStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskStatus method, of class Task.
     */
    @Test
    public void testSetTaskStatus() {
        System.out.println("setTaskStatus");
        String taskStatus = "";
        Task instance = null;
        instance.setTaskStatus(taskStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Task.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Task instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
