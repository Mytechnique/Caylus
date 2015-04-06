package fi.jamk.caylus;

/* 

MORO REISCA WITTU

*/

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;


/** 
 * 
 * @author Mythe 
 */ 

public class Caylus extends Canvas implements Runnable {

    public static final int WIDTH = 1920, HEIGHT = 1080;
    
    private boolean running = false;
    private Thread thread;
    
    private Handler handler;
    
    
    public Caylus(){
       Window game = new Window(WIDTH, HEIGHT, "Caylus", this);
       game.addPanel(500,500,500,500);
    }
    
    
    public synchronized void start(){
        if(running)
            return;
        
        running = true;
        thread = new Thread(this);
        thread.start();
    }
    
    public synchronized void stop(){
        try {
             thread.join(); // Adds all threads together and waits for them to die
             running = false;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    
    // Game loop starts here
    // Made so fps is max 60
    
    public void run(){ 
        long lastTime = System.nanoTime();
        final double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        int updates = 0;
        int frames = 0;
        long timer = System.currentTimeMillis();
        
            while(running){
                long now = System.nanoTime();
                delta += (now - lastTime) / ns;
                lastTime = now;
                if(delta >= 1){
                    tick();
                    updates++;
                    delta--;
                }
                render();
                frames++;
                
                if(System.currentTimeMillis() - timer > 1000){
                    timer += 1000;
                    System.out.println(updates + " Ticks, fps " + frames);
                    updates = 0; // resetting updates value so ticks dont gain infinitely
                    frames = 0; // resetting frames value so fps doesnt gain infinitely
                    
                }
            }
        stop();
    }
    
    public void tick(){
        handler.tick();
    }
    
    public void render(){
        
        BufferStrategy bs = this.getBufferStrategy();
        
        if(bs == null){
            
            this.createBufferStrategy(2);
            return;
             }
        
        Graphics g = bs.getDrawGraphics();
        // Drawing starts
        
       g.setColor(Color.black);
       g.fillRect(0, 0, getWidth(), getHeight());
       
        // Drawing ends
        handler.render(g);
        
        g.dispose();
        bs.show();
     
        
    }
    
    public static void main (String args[]){
      new Caylus();
      
      DefBuild d = new DefBuild();
      Player player1 = new Player("Hessu");
      player1.subGold(d.defGoldMine());
      player1.playerInfo();
      
    }

}
