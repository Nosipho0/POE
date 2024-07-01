/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RC_Student_lab
 */
public class TaskManager {
   final private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String taskName, int taskNumber, String taskDescription, String developerDetails, int taskDuration, String taskStatus) {
        if (!isValidTaskStatus(taskStatus)) {
            JOptionPane.showMessageDialog(null, "Invalid task status! Task status must be either 'To Do', 'Doing', or 'Done'.");
            return;
        }

        Task task = new Task(taskName, taskNumber, taskDescription, developerDetails, taskDuration, taskStatus);
        tasks.add(task);
        JOptionPane.showMessageDialog(null, "Task added successfully!");
    }

    private boolean isValidTaskStatus(String taskStatus) {
        return taskStatus.equalsIgnoreCase("To Do") || taskStatus.equalsIgnoreCase("Doing") || taskStatus.equalsIgnoreCase("Done");
    }

    public void showTasks() {
        if (tasks.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No tasks available.");
        } else {
            StringBuilder taskList = new StringBuilder("Tasks:\n");
            for (Task task : tasks) {
                taskList.append(task.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(null, taskList.toString());
        }
    }

    public void showMenu() {
        boolean running = true;
        while (running) {
            String menu = "Welcome to Easy Kanban\n1. Add task\n2. Show report\n3. Search task by name\n4. Search tasks by developer\n5. Delete task by name\n6. Display full report\n7. Quit\nChoose an option:";
            String choice = JOptionPane.showInputDialog(menu);

            switch (choice) {
                case "1" -> {
                    String taskName = JOptionPane.showInputDialog("Enter task name:");
                    int taskNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter task number:"));
                    String taskDescription = JOptionPane.showInputDialog("Enter task description:");
                    String developerDetails = JOptionPane.showInputDialog("Enter developer details:");
                    int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter task duration (in hours):"));
                    String taskStatus = JOptionPane.showInputDialog("Enter task status (To Do, Doing, Done):");
                    addTask(taskName, taskNumber, taskDescription, developerDetails, taskDuration, taskStatus);
                }
                case "2" -> displayLongestDurationTask();
                case "3" -> searchTaskByName();
                case "4" -> searchTasksByDeveloper();
                case "5" -> deleteTaskByName();
                case "6" -> displayFullReport();
                case "7" -> running = false;
                default -> JOptionPane.showMessageDialog(null, "Invalid option. Please choose again.");
            }
        }
    }

    public void displayLongestDurationTask() {
        Task longestDurationTask = null;

        for (Task task : tasks) {
            if (task.getTaskStatus().equalsIgnoreCase("Done")) {
                if (longestDurationTask == null || task.getTaskDuration() > longestDurationTask.getTaskDuration()) {
                    longestDurationTask = task;
                }
            }
        }

        if (longestDurationTask != null) {
            JOptionPane.showMessageDialog(null, "Developer: " + longestDurationTask.getDeveloperDetails() + "\nDuration: " + longestDurationTask.getTaskDuration());
        } else {
            JOptionPane.showMessageDialog(null, "No tasks with status 'Done' found.");
        }
    }

    public void searchTaskByName() {
        String taskName = JOptionPane.showInputDialog("Enter the task name to search:");
        Task foundTask = null;

        for (Task task : tasks) {
            if (task.getTaskName().equalsIgnoreCase(taskName)) {
                foundTask = task;
                break;
            }
        }

        if (foundTask != null) {
            JOptionPane.showMessageDialog(null, "Task Name: " + foundTask.getTaskName() + "\nDeveloper: " + foundTask.getDeveloperDetails() + "\nStatus: " + foundTask.getTaskStatus());
        } else {
            JOptionPane.showMessageDialog(null, "Task not found.");
        }
    }

    public void searchTasksByDeveloper() {
        String developerName = JOptionPane.showInputDialog("Enter the developer name to search:");
        StringBuilder result = new StringBuilder("Tasks assigned to " + developerName + ":\n");

        for (Task task : tasks) {
            if (task.getDeveloperDetails().equalsIgnoreCase(developerName)) {
                result.append("Task Name: ").append(task.getTaskName()).append("\nStatus: ").append(task.getTaskStatus()).append("\n\n");
            }
        }

        JOptionPane.showMessageDialog(null, result.toString());
    }

    public void deleteTaskByName() {
        String taskName = JOptionPane.showInputDialog("Enter the task name to delete:");
        Task taskToDelete = null;

        for (Task task : tasks) {
            if (task.getTaskName().equalsIgnoreCase(taskName)) {
                taskToDelete = task;
                break;
            }
        }

        if (taskToDelete != null) {
            tasks.remove(taskToDelete);
            JOptionPane.showMessageDialog(null, "Task deleted successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Task not found.");
        }
    }

    public void displayFullReport() {
        if (tasks.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No tasks available.");
        } else {
            StringBuilder report = new StringBuilder("Full Task Report:\n");
            for (Task task : tasks) {
                report.append(task.toString()).append("\n");
            }
            JOptionPane.showMessageDialog(null, report.toString());
        }
    }
}
      
          