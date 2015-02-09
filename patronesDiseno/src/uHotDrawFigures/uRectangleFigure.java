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
public class uRectangleFigure extends uAbstractFigure{

    public uRectangleFigure() {
        super();
    }
    
    public uRectangleFigure(int i, int i0, int i1, int i2) {
        super();
        this.displayBox.setRect(i,i0,i1,i2);
    }

    /*public void draw(Graphics grafico){
        grafico.setColor(Color.green);
        grafico.drawRect(20, 20, 50, 50);
    }*/
   
   @Override
   public void draw(Graphics grafico){
        grafico.drawRect((int) this.displayBox.getX(), (int) this.displayBox.getY(), (int)this.displayBox.getWidth(),(int) this.displayBox.getHeight());
    }
   
   public IFigure clone(){
        IFigure aux = new uRectangleFigure();
        Rectangle auxRect = new Rectangle();
        auxRect = (Rectangle) this.getDisplayBox().clone();
        aux.setDisplayBox(auxRect);
        return aux;
    }
}
