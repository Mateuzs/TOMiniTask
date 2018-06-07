package main.Games;

public class FootballGame extends Game {

	 public FootballGame(String name){
	        this.name = name;
	        this.type = Types.football;
	    }
	 
	 @Override
	   public boolean equals(Object obj) {
	       if (this == obj)
	           return true;
	       if (obj == null)
	           return false;
	       if (getClass() != obj.getClass())
	           return false;

	       FootballGame other = (FootballGame) obj;

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
