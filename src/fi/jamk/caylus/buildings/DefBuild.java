/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk.caylus.buildings;

/**
 *
 * @author Omistaja
 */
public class DefBuild extends Resources {

    public DefBuild(int money, int food, int wood, int stone, int silk, int gold, int rep, int aut) {
        super(money, food, wood, stone, silk, gold, rep, aut);
    }

    DefBuild defGoldMine = new DefBuild(0,0,0,0,0,0,0,0);

}
