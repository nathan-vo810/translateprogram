package org.vgu.cs2014.translateprogram;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class TestFile {
	public static void test() throws IOException, ClassNotFoundException{
		boolean flag = true;

		List<PerformedTranslation> storedTrans = new ArrayList<PerformedTranslation>();
		FileInputStream fis = new FileInputStream("store.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		storedTrans =  (List<PerformedTranslation>) ois.readObject();

		List<PerformedTranslation> performedTrans = new ArrayList<PerformedTranslation>();
		performedTrans = DBAccess.loadTrans();

		//First Test
		for (int i=0; i < performedTrans.size(); i++) {
			if(performedTrans.get(i).equals(storedTrans.get(i))) {
				System.out.println(performedTrans.get(i).numEng + "\t" + performedTrans.get(i).numGer);
				flag = false;
			}
		}
		System.out.println("Stored Translation List: ");
		for (int i=0; i < storedTrans.size(); i++) {
			System.out.println(storedTrans.get(i).numEng + "\t" +storedTrans.get(i).numGer);
		}

		System.out.println("Loaded Translation List: ");
		for (int i=0; i < performedTrans.size(); i++) {
			System.out.println(performedTrans.get(i).numEng + "\t" +performedTrans.get(i).numGer);
		}

		if(flag)
			System.out.println("Result of 1st test: File OK.\n------------------------");
		else System.out.println("Result of 1st test: File damaged.\n------------------------");

		// Second Test
		PerformedTranslation tmp = new PerformedTranslation("fünf", "five");
		storedTrans.add(tmp);

		// Report
		System.out.println("Stored Translation List: ");
		for (int i=0; i < storedTrans.size(); i++) {
			System.out.println(storedTrans.get(i).numEng + "\t" +storedTrans.get(i).numGer);
		}

		System.out.println("Loaded Translation List: ");
		for (int i=0; i < performedTrans.size(); i++) {
			System.out.println(performedTrans.get(i).numEng + "\t" +performedTrans.get(i).numGer);
		}

		if(performedTrans.size() != storedTrans.size()){
			flag = false;
		}
		else{
			for (int i=0; i < performedTrans.size(); i++) {
				if(performedTrans.get(i).equals(storedTrans.get(i))) {
					System.out.println(performedTrans.get(i).numEng + "\t" + performedTrans.get(i).numGer);
					flag = false;
				}
			}
		}

		if(flag)
			System.out.println("Result of 2nd test: File OK.\n------------------------");
		else System.out.println("Result of 2nd test: File damaged.\n------------------------");

	}
}
