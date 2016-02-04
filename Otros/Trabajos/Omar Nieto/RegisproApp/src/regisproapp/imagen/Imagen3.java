/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regisproapp.imagen;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;


public class Imagen3 extends javax.swing.JPanel{
    
    public Imagen3(){
    
    initComponents();
    this.setSize(2880,1880);
    }

   public void paintComponent(Graphics g){
    
       Dimension tam = getSize(); 
       
       ImageIcon Imagen3= new ImageIcon(new ImageIcon(getClass().getResource("fondos-de-pantalla-azules-con-lineas-blancas.jpg")).getImage());
       
       g.drawImage(Imagen3.getImage(), 0, 0, tam.width,tam.height,null);
       
       setOpaque(false);
       super.paintComponent(g);
    
    }

    private void initComponents() {
     
    }

    
}
