package org.vgu.cs2014.translateprogram;
import java.io.Serializable;

public class PerformedTranslation implements Serializable {

	public String numEng;
	public String numGer;
	
	public PerformedTranslation(String ger, String eng) {
		this.numEng = eng;
		this.numGer = ger;
	}
	
}
