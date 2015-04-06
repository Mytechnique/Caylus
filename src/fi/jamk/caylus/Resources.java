package fi.jamk.caylus;


/** 
 * 
 * @author Mythe 
 */ 

public class Resources {

    private int money, food, wood, stone, silk, gold, rep, aut;

    public Resources(int money, int food, int wood, int stone, int silk, int gold, int rep, int aut){
        this.money = money;
        this.food = food;
        this.wood = wood;
        this.stone = stone;
        this.silk = silk;
        this.gold = gold;
        this.rep = rep;
        this.aut = aut;
    }
    
 public void addMoney(int i){
        this.money = money + i;
    }
    public void subMoney(int i){
        this.money = money - i;
    }
    public void addFood(int i){
        this.food = food + i;
    }
    public void subFood(int i){
        this.food = food - i;
    }
    public void addWood(int i){
        this.wood = wood + i;
    }
    public void subWood(int i){
        this.wood = wood - i;
    }
    public void addStone(int i){
        this.stone = stone + i;
    }
    public void subStone(int i){
        this.stone = stone - i;
    }
    public void addSilk(int i){
        this.silk = silk + i;
    }
    public void subSilk (int i){
        this.silk = silk - i;
    }
    public void addGold(int i){
        this.gold = gold + i;
    }
    public void subGold(int i){
        this.gold = gold - i;
    }
    public void addRep(int i){
        this.rep = rep + i;
    }
    public void subRep(int i) {
        this.rep = rep - i;
    }
    public void addAut(int i) {
        this.aut = aut + i;
    }
    public void subAut(int i) {
        this.aut = aut - i;
    }

    public int getMoney() {
        return money;
    }

    public int getFood() {
        return food;
    }

    public int getWood() {
        return wood;
    }

    public int getStone() {
        return stone;
    }

    public int getSilk() {
        return silk;
    }

    public int getRep() {
        return rep;
    }

    public int getAut() {
        return aut;
    }
  
    public int getGold(){
        return gold;
    }
    
    public String resourcesInfo(){
        return "Money: " + this.money + "Food: " + this.food + "Wood: " + this.wood + "Stone: " + 
                this.stone + "Silk: " + this.silk + "Gold: " + this.gold + "Reputation: " + this.rep 
                + "Authority: " + this.aut;
    }
    
    }
    
