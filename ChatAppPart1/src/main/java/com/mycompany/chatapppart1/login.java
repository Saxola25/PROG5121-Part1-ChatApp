/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.chatapppart1;

/**
 *The Login class handles the registration and login functionality
 * of the ChatApp application
 * @author Student
 */
public class Login {

    //Variables used to store the user's registration information
    private String username;
    private String password;
    private String phoneNumber;

    //Variables used to store the information entered during login
    private String enteredUsername;
    private String enteredPassword;

    //Variables used to store the user's first and last name
    private String firstName;
    private String lastName;

    /*
    *Constructor used to initialise the user's registration details.
    *The values entered by the user are assigned to the class variables.
    */

    public Login (String firstName, String lastName, String username, String password, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;

    }
    /*
     * This method sets the user's password.
     * It is used to store the password entered by the user
     * after the Login object has been created.
     */
    public void setPassword(String password){
        this.password = password;
    }

    /*
     * This method sets the user's cellphone number.
     * It is used to store the cellphone number entered by
     * the user after the Login object has been created.
     */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    /*
     * This method returns the user's registered username.
     * It allows other classes to access the username without
     * directly accessing the private variable.
     */
    public String getUsername(){
        return username;
    }

    /*
     * This method sets the username entered during login.
     * It is used to store the username entered by the user
     * when attempting to log in.
     */
    public void setEnteredUsername(String enteredUsername){
        this.enteredUsername = enteredUsername;
    }

    /*
     * This method sets the password entered during login.
     * It is used to store the password entered by the user
     * when attempting to log in.
     */
    public void setEnteredPassword(String enteredPassword){
        this.enteredPassword = enteredPassword;
    }
    /*
     *This method checks whether the username is correctly formatted.
     *The username must contain an underscore and must not be
     *more than five characters long.
     */
    public boolean checkUserName(){
    //Check whether the username contains an underscore
    //and is no more than five characters long
    return username.contains("_") && username.length()<=5;
    }
    /*
     *This method checks whether the password meets the required
     *complexity rules.
     *
     *The password must:
     *-Have at least 8 characters
     *-Contain an uppercase letter
     *-Contain a number
     *-Contain a special character
     */

     public boolean checkPasswordComplexity(){
         //Boolean variables are used to keep track of whether
         //each password requirement has been found.
     boolean hasUppercase = false;
     boolean hasNumber = false;
     boolean hasSpecialCharacter = false;

     //If the password has fewer than 8 characters,
     //it is automatically invalid.
     if (password.length()< 8){
         return false;
     }

     //Loop through each character in the password.
     for (int i = 0; i < password.length(); i++){

         //Store the current character in the password.
         char character = password.charAt(i);

         //Check whether the character is an uppercase letter.
         if (Character.isUpperCase(character)){
             hasUppercase = true;
         }

         //Check whether the character is a number.
         if (Character.isDigit(character)){
             hasNumber = true;
         }

         //Check whether the character is not a letter or number.
         //If so, it is considered a special character.
         if (!Character.isLetterOrDigit(character)){
             hasSpecialCharacter = true;
         }
     }

     //The password is valid only if all three requirements
     //have been met.
     if (hasUppercase && hasNumber && hasSp
    

