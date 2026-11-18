

PROG5121 Part 3 ChatApp

student Details

- Student Name: Saxola Masoka
- Student Number:ST10520212
- Module:PROG5121 - Programming 1A
- Assessment: Part 3

Project Overview

This Java console application builds on the ChatApp registration, login, and messaging features for PROG5121 Part 3. After registering and logging in, a user can send, disregard, or store messages. Stored messages can be loaded from a JSON file and managed through a menu with search, deletion, and reporting options.

Features

- Validates usernames for an underscore and a maximum length of five characters
- Checks password complexity requirements
- Validates South African cellphone numbers in international format (`+27` followed by nine digits)
- Registers users and authenticates login credentials
- Displays a welcome message using the user's first and last name
- Creates ten-digit message IDs and message hashes
- Lets users send, disregard, and store messages
- Saves stored messages to `messages.json` and loads them when opening the stored messages menu
- Displays sender and recipient information for stored messages
- Finds and displays the longest stored message
- Searches for a stored message by message ID
- Searches sent and stored messages by recipient cellphone number
- Deletes messages using their message hash
- Displays a full message report
- Includes JUnit tests for login and message features

Technologies Used

- Java 25
- Apache Maven
- NetBeans
- JUnit 5
- GitHub

Project Structure

The Maven project is in the ChatAppPart1 folder.

- src/main/java/com/mycompany/chatapppart1/Main.java - Runs the console application, handles user input, and displays the main and stored messages menus.
- src/main/java/com/mycompany/chatapppart1/Login.java - Handles registration, validation, and login logic.
- src/main/java/com/mycompany/chatapppart1/Message.java - Handles message validation, IDs, hashes, sending, storage, loading, searching, deletion, and reports.
- src/test/java/com/mycompany/chatapppart1/LoginTest.java - Tests registration and login features.
- src/test/java/com/mycompany/chatapppart1/MessageTest.java - Tests message features, including storage and message management.
- pom.xml - Maven project configuration and dependencies.
- messages.json - Default JSON file used to store messages.

How to Run

1. Open the ChatAppPart1 folder as a Maven project in NetBeans.
2. Make sure Java 25 is configured for the project.
3. Run Main.java from the com.mycompany.chatapppart1 package.
4. Follow the registration and login prompts in the console, then choose options from the QuickChat menus.

Testing

JUnit tests are located in LoginTest.java and MessageTest.java. They cover valid and invalid usernames, passwords, cellphone numbers, login results, message length, message IDs, hashes, message actions, and Part 3 message operations such as searching, deleting, and displaying stored-message information.

To run the tests with Maven, open a terminal in the ChatAppPart1 folder and run:

`mvn test`

Regex Reference

The Message class checks cellphone numbers using this Java regular expression: `\\+27[0-9]{9}`. It matches `+27` followed by exactly nine digits. This represents the international format where the leading 0 from a South African national cellphone number is omitted.

The Login class performs the equivalent check by verifying that the number begins with `+27`, has 12 characters in total, and contains only digits after the prefix.


The Login class performs the equivalent check by verifying that the number begins with +27, has 12 characters in total, and contains only digits after the prefix.



