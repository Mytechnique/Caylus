package fi.jamk.caylus; 

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;




/** 
 * 
 * @author Mythe 
 */ 

public class Spot extends JLabel{

   private ImageIcon icon;
   private JPanel jp;
   
   public Spot(){
    
}
   
   public void setBg(ImageIcon i){
   this.icon = i;
}
}