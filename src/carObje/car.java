package carObje;

public class car {
  
	 //değişkenler
	 private String caption;
	 private int  price;
	 private String brand;
	 private String model;
	
	 
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	//set metodları
	public void setCaption(String caption)  {
	  this.caption=caption;
		
	}
	public void setPrice(int price) {
	   this.price=price;	
	}
	
	
	
	
	    
	  
	//get methodları
	public String getCaption() {
	
	 return this.caption;
	 
	}
   public int getPrice() {
       return this.price; 
       
   }
   
 public String getBrand() {
	   return this.brand; 
	   
 }
}

	









