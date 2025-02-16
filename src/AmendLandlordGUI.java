import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AmendLandlordGUI extends JFrame {
    
    private static final int WIDTH = 800;    //value 800
    private static final int HEIGHT = 500;   //value 500
    
    private JLabel nameL, addressLine1L, countyL, landLPhoneL, landlordStatusL,  landlordIDL, blankL, blank2L;
    private JTextField nameTF, addressLine1TF, countyTF, landLPhoneTF, landlordStatusTF, landlordIDTF;
    private String[] counties = {"Australia","Austria","China","Costa Rica","Cyprus","Colombia","Democratic Republic of the Congo","Denmark","Dominican Republic",
            "Dominica","Finland","Germany","India","Kuwait","Kazakhstan","Kenya","Laos","Lebanon","Luxembourg","Liberia","Lithuania","Malaysia",
            "Maldives","Mali","Oman","Romania","Saudi Arabia","Thailand","Turkey","United Arab Emirates","United States of America","Vietnam","Zimbabwe"};
    private JComboBox countyComboBox;
    private JButton addB, cancelB;
    
    public static Landlord landlord_;
    
    public AmendLandlordGUI(Landlord landlord){
        
        landlord_ = landlord;
        
        //Setting Font Properties
        Font myFont = new Font("Times New Roman", Font.BOLD, 20);
        //setBackground(Color.BLUE);
        
        
        //Instantiate the labels
        nameL = new JLabel("Landlord Name: " , SwingConstants.RIGHT);
        addressLine1L = new JLabel("Address Line 1: ", SwingConstants.RIGHT);
        //addressLine2L = new JLabel("Address Line 2: ", SwingConstants.RIGHT);
        //addressLine3L = new JLabel("Address Line 3: ", SwingConstants.RIGHT);
        countyL = new JLabel("County: ", SwingConstants.RIGHT);
        landLPhoneL = new JLabel("Contact No: ", SwingConstants.RIGHT);
        //landlordPPSL = new JLabel("Landlord's PPS Number: ", SwingConstants.RIGHT);
        landlordStatusL = new JLabel("Landlord Status: ", SwingConstants.RIGHT);
        landlordIDL = new JLabel("Landlord's ID Number: ", SwingConstants.RIGHT);
        blankL = new JLabel("", SwingConstants.RIGHT);
        blank2L = new JLabel("", SwingConstants.RIGHT);
        
        
        
        //Text Fields:
        nameTF = new JTextField(10);
        addressLine1TF = new JTextField(10);
        landLPhoneTF = new JTextField(10);
        //landlordPPSTF = new JTextField(10);
        landlordStatusTF = new JTextField(10);
        landlordIDTF = new JTextField(10);
        landlordIDTF.setEditable(false);

        
        
        //County Drop Down Menu
        countyComboBox = new JComboBox(counties);
        
        nameTF.setText(landlord_.getName());
        addressLine1TF.setText(landlord_.getAddress());
        landLPhoneTF.setText(landlord_.getPhoneNumber());
        //landlordPPSTF.setText(landlord_.getPpsNumber());
        landlordStatusTF.setText(landlord_.getLandlordStatus());
        landlordIDTF.setText(""+landlord_.getLandlordID());
        
         //Buttons:
        //Add Button
        addB = new JButton("Commit Changes");
        addB.setFont(myFont);
        addB.setToolTipText("Click to submit details to the system.\n NOTE: Make sure details are correct with landlord");
        addB.addActionListener(ae->{
            landlord_.setName(nameTF.getText());
            landlord_.setAddress(addressLine1TF.getText());
            landlord_.setPhoneNumber(landLPhoneTF.getText());
            //landlord_.setPpsNumber(landlordPPSTF.getText());
            landlord_.setLandlordStatus(landlordStatusTF.getText()); 
            
            landlordIDTF.setText(""+landlord_.getLandlordID());
            JOptionPane.showMessageDialog(null, "Landlord info updated!");
            
            /*
        String landlordname=nameTF.getText();
        //--> (X) String lastname=tflastname.getText();
        String address=addressLine1TF.getText();
        String county=countyTF.getText();
        String landlordphoneno=landLPhoneTF.getText();
        String landlordstatus=landlordStatusTF.getText();
        String landlordid=landlordIDTF.getText();
        
        //CODE FOR CHECKING OF THE TEXTFIELDS ARE EMPTY OR NOT 
        if(landlordname.isEmpty() || address.isEmpty() || county.isEmpty() || landlordphoneno.isEmpty() || landlordstatus.isEmpty() || landlordid.isEmpty()){
            JOptionPane.showMessageDialog(this,"Fill the Form Properly","Error", JOptionPane.ERROR_MESSAGE);
            //JOptionPane.showMessageDialog(null,"OTP cannot be send");
            //THIS CODE ID NOT TO BE IMPLEMENTED HERE:?????
            //String otpstr = stopOTP();
        }else{
            //START THE LANDLORD REGISTRATION PROCESS:
            landlordregister(landlordname,address,county,landlordphoneno,landlordstatus,landlordid);
            JOptionPane.showMessageDialog(null,"LandLord Details Sucessfully Saved in the Database");
        }
            */
            
        });
        
        //Cancel Button
        cancelB = new JButton("Cancel");
        cancelB.setFont(myFont);
        cancelB.addActionListener(ae->{
            setVisible(false);
            dispose();
        });
        
        setLayout(new GridLayout(11, 2));

        //Add components to the JFrame
        add(nameL);
        add(nameTF);
        add(addressLine1L);
        add(addressLine1TF);
        add(countyL);
        add(countyComboBox);
        add(landLPhoneL);
        add(landLPhoneTF);
        //add(landlordPPSL);
        //add(landlordPPSTF);
        add(landlordStatusL);
        add(landlordStatusTF);
        add(landlordIDL);
        add(landlordIDTF);
        add(blankL);
        add(blank2L);
        add(addB);
        add(cancelB);
        
        setTitle("Amend Landlord Details");
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null); 
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        toFront();
    }

    /*
    private void landlordregister(String landlordname, String address, String county, String landlordphoneno, String landlordstatus, String landlordid) {
        Connection dbconn=DBConnection.connectDB();
        if(dbconn != null){
            try {
                PreparedStatement st=(PreparedStatement)
                        dbconn.prepareStatement("INSERT INTO landlord (landlordname,address,county,landlordphoneno,landlordstatus,landlordid) VALUES(?,?,?,?,?,?)");
                
                st.setString(1,landlordname);
                st.setString(2,address);
                st.setString(3,county);
                st.setString(4,landlordphoneno);
                st.setString(5,landlordstatus);
                st.setString(6,landlordid);
                
                
                int res=st.executeUpdate();
                JOptionPane.showMessageDialog(this,"LandLord Data Inserted Sucessfully In The Database.","SUCESS", JOptionPane.INFORMATION_MESSAGE);
                
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("The Connection is not available.");
        }
*/
    
}
