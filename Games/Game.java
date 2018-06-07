package main.Games;

import main.Totalizator;

public abstract class Game {
	
	protected String scores;
	protected String name;
	protected Totalizator totalizator;
	protected Types type;
	
	public String getName(){
        return name;
    }

    public String getScores(){
        return scores;
    }

    public void updateScores(String scores){
        this.scores = scores;

        if(totalizator != null) {
            totalizator.updateScoreNotification(this);
        }else{
            System.out.println("You are not in any totalizator subscription");
        }
    }


    public void setTotalizator(Totalizator totalizator) {
    	this.totalizator=totalizator;
    }


    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public abstract boolean equals(Object obj) ;



}
