package fr.diginamic.xml;
import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ParseListePays {

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		JAXBContext context= JAXBContext.newInstance(ListePays.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		ListePays listPays = (ListePays) unmarshaller.unmarshal(new File("/Users/moussa/eclipse-workspace/parseXML/src/main/resources/tp1.xml"));
		
		List<Pays> maListe=listPays.getPays();	
		
		
		for (Pays pays : maListe) {
			System.out.println("nom : "+pays.getNom());
			System.out.println("date de relevé : "+pays.getDateDeReleve());
			System.out.println("population : "+pays.getDonneesDemographiques().getPopulation().getInformation());
			System.out.println("taux de fecondité : "+pays.getDonneesDemographiques().getFecondite().getInformation());
			System.out.println("pib : "+pays.getDonneesEconomiques().getPib().getInformation());
			System.out.println("monnaie : "+pays.getDonneesEconomiques().getMonnaie());
		}
		
	
	}

}
