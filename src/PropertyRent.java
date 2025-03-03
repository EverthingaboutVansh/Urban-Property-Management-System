
import java.io.Serializable;


public class PropertyRent implements Serializable{
  
  private String property;
  private int propertyAvailable;
  private int propertyTaken;
    
  public void cancelProperty(){
   	  if (propertyTaken>0)
   	  	propertyTaken--;
   }
  
  public boolean takeProperty(){
   	 if (propertyTaken<propertyAvailable){
   	 	propertyTaken++;
   	 	return true;
   	 }
   	 else
   	 	return false;
   }
  
  public int placesLeft(){
   	  return propertyAvailable - propertyTaken;
   }
  
   public int available(){
   	  return propertyAvailable - propertyTaken;
   }
   
   public PropertyRent(String title, int totCapacity){
    	this.property = title;
    	this.propertyAvailable = propertyTaken;
    	propertyTaken = 0;
    }
   
   public PropertyRent(String className){
    	this(className, 2); 
    }
   
   public PropertyRent() {
    	this("Title unknown", 0);
    }
   
   public void setProperty(String property){
    	this.property = property;
    }
   
   public void setPropertyAvailable(int totCapacity){
    	this.propertyAvailable = totCapacity;
    }
   
    public String getProperty() { return property;}
    public int getPropertyAvailable() { return propertyAvailable;}
    public int getPropertyTaken() { return propertyTaken;};
    
    public String toString() {
    	return "\n Property: " + getProperty() + "\n Property Available: " + getPropertyAvailable() + 
                "\n Property Taken: " + getPropertyTaken();
    }
}
