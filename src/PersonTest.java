
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Sapna Kapoor", "A2/1 Paschim vihar ", "9910413368", "n/a");

        //test null constructor
        System.out.println(p1);
	//test the full argument constructor
	System.out.println(p2);
        
        //Test the set method(Name)
        p1.setName("Sapna Kapoor");
        System.out.println(p1.toString());
        
        //Test the set method(Name)
        p1.setAddress("A2/1 Paschim vihar ");
        System.out.println(p1.toString());
        
        //Test the set method(Phone Number)
        p1.setPhoneNumber("9910413368");
        System.out.println(p1.toString());
        
        //Test the set method(PPS Number)
        p1.setPpsNumber("n/a");
        System.out.println(p1.toString());
        
        //test the get method(Name)
	System.out.println(p1.getName());
        
        //test the get method(Address)
	System.out.println(p1.getAddress());
        
        //test the get method(Phone Number)
	System.out.println(p1.getPhoneNumber());
        
        //test the get method(PPS Number)
	System.out.println(p1.getPpsNumber());
}
}
