package org.vgu.cs2014.translateprogram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class TestFiles {
	public static boolean test() throws IOException, ClassNotFoundException{
		boolean flag = true;

		List<PerformedTranslation> storeList = new ArrayList<PerformedTranslation>();
		FileInputStream fis = new FileInputStream("store.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		storeList =  (List<PerformedTranslation>) ois.readObject();
//		for (int i=0; i < storeList.size(); i++) {
//			System.out.println(storeList.get(i).numEng + "\t" +storeList.get(i).numGer);
//		}


		List<PerformedTranslation> performedTrans = new ArrayList<PerformedTranslation>();
		performedTrans = DBAccess.loadTrans();
//		for (int i=0; i < performedTrans.size(); i++) {
//			System.out.println(performedTrans.get(i).numEng + "\t" + performedTrans.get(i).numGer);
//		}

//		System.out.println(storeList.size() + "\t" + performedTrans.size());
		for (int i=0; i < performedTrans.size(); i++) {
			if(performedTrans.get(i).equals(storeList.get(i))) {
				System.out.println(performedTrans.get(i).numEng + "\t" + performedTrans.get(i).numGer);
				flag = false;
			}
		}
		return flag;

	}
}
