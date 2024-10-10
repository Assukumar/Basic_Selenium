package practice;

import java.io.FileReader;

import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

public class DataFromJosn {
 @Test
 public void m1() throws Exception {
	 JSONParser parcer=new JSONParser();
	 Object obj=parcer.parse(new FileReader("C:\\Users\\devee\\OneDrive\\Desktop\\Selenium\\DATA_LIB\\Data.josn"));
      JsonObject map=(JsonObject)obj;
      String s = map.get("timeout").toString();
      System.out.println(s);
 
 }
}
