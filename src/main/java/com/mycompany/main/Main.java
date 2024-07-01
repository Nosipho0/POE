/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author RC_Student_lab
 */
public class Main {

    public static void main(String[] args) {
        Register register = new Register();
        register.registerUser();
        
        Login login = new Login(register.getUsers());
        login.loginUser();
            
        
        TaskManager taskManager = new TaskManager();
        taskManager.showMenu();
      
    }
}
