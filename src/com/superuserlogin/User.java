package com.superuserlogin;

import java.io.Serializable;

public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;
	private String name;
	private String role;
	
//	public User(String userName, String password, String name) {
//		this.userName = userName;
//		this.password = password;
//		this.name = name;
//	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
//if (userLogin == true && !user.isSuperUser()) {
//	System.out.println("Welcome " + user.getName());
//	System.out.println("Please choose from the following options:\r\n"
//			+ "\r\n"
//			+ "(1) Update username\r\n"
//			+ "\r\n"
//			+ "(2) Update password\r\n"
//			+ "\r\n"
//			+ "(3) Update name\r\n"
//			+ "\r\n"
//			+ "(4) Exit");
//	 if (userGuiSelect == 1) {
//		System.out.println("Update Username");
//	}else if (userGuiSelect == 2) {
//		System.out.println("Update password");
//	}else if (userGuiSelect == 3) {
//		System.out.println("Update name");
//	}else if (userGuiSelect == 4) {
//		System.out.println("Exit");
//}
//}
//
//
//if (userLogin == true && user.isSuperUser()) {
//	System.out.println("Welcome " + user.getName());
//	
//	userGuiSelect = guiService.userSelection("Please choose from the following options:\r\n"
//			+ "\r\n"
//			+ "(0) Log in as another user\r\n"
//			+ "\r\n"
//			+ "(1) Update username\r\n"
//			+ "\r\n"
//			+ "(2) Update password\r\n"
//			+ "\r\n"
//			+ "(3) Update name\r\n"
//			+ "\r\n"
//			+ "(4) Exit");
//	switch (userGuiSelect) {
//	case 0:
//		guiService.askUser("Which user would you like to login as? (Type in a valid username)");
//		
//		break;
//	case 1:
//		break;
//	case 2:
//		break;
//	case 3:
//		break;
//	case 4:
//		break;
//	}
//	if (userGuiSelect == 0) {
//		System.out.println("Change User");
//	}else if (userGuiSelect == 1) {
//		System.out.println("Update Username");
//	}else if (userGuiSelect == 2) {
//		System.out.println("Update password");
//	}else if (userGuiSelect == 3) {
//		System.out.println("Update name");
//	}else if (userGuiSelect == 4) {
//		System.out.println("Exit");
//	}
//}
