/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uHotTool;

import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import uHotDrawFramework.uDrawingView;

/**
 *
 * @author Brandan
 */
public abstract class uAbstractTool {
    private uDrawingView vista;   
    
    public uDrawingView getVista(){
        return this.vista;
    }
    
    public void setVista(uDrawingView vist){
        this.vista = vist;
    }
    
    public void mouseDown(MouseEvent aEvent){
        
    } 
    
    public void mouseMove(MouseEvent aEvent){
        
    }
    
    public void mouseUp(MouseEvent aEvent){
            
    }
    
    public void mouseDrag(MouseEvent aEvent){
        
    }
    
}
