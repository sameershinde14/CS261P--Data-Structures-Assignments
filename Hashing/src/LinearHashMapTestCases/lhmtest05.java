package LinearHashMapTestCases;

import java.util.*;

import Hashing.LinearHashMap;

public class lhmtest05 {
	public static LinearHashMap map;
	public static Map<Integer,Integer> omap = new HashMap<Integer,Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Starting test case 05 for adding very huge number of keys");
		String fileName = "/src/LinearHashMapTestCases/testInput10.txt";
		long startTime = 0;
		map = Utilities.populateLinearHashMap(fileName);
		long stopTime = 0;
		omap = Utilities.populateOriginalHashMap(fileName);
		long elapsedTime = 0;
		
		
		ArrayList<Integer> vals = new ArrayList<Integer>();
		startTime = System.nanoTime();
		for(int key: map.keySet()) {
			try {
				vals.add(map.get(key));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		stopTime = System.nanoTime();
		elapsedTime = stopTime - startTime;
		System.out.println("Execution Time for getting:" + elapsedTime + " nano secs");
		
		if(Utilities.compare(map,omap))
			System.out.println("Testcase 05 successfully completed.");
		else
			System.out.println("Testcase 05 failed.");
	}

}
