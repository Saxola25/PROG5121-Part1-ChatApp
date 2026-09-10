/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapppart1;

public class Login {

    // Declare variables that are going to be used by the user
    String username;
    String password;
    String phoneNumber;
    String firstName;
    String lastName;
    String enteredUsername;
    String enteredPassword;

    /*
     * Constructor used to initialise the user's registration details.
     * The values entered by the user are assigned to the class variables.
     */
    public Login(String firstName, String lastName, String username,
                 String password, String phoneNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    // Username Validation
    public boolean checkUserName() {

        if (username.contains("_") && username.length() <= 5) {
            return true;
        } else {
            return false;
        }
    }

    // Password Validation
    public boolean checkPasswordComplexity() {

        // Password must be at least 8 characters long
        if (password.length() < 8) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasNumber = false;
        boolean hasSpecialCharacter = false;

        for (int i = 0; i < password.length(); i++) {

            char character = password.charAt(i);

            if (Character.isUpperCase(character)) {
                hasUpperCase = true;

            } else if (Character.isDigit(character)) {
                hasNumber = true;

            } else if (!Character.isLetterOrDigit(character)) {
                hasSpecialCharacter = true;
            }
        }

        return hasUpperCase && hasNumber && hasSpecialCharacter;
    }

    // Cellphone validation should start with +27
    public boolean checkCellphoneNumber() {

        if (phoneNumber.startsWith("+27")
                && phoneNumber.length() == 12) {

            for (int i = 3; i < phoneNumber.length(); i++) {

                if (!Character.isDigit(phoneNumber.charAt(i))) {
                    return false;
                }
            }

            return true;

        } else {
            return false;
        }
    }
    public String registerUser(){
        String message = "";
        if (checkUserName()){
            message += "Username successfully captured.\n";
        }else{
            message+= "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than 5 characters.";
            
        }
        if (checkPasswordComplexity()){
            message += "password successfully captured.\n";
        }else{
            message+= "password is not correctly formatted; please ensure that your password contains atleast 8 characters, a capital letter, a special character, and a number ";
            
        }
    if (checkCellphoneNumber() ){
     message += "Cellphone number successfully added.\n";
    }else{
        message += "cellphone number is not correctly formatted or does not contain the international code: +27";
    }
    return message;
    
    }
    public boolean loginUser (){
        if(enteredUsername.equals(username)
                &&
                enteredPassword.equals(password)){
        return true;
     }else{
       return false;
            }     
                
    }
     public String returnloginStatus(){
         if (loginUser()){
             return "welcome " +firstName + " " + lastName + ",it is great to see you again";
         }else{
             return"Username or password is incorrect, please try again.";
                     
                     
         }
     }
}
    

