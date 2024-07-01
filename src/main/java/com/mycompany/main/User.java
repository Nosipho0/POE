/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


/**
 *
 * @author RC_Student_lab
 */
public class User {
    final private String username;
   final  private String password;
    final private String firstName;
    final private String lastName;
    
    public User(String username, String password, String firstName, String lastName){
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
     public String getFirstName(){
         return firstName;
     }
     
      public String getLastName(){
          return lastName;
      }
   }

class UserManager {
    protected List<User> users;
    
    public UserManager(){
        users = new ArrayList<>();
    }
    
    public List<User> getUsers(){
        return users;
    }
}

class Register extends UserManager{
    
    public Register(){
        super();
    }
    
    private boolean isUsernameValid(String username){
        return username.length()<= 5 && username.contains("_");
    }
    
    private boolean isPasswordValid(String password){
        return password.length() <= 8 &&
                Pattern.compile("[A-Z]").matcher(password).find()&&
                Pattern.compile("[a-z]").matcher(password).find()&&
                Pattern.compile("[0-9]").matcher(password).find()&&
                Pattern.compile("[^a-zA-Z0-9]").matcher(password).find();
    }
    
    public void registerUser(){
        String username = JOptionPane.showInputDialog("Enter username");
        while (!isUsernameValid(username)){
            username = JOptionPane.showInputDialog("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");
        }
        
        String password = JOptionPane.showInputDialog("Enter password");
        while(!isPasswordValid(password)){
            password = JOptionPane.showInputDialog("Password is not correctly formatted, please ensure that the password contains atleast 8 characters, a capital letter, a number and a special character");
        }
        
        String firstName = JOptionPane.showInputDialog("Enter first name");
        String lastName = JOptionPane.showInputDialog("Enter last name");
        
        User user = new User(username, password, firstName, lastName);
        users.add(user);
        JOptionPane.showMessageDialog(null, "User registered successfully!");
    }
}
   

class Login extends UserManager{
    
     public Login(List<User> users){
        this.users = users;
    }
    
    public void loginUser(){
        String username = JOptionPane.showInputDialog("Enter username");
        String password = JOptionPane.showInputDialog("Enter password");
        
        for (User user : users){
            if (user.getUsername().equals(username)&& user.getPassword().equals(password)){
                JOptionPane.showMessageDialog(null, "Welcome," + user.getFirstName() + "" + user.getLastName () + "" + "it is great to see you again.");
           
        
    }
        }
    }
}























          


           





