/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uHotDrawFigures;

import Listener.IFigureListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bj.gonzalezg
 */
public class uAbstractFigure implements IFigure{
    List<IFigureListener> observador;
    Rectangle displayBox;
    
    public uAbstractFigure (){
        this.displayBox = new Rectangle (30,30,50,50);
        observador = new ArrayList();
    }
    
    public void dispathFiguredChanged(){
        for(IFigureListener j:observador)
            j.figureChanged();
    }
    /*public void draw(Graphics grafico){
        grafico.setColor(Color.red);
        grafico.drawOval(10, 10, 50, 50);
    }*/
    
    public void draw(Graphics grafico){
        grafico.setColor(Color.red);
        grafico.drawOval((int) this.displayBox.getX(), (int) this.displayBox.getY(), (int)this.displayBox.getWidth(),(int) this.displayBox.getHeight());
    }

    public Rectangle getDisplayBox() {
        return displayBox;
    }

    public void setDisplayBox(Rectangle displayBox) {
        this.displayBox = displayBox;
        this.dispathFiguredChanged();
    }
    
    public void moveBy(double x, double y){
        this.displayBox.translate((int) x,(int) y);
        this.dispathFiguredChanged();
    }
    
    public void containsPoint(double x,double y) {
        this.displayBox.contains(x,y);
    }   
    
    public IFigure clone(){
        IFigure aux = new uAbstractFigure();
        Rectangle auxRect = new Rectangle();
        auxRect = (Rectangle) this.getDisplayBox().clone();
        aux.setDisplayBox(auxRect);
        return aux;
    }
}
