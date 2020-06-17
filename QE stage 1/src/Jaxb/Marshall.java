package Jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Marshall {
	
	public void Mardemo() throws JAXBException
	{
	ConstructorDemo cdemo = new ConstructorDemo("Bhavya","A01111","Bangalore",8);
	JAXBContext jaxb = JAXBContext.newInstance(ConstructorDemo.class);
	Marshaller Mar=jaxb.createMarshaller();
	Mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
	Mar.marshal(cdemo,System.out);
	Mar.marshal(cdemo,new File("src\\Jaxb\\Mar.xml"));
		

}
}
 