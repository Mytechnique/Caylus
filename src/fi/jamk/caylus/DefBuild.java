/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.caylus; 

/** 
 * 
 * @author Mythe 
 */ 

public class DefBuild extends Resources {
    
    
    
    public DefBuild(){
        super(0,0,0,0,0,0,0,0);
    }
    
    public int defGoldMine(){
        DefBuild defGoldMine = new DefBuild();
        defGoldMine.addGold(1);
        
        return defGoldMine.getGold();
    }
}
