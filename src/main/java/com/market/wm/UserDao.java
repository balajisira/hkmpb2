package com.market.wm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonReader;

import com.market.wm.domain.User;

public class UserDao {
	public List<User> getAllUsers() {
		List<User> userList = null;
		try {
			// File file = new File("hkmpb2/data/loginInfo.dat");
			File file = new File("C:/Dev/workSpace/tool/hkmpb2/src/main/webapp/data/loginInfo.dat");
			
			if (!file.exists()) {
				System.out.println("File does not  exists" + file.getAbsolutePath());
				User user = new User("1@2.3", "TEST USER", "Dummy", "123");
				userList = new ArrayList<User>();
				userList.add(user);
				saveUserList(userList);
			} else {
				System.out.println("File exists");
				FileInputStream fis = new FileInputStream(file);
				
				JsonReader jsonReader;
				System.out.println("File exists :" + file.exists());
				jsonReader = Json.createReader(new FileInputStream(file));
				
				JsonArray objectArray = jsonReader.readArray();
				System.out.println(objectArray);
				jsonReader.close();
				userList = Json2ObjectAdapter.convertToUserArray(objectArray);
			}
		} catch (IOException e) {
			System.out.println("Exception :" + e.getMessage());
			e.printStackTrace();
		}
		return userList;
	}
	
	private void saveUserList(List<User> userList) {
		try {
			File file = new File("Users.dat");
			FileOutputStream fos;
			
			fos = new FileOutputStream(file);
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(userList);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
