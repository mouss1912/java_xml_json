package fr.diginamic.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name= "PIB")
public class Pib {
	@XmlValue
	private double PIB ;
	
	@XmlAttribute
	private String unite;



		public double getPIB() {
			return PIB;
		}

		public void setPIB(double pIB) {
			PIB = pIB;
		}

		public String getUnite() {
			return unite;
		}

		public void setUnite(String unite) {
			this.unite = unite;
		}
		
		// method
				public String getInformation() {
					return PIB + " " + unite;
				}
	
	

}
