
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class propertySaveTester {
    public static void main(String[] args) throws Exception {
        // construct a fitness class
        Landlord one = new Landlord("Vansh Kapoor", "paschim vihar", "7065316118", "2468965R", "Up to date");
        Landlord two = new Landlord("Ram Kapoor", "punjabi bagh", "9650073096", "3928652R", "Up to date");
        ArrayList<Landlord> landlordList = new ArrayList<Landlord>();
        landlordList.add(one);
        landlordList.add(two);
        
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("files/landlordTest.data"));
   		os.writeObject(landlordList);
   		os.close();
    }
}
