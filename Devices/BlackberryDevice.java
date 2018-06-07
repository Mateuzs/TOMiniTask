package main.Devices;

public class BlackberryDevice extends Device {
	
	 public BlackberryDevice(String name) {
		 
	    	   this.type = "Blackberry";
	           this.name = name;    	   
	    }
	 
	 @Override
	   public boolean equals(Object obj) {
	       if (this == obj)
	           return true;
	       if (obj == null)
	           return false;
	       if (getClass() != obj.getClass())
	           return false;

	       BlackberryDevice other = (BlackberryDevice) obj;

	       if ( name == null) {
	           if (other.name != null)
	               return false;
	       }
	       if ( type == null) {
	           if (other.type != null)
	               return false;
	       }
	       else if (!name.equals(other.name) || !type.equals(other.type))
	           return false;
	       return true;
	   }
}
