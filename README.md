# PROG5121 Part1 ChatApp
Student Details

Student Name: Saxola Masoka
Student Number: ST10520212
Module: PROG5121 - Programming 1A
Assessment: Part 1 - Registration and Login Feature

 Project Overview

This is a Java-based console application built to satisfy the registration and login requirements of PROG5121 Part 1. Users can register by providing a username, password, and South African cell phone number, and can then log in using those saved credentials.

 Features

- Validates usernames
- Enforces password complexity rules
- Verifies South African cell phone numbers via regex
- Handles new user registration
- Authenticates users on login
- Displays a welcome message using the user's first and last name
- Includes JUnit tests covering both valid and invalid input cases

 Technologies Used

- Java
- Apache Maven
- NetBeans
- JUnit
- Git and GitHub

 Project Structure

- `Main.java` - Runs the console application and manages user input.
- `Login.java` - Handles registration, input validation, and login logic.
- `LoginTest.java` - Holds the JUnit tests for Part 1 features.

 How to Run

1. Open the Maven project in NetBeans.
2. Execute `Main.java`.
3. Respond to the registration and login prompts shown in the console.

 Testing

The test suite lives in `LoginTest.java`, covering valid and invalid entries for usernames, passwords, and cell phone numbers, along with checks for both successful and failed logins and their corresponding system messages.

 Regex Reference

The regular expression used to validate South African cell phone numbers in this project is:

This pattern is based on the numbering standards set by the Independent Communications Authority of South Africa (ICASA). ICASA defines South African phone numbers as 10 digits at the national level, while the country's international dialing format uses the `+27` prefix. When the `+27` code is applied, the leading national `0` is dropped, leaving nine digits after the prefix.

