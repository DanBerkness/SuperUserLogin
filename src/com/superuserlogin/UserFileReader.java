package com.superuserlogin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserFileReader {

	public static User[] getUsers() throws IOException {
		User[] users = new User[20];
		BufferedReader fileReader = null;
		String line = null;
		int userCtr = 0;
		String[] dataLine = null;
		
		
		try {
			fileReader = new BufferedReader(new FileReader("src/Users.txt"));
			while ((line = fileReader.readLine()) != null) {
				User user = new User();
				
				dataLine = line.split(",");
				user.setUserName(dataLine[0]);
				user.setPassword(dataLine[1]);
				user.setName(dataLine[2]);
				user.setRole(dataLine[3]);
				System.out.print("\n");
				users[userCtr] = user;
				userCtr++;
				if (userCtr == 20) {
					break;
				}
				
			}
		} finally {
			if (fileReader != null) {
				fileReader.close();
			}

		}
		return users;

	}
}
