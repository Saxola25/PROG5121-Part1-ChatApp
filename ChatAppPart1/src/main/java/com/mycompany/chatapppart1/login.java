/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapppart1;

/**
 *
 * @author Student
 */
public class login {
    
    //Declare variables that are going to be used by the user
    String username;
    String password;
    String phoneNumber;
    String firstName;
    String lastName;
    /*
    *constructor used to initialise the users registation details.
    *The values entered by the userare assignedto the class variables.
    */
    public  login (String firstName, String lastName,String username, String password, String phoneNumber){
      this.firstName = firstName;
      this.lastName = lastName;
      this.username = username;
      this.password = password;
      this.phoneNumber = phoneNumber;
    }
    
    // Username Validation
    public boolean checkUserName(){
        if (username.contains("_")&& username.length()<=5){
            return true;
        }else
            return false;
    } 
}
        
        // Password Validation
         public boolean checkPasswordComplexity(String password){
            
            boolean hasCapital = false;
            boolean hasNumber = false;
            boolean hasSpecial = false;
            
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                
                if (Character.isUpperCase((c))){
                    hasCapital = true;
                }else if (Character.isDigit(c)) {
                    hasNumber = true;
                }else if (!Character.isLetterOrDigit(c)){
                hasSpecial = true;
            
                }
            }
         return password.length()>= 8 && hasCapital && hasNumber && hasSpecial;
         }
        
        //cellphhone validation should start with +27
        
        public boolean checkCellphoneNumber(String phone){
            return phone.startsWith("+27") && phone.length()<=12;
        }
            //Register Validation
           
        
            public String registerUser(){
                String message = "";
            
                
                if (checkUserName()){
                    message +=  "Username is not correctly forrmatted;please ensure that the username contains an underscore and is no more than five characters in lenth.";
                }else{ 
                    message+= "Username is not correctly forrmatted;please ensure that the username contains an underscore and is no more than five characters in lenth."
                } 
                    
                    
                    
                    
                  if (!checkPasswordComplexity(password)) { 
return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
                  }
if (!checkCellphoneNumber(phoneNumber)) { 
return "Cell phone number incorrectly formatted or does not contain international code."; 
} 




// login in details the user should enter
// details should be the same with the registration details

    
    //login feature
    public boolean loginUser(){
        return username.equals(username) && this.password.equals(password);
    }


                
            
        
    


