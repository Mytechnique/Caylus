package fi.jamk.caylus;


import java.util.ArrayList;
import java.util.Arrays;


/** 
 * 
 * @author Mythe 
 */ 

public class Player extends PlayerResources {
    
    private String name;
    private Worker[] playerWorker;
    private Disc[] playerDisc;
    private House[] playerHouse;
    private Resources playerRes;
    

    public Player(String name) {
        // 1. money, 2. food, 3. wood, 4. stone, 5. silk, 6.gold, 7.rep, 8.aut
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Worker[] getWorker(){
        return this.playerWorker;
    }
    
    public String playerInfo(){
        return "This players name is" + name + " and he has the following resources to use: " + this.playerRes ;
    }
}