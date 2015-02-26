/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uHotTool;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import uHotDrawFigures.IFigure;
import uHotDrawFigures.uAbstractFigure;
import uHotDrawFramework.uDrawingView;

/**
 *
 * @author Brandan
 */
public class uCreationTool extends uAbstractTool{
    
    uAbstractFigure prototype;

    public uCreationTool(uDrawingView view, uAbstractFigure figure) {
        this.setVista(view);    
        this.prototype = figure;
    }
    public uCreationTool(uDrawingView view) {
        this.setVista(view);    
    }

    public uAbstractFigure getPrototype() {
        return prototype;
    }

    public void setPrototype(uAbstractFigure prototype) {
        this.prototype = prototype;
    }
    public IFigure creationFigure(){
        return prototype.clone();
    }

    public void mouseDown(){
        
    } 
    
    public void mouseMove(){
        
    }
    
   public void mouseUp(MouseEvent e){
        IFigure f= creationFigure();
        Rectangle r=f.getDisplayBox();
        Point p=new Point(e.getX()-r.x,e.getY()-r.y);
        f.moveBy(p.getX(),p.getY());
        uDrawingView v = this.getVista();
        v.getDrawing().add(f);
    }  
}
