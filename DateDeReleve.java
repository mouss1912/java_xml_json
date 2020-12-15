package fr.diginamic.xml;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.XmlAttribute;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name= "dateDeReleve")
public class DateDeReleve {
	@XmlValue
	private String dateDeReleve;
	
	@XmlAttribute
	private String format;
	
	/* Getters and Setters */
	
	public String getDateDeReleve() {
		return dateDeReleve;
	}

	public void setDateDeReleve(String dateDeReleve) {
		this.dateDeReleve = dateDeReleve;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}
	
	/* Getters and Setters */
	public String getInfo() {
		return dateDeReleve + " " + format;
	}
	
}
