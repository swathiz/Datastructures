package gs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Studentavg {
	
	public static void main(String[] args) {
		String[][] input = {
				{"a","75"},{"b","40"},{"a","70"}
		};	
		System.out.println(avg(input));
	}
	
	public static int avg(String[][] input) {
		Map<String,List<Integer>> studentMarks = new HashMap<>();
		
		if(input.length==0) {
			return 0;
		}
		for (String[] record : input) {
			String studentName = record[0];
			int mark = Integer.parseInt(record[1]);
			
			studentMarks.putIfAbsent(studentName, new ArrayList<>());
			studentMarks.get(studentName).add(mark);
		}
		int maxAvg = 0;
		for (Map.Entry<String,List<Integer>> entry:studentMarks.entrySet()) {

			List<Integer> marks = entry.getValue();
			int total = 0;
			for (int mark:marks) {
				total=total +mark;
			}
			int avg = (total/marks.size());
			if(avg>maxAvg) {
				maxAvg = avg;
			}
			maxAvg=(int) Math.floor(maxAvg);
		}
		return maxAvg;
	}

}
