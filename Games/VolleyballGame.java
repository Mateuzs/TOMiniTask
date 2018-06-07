package main.Games;

public class VolleyballGame extends Game {
	
	public VolleyballGame(String name){
        this.name = name;
        this.type = Types.volleyball;
    }
 
 @Override
   public boolean equals(Object obj) {
       if (this == obj)
           return true;
       if (obj == null)
           return false;
       if (getClass() != obj.getClass())
           return false;

       VolleyballGame other = (VolleyballGame) obj;

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
