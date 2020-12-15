package fr.diginamic.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name= "donneesEconomiques")
public class DonneesEconomiques {
	@XmlElement(name="PIB")
	protected Pib pib;
		
	@XmlElement
	protected String monnaie;

	/*---------Getters and Setters-----------*/
	public Pib getPib() {
		return pib;
	}

	public void setPib(Pib pib) {
		this.pib = pib;
	}

	public String getMonnaie() {
		return monnaie;
	}

	public void setMonnaie(String monnaie) {
		this.monnaie = monnaie;
	}
	
	
	

}
