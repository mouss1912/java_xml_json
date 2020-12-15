package fr.diginamic.xml;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name= "pays")
public class Pays {
	
	@XmlElement
	private String nom;
	
	@XmlElement
	private DateDeReleve dateDeReleve;
	
	
	@XmlElement
	private DonneesDemographiques donneesDemographiques;
	
	
	@XmlElement
	private DonneesEconomiques donneesEconomiques;


	/*---------Getter ant setter----------------*/
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public DateDeReleve getDateDeReleve() {
		return dateDeReleve;
	}


	public void setDateDeReleve(DateDeReleve dateDeReleve) {
		this.dateDeReleve = dateDeReleve;
	}


	public DonneesDemographiques getDonneesDemographiques() {
		return donneesDemographiques;
	}


	public void setDonneesDemographiques(DonneesDemographiques donneesDemographiques) {
		this.donneesDemographiques = donneesDemographiques;
	}


	public DonneesEconomiques getDonneesEconomiques() {
		return donneesEconomiques;
	}


	public void setDonneesEconomiques(DonneesEconomiques donneesEconomiques) {
		this.donneesEconomiques = donneesEconomiques;
	}
	
	
}
