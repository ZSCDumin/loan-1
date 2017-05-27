package justlike.loan.controller;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class Test {
	public static void main(String[] args) {
		/*JSONObject obj = new JSONObject();
		JSONArray arr = new JSONArray();
		String test = '"' + "test" + '"';
		arr.add(test);
		obj.put("name", "test");
		obj.put("data", arr);
		System.out.println(obj);*/
		
		List<String> inputs = new ArrayList<String>();
		inputs.add("0751");
		inputs.add("3510");
		inputs.add("0346");
		
	    
		JSONArray arr = new JSONArray();
	    for (String str:inputs) {
	    	arr.add(str);
	    }
	    JSONObject obj=new JSONObject();
	    obj.put("ddf","sss");
	    obj.put("ajiao",arr);
	    System.out.println(obj);

	}
}
