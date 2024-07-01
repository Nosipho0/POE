/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;



/**
 *
 * @author RC_Student_lab
 */
public class Task {
    final private String taskName;
    final private int taskNumber;
   final private String taskDescription;
    final private String developerDetails;
   final private int taskDuration;
    final private String taskId;
    private String taskStatus;

    public Task(String taskName, int taskNumber, String taskDescription, String developerDetails, int taskDuration, String taskStatus) {
        this.taskName = taskName;
        this.taskNumber = taskNumber;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskId = generateTaskId(taskName, taskNumber, developerDetails);
        this.taskStatus = taskStatus;
    }

    private String generateTaskId(String taskName, int taskNumber, String developerDetails) {
        return taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + 
                developerDetails.substring(developerDetails.length() - 3).toUpperCase();
    }

    public String getTaskName() {
        return taskName;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public String getDeveloperDetails() {
        return developerDetails;
    }

    public int getTaskDuration() {
        return taskDuration;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", taskNumber=" + taskNumber +
                ", taskDescription='" + taskDescription + '\'' +
                ", developerDetails='" + developerDetails + '\'' +
                ", taskDuration=" + taskDuration +
                ", taskId='" + taskId + '\'' +
                ", taskStatus='" + taskStatus + '\'' +
                '}';
    }
}


        
        
    
        
    
  
    
    
    
       
       
    
        
        
    
        
    

    
    
    
    




                
        
    
    
                
        
       
    

