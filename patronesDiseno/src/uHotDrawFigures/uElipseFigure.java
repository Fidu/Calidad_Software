/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uHotDrawFigures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author bj.gonzalezg
 */
public class uElipseFigure extends uAbstractFigure{

    public uElipseFigure() {
        super();
    }
    
    public uElipseFigure(int i, int i0, int i1, int i2) {
        super();
        this.displayBox.setRect(i, i0, i1, i2);
    }
    
    /*public void draw(Graphics grafico){
        grafico.setColor(Color.blue);
        grafico.drawOval(30, 40, 50, 50);
    }*/
    
    @Override
    public void draw(Graphics grafico){
        grafico.drawOval((int) this.displayBox.getX(), (int) this.displayBox.getY(), (int)this.displayBox.getWidth(),(int) this.displayBox.getHeight());
    }
    
    public IFigure clone(){
        IFigure aux = new uElipseFigure();
        Rectangle auxRect = new Rectangle();
        auxRect = (Rectangle) this.getDisplayBox().clone();
        aux.setDisplayBox(auxRect);
        return aux;
    }
    
}
