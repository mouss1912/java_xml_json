package fr.diginamic.xml;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {

	@Override
	public LocalDate unmarshal(String v) throws Exception {
		// TODO Auto-generated method stub
		return LocalDate.parse(v, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	@Override
	public String marshal(LocalDate v) throws Exception {
		// TODO Auto-generated method stub
		return v.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

}
