package dataProvider;

import managers.FileReaderManager;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import gherkin.deps.com.google.gson.JsonParser;

public class JSONDataReader {

	private static String customerFilePath = FileReaderManager.getInstance().getConfigReader().getTestDataResourcePath()+ "Customer.json";
	
	public static JSONArray readJSON() throws IOException, org.json.simple.parser.ParseException
	{
		JSONParser parser = new JSONParser();
		FileReader reader = new FileReader(customerFilePath);
		//Read JSON
		Object obj = parser.parse(reader);
		JSONArray userList = (JSONArray) obj;
		return userList;
	}
	 
}