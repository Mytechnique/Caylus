package fi.jamk.caylus; 

import java.awt.image.BufferedImage;

/** 
 * 
 * @author Mythe 
 */ 

public class SpriteSheet {
    
    private BufferedImage image;
    
    public SpriteSheet(BufferedImage image) {
        this.image = image;
    }
    
    // method for grabbing a spritesheet 32x32 from an image
    public BufferedImage grabImage(int col, int row, int width, int height){
        
        BufferedImage img = image.getSubimage((col * 32) - 32, (row * 32) - 32, width, height);
        return img;
    }
}
