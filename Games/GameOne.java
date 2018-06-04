package main.Games;

import main.main;

public class GameOne implements IGame {

    private String scores;
    private String name;

    public GameOne(String name){
        this.name = name;
    }


    public String getName(){
        return name;
    }

    public String getScores(){
        return scores;
    }

    public void updateScores(String scores){
        this.scores = scores;
    }


    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GameOne other = (GameOne) obj;
        if ( name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}
