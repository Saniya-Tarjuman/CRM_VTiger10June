package com.cast.crm.generic.fileutility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * @author Tushar
 * JsonUtility class 
 * Use: to retrive data from Json
 */
public class JsonUtility {

	public String getDataFromJson(String filePath,String key) throws FileNotFoundException, IOException, ParseException
	{
		JSONParser jsp= new JSONParser();
		Object obj = jsp.parse(new FileReader(filePath));
		JSONObject jobj=(JSONObject)obj;
		String value = jobj.get(key).toString();
		return value;
	}



}
