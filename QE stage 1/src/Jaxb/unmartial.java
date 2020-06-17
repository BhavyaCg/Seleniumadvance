package Jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class unmartial {

	public void unmartaildemo () throws Exception
	{
		
		JAXBContext jcon=JAXBContext.newInstance(ConstructorDemo.class);        

		 Unmarshaller utest=jcon.createUnmarshaller();
		        
		ConstructorDemo TestObj1 = (ConstructorDemo)utest.unmarshal(new File("src\\JAXB\\Demo.xml"));
		        
		System.out.println("Employee Details are: ");
		System.out.println(TestObj1.getEmpName());
		System.out.println(TestObj1.getEmpID());
		System.out.println(TestObj1.getEmpLocation());
		System.out.println(TestObj1.getEmpLevel());
		
	}
}
