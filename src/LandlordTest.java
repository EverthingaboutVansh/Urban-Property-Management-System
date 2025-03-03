
public class LandlordTest {
    public static void main(String[] args) {
        Landlord l1 = new Landlord();
	Landlord l2 = new Landlord("Vansh Kapoor", "8/4 west punjabi bagh, punjabi bagh club road new delhi-110026", "7065316159", "n/a", "Available");
        
        //Test the Null Constructor
        System.out.println(l1);
        
        //Test the Full argument Constructor
	System.out.println(l2);
        
        //Test the set method(Name)
        l1.setName("ram");
        System.out.println(l1.toString());
        
        //Test the set method(Address)
        l1.setAddress("8/4 west punjabi bagh");
        System.out.println(l1.toString());
        
        //Test the set medhod(PhoneNumber)
        l1.setPhoneNumber("9650073098");
        System.out.println(l1.toString());
        
        //Test the set medhod(PpsNumber)//pps =personal phone number
        l1.setPpsNumber("7290970797");
        System.out.println(l1.toString());
        
        //Test the set medhod(LandlordStatus)
        l1.setLandlordStatus("Available");
        System.out.println(l1.toString());
        
        //test the get method(Name)
	System.out.println(l1.getName());
        
        //test the get method(Address)
	System.out.println(l1.getAddress());
        
        //test the get method(PhoneNumber)
	System.out.println(l1.getPhoneNumber());
        
        //test the get method(PpsNumber)
	System.out.println(l1.getPpsNumber());
        
        //test the get method(LandlordStatus)
	System.out.println(l1.getLandlordStatus());
    }
}
