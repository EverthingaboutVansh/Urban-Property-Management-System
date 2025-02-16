
public class PropertyTest {
    public static void main(String[] args) {
        Property p1 = new Property();
        Property p2 = new Property("A2/1 first floor front side paschim vihar", "new delhi-110063", "7065316118", "n/a", "n/a");
        
        //test null constructor
        System.out.println(p1);
	//test the full argument constructor
	System.out.println(p2);
        
        //Test the set method(Address)
        p1.setAddress_("");
        System.out.println(p1.toString());
        
        //Test the set method(Beds)
        p1.setBeds_("");
        System.out.println(p1.toString());
        
        //Test the set method(Property Type)
        p1.setPropertyType_("");
        System.out.println(p1.toString());
        
        //Test the set method(Rent)
        p1.setRentAmount_("");
        System.out.println(p1.toString());
        
        //Test the set method(Property Status)
        p1.setPropertyStatus_("");
        System.out.println(p1.toString());
        
        //test the get method(Address)
	System.out.println(p1.getAddress_());
        
        //test the get method(Beds)
	System.out.println(p1.getBeds_());
        
        //test the get method(Property Type)
	System.out.println(p1.getPropertyType_());
        
        //test the get method(Rent)
	System.out.println(p1.getRentAmount_());
        
        //test the get method(Property Status)
	System.out.println(p1.getPropertyStatus_());
}
}