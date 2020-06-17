
	
	package Jaxb;

	 import javax.xml.bind.annotation.XmlElement;
	import javax.xml.bind.annotation.XmlRootElement;

	 

	@XmlRootElement(name="TestName")
	public class ConstructorDemo {
	    private String empName, empID, empLocation ;
	    private int empLevel;
	    @XmlElement    
	    public String getEmpName() {
	        return empName;
	    }
	    public void setEmpName(String empName) {
	        this.empName = empName;
	    }
	    
	    @XmlElement    
	    public String getEmpID() {
	        return empID;
	    }
	    public void setEmpID(String empID) {
	        this.empID = empID;
	    }
	    
	    @XmlElement
	    public String getEmpLocation() {
	        return empLocation;
	    }
	    public void setEmpLocation(String empLocation) {
	        this.empLocation = empLocation;
	    }
	    
	    @XmlElement
	    public int getEmpLevel() {
	        return empLevel;
	    }
	    public void setEmpLevel(int empLevel) {
	        this.empLevel = empLevel;
	    }
	    
	    public ConstructorDemo(String empName, String empID, String empLocation, int empLevel) {
	        super();
	        this.empName = empName;
	        this.empID = empID;
	        this.empLocation = empLocation;
	        this.empLevel = empLevel;
	    }
	    public ConstructorDemo() {
	        super();
	    }
	    

	 

	}


