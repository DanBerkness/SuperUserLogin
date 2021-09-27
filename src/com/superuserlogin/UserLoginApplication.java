package com.superuserlogin;

import java.io.IOException;
import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) throws IOException {
		User[] users = new User[20];
		users = UserFileReader.getUsers();
		System.out.println(users);
		UserLoginMethod userLoginMethod = new UserLoginMethod();
		GuiService guiService = new GuiService();
		int userGuiSelect = 0;

//		try (FileInputStream fileInput = new FileInputStream("src/users.txt");
//				ObjectInputStream objectInput = new ObjectInputStream(fileInput);){
//			User createdUser = new User(user.getName(),user.getPassword(), null);
//		}

		for (int i = 0; i < 6; i++) {
			if (i == 5) {
				System.out.println("Too many failed login attempts, you are now locked out.");
				guiService.cleanUp();
			}

			String enteredEmail = guiService.askUser("Enter your email:");
			String enteredPassword = guiService.askUser("Enter your password:");

			for (User user : users) {
				if (enteredEmail.equals(user.getUserName()) && enteredPassword.equals(user.getPassword())) {
					System.out.println("Welcome " + user.getName());
					if (user.getRole().equals("super_user")) {
						System.out.println("U r a superuser");
					}
					else {
						System.out.println("No superuser");
					}
					break;
				} else {
					System.out.println("Invalid login, please try again");
					break;
				}
			}
		}
		System.out.println("You are signed in as a user.");
		guiService.cleanUp();
	}
}
