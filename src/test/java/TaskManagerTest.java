/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.main.TaskManager;
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
public class TaskManagerTest {
    
    public TaskManagerTest() {
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
     * Test of addTask method, of class TaskManager.
     */
    @Test
    public void testAddTask() {
        System.out.println("addTask");
        String taskName = "";
        int taskNumber = 0;
        String taskDescription = "";
        String developerDetails = "";
        int taskDuration = 0;
        String taskStatus = "";
        TaskManager instance = new TaskManager();
        instance.addTask(taskName, taskNumber, taskDescription, developerDetails, taskDuration, taskStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showTasks method, of class TaskManager.
     */
    @Test
    public void testShowTasks() {
        System.out.println("showTasks");
        TaskManager instance = new TaskManager();
        instance.showTasks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showMenu method, of class TaskManager.
     */
    @Test
    public void testShowMenu() {
        System.out.println("showMenu");
        TaskManager instance = new TaskManager();
        instance.showMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayLongestDurationTask method, of class TaskManager.
     */
    @Test
    public void testDisplayLongestDurationTask() {
        System.out.println("displayLongestDurationTask");
        TaskManager instance = new TaskManager();
        instance.displayLongestDurationTask();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTaskByName method, of class TaskManager.
     */
    @Test
    public void testSearchTaskByName() {
        System.out.println("searchTaskByName");
        TaskManager instance = new TaskManager();
        instance.searchTaskByName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTasksByDeveloper method, of class TaskManager.
     */
    @Test
    public void testSearchTasksByDeveloper() {
        System.out.println("searchTasksByDeveloper");
        TaskManager instance = new TaskManager();
        instance.searchTasksByDeveloper();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTaskByName method, of class TaskManager.
     */
    @Test
    public void testDeleteTaskByName() {
        System.out.println("deleteTaskByName");
        TaskManager instance = new TaskManager();
        instance.deleteTaskByName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayFullReport method, of class TaskManager.
     */
    @Test
    public void testDisplayFullReport() {
        System.out.println("displayFullReport");
        TaskManager instance = new TaskManager();
        instance.displayFullReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
