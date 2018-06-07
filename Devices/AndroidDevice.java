package main.Devices;

public class AndroidDevice extends Device{
	
	public AndroidDevice(String name) {
		
	    	   this.type = "Android";
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

	       AndroidDevice other = (AndroidDevice) obj;

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
