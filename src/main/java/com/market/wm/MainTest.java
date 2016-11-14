package com.market.wm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonReader;

public class MainTest {
	public static void main(String[] args) {
		File file = new File("C:/Dev/workSpace/tool/hkmpb2/src/main/webapp/data/loginInfo.dat");
		JsonReader jsonReader;
		System.out.println("File exists :" + file.exists());
		try {
			jsonReader = Json.createReader(new FileInputStream(file));
			
			JsonArray objectArray = jsonReader.readArray();
			System.out.println(objectArray);
			jsonReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
