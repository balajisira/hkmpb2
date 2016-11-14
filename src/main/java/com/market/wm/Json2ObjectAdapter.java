package com.market.wm;

import java.util.ArrayList;
import java.util.List;

import javax.json.JsonArray;
import javax.json.JsonObject;

import com.market.wm.domain.User;

public class Json2ObjectAdapter {
	
	public static List<User> convertToUserArray(JsonArray objectArray) {
		List<User> userList = new ArrayList<>();
		
		for (int i = 0; i < objectArray.size(); i++) {
			JsonObject jsonData = objectArray.getJsonObject(i);
			userList.add(preparteUserFromJson(jsonData));
		}
		
		return userList;
	}
	
	private static User preparteUserFromJson(JsonObject jsonData) {
		
		User user = new User();
		user.setEmailId(jsonData.getString("emailId"));
		user.setName(jsonData.getString("name"));
		user.setRole(jsonData.getString("role"));
		return user;
	}
	
}
