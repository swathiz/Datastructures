package gs;

import java.util.HashMap;
import java.util.Map;

public class Ip {
	
	public static void main(String[] args) {
		String[] input = {"10.0.0.1 sathish","10.0.0.2 Vinay","10.0.0.3 Deepa","10.0.0.3 Deepa"};
		System.out.println(findIp(input));
		
	}
		
	public static String findIp(String[] input) {
		Map<String, Integer> ipCount = new HashMap<>();
		
		if(input == null || input.length == 0) {
			return "invalid";
		}
		
		for (String entry:input) {
			String[] p = entry.split(" ");
			String ip = p[0];
			ipCount.put(ip,ipCount.getOrDefault(ip,0)+1);
		}
		
		String maxIp = null;
		int maxCount = 0;
		
		for (Map.Entry<String,Integer> entry:ipCount.entrySet()) {
			if(entry.getValue()>maxCount) {
				maxIp =entry.getKey();
				maxCount= entry.getValue();
			}
			
		}
		return maxIp;
	}

}
