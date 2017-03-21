package org.vgu.cs2014.translateprogram;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class TranslateNumber {
	public static String translate(final String numGer) {

		HashMap<String, String> numbers = new HashMap<String, String>();
		numbers.put("eins", "one");
		numbers.put("zwei", "two");
		numbers.put("drei", "three");
		numbers.put("vier", "four");
		numbers.put("funf", "five");
		numbers.put("sechs", "six");
		numbers.put("sieben", "seven");
		numbers.put("acht", "eight");
		numbers.put("neun", "nine");
		numbers.put("zehn", "ten");
		
		String result = numbers.get(numGer);
		return result;
	}
	
	public static boolean autoTest(final String funcOut, final String actualOut) {
		if (funcOut == actualOut) return true;
		return false;
	} 
	
	public static void testReport() {
		
		
	}
	
	public static void main(String[] args) {
		
		String[] inputList = {"eins", "zwei", "drei", "unknown"};
		List<PerformedTranslation> performedTrans = new ArrayList<PerformedTranslation>();
		
		boolean flag = true;
		
		System.out.println("INPUT\tEXPECTED\tOUTPUT");
		System.out.println("---------------------------------------");
		
		PerformedTranslation one = new PerformedTranslation(inputList[0],translate(inputList[0]));
		performedTrans.add(one);
		
		System.out.print(inputList[0]+"\tone\t\t"+ translate(inputList[0]));
		if (!autoTest(translate(inputList[0]), "one")) {
			System.out.println("\tERROR"); 
			flag = false;
		} else System.out.println("\tTRUE");



		PerformedTranslation two = new PerformedTranslation(inputList[1],translate(inputList[1]));
		performedTrans.add(two);
		
		System.out.print(inputList[1]+"\ttwo\t\t"+ translate(inputList[1]));
		if (!autoTest(translate(inputList[1]), "two")) {
			System.out.println("\tERROR"); 
			flag = false; 
		} else System.out.println("\tTRUE");

		PerformedTranslation three = new PerformedTranslation(inputList[2],translate(inputList[2]));
		performedTrans.add(three);
		
		System.out.print(inputList[2]+"\tthre\t\t"+ translate(inputList[2]));
		if (!autoTest(translate(inputList[2]), "thre")) {
			System.out.println("\tERROR"); 
			flag = false;
		} else System.out.println("\tTRUE");

		
		PerformedTranslation error = new PerformedTranslation(inputList[3],translate(inputList[3]));
		performedTrans.add(error);
		
		System.out.print(inputList[3]+"\tnull\t\t"+ translate(inputList[3]));
		if (!autoTest(translate(inputList[3]), null)) {
			System.out.println("\tERROR"); 
			flag = false;
		} else System.out.println("\tTRUE");
		
		System.out.println("---------------------------------------");
		if (flag) System.out.println("CONCLUSION: ALL TESTS PASSED"); 
		else System.out.println("CONCLUSION: AT LEAST 1 TEST DIDNT PASS");
		
	
		try {
			DBAccess.storeTrans(performedTrans);
			System.out.println("Store to file \"store.txt\" successfuly.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Errors occured during saving.");
		}
		
		try {
			performedTrans = DBAccess.loadTrans();
			
//			print all the numEng just loaded to test
//			for (int i=0; i < performedTrans.size(); i++) {
//				System.out.println(performedTrans.get(i).numEng);
//			}
			
			System.out.println("Load from file \"store.txt\" successfuly.");
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Errors occured during loading.");
		}
	}
}
