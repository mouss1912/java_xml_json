package fr.diginamic.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlAttribute;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name= "donneesDemographiques")
public class DonneesDemographiques {
	@XmlElement
	protected Population population;
		
	@XmlElement
	protected Fecondite fecondite;
	
	/*---------Getters and Setters-----------*/

	public Population getPopulation() {
		return population;
	}

	public void setPopulation(Population population) {
		this.population = population;
	}

	public Fecondite getFecondite() {
		return fecondite;
	}

	public void setFecondite(Fecondite fecondite) {
		this.fecondite = fecondite;
	}
	


}
