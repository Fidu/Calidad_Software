/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uHotDrawFigures;

import java.awt.Graphics;

/**
 *
 * @author Brandan
 */
public class uBorderDecoratorFigura extends uDecoratorFigure{
    
    public void draw(Graphics g){
        super.draw(g);
        g.drawRect((int)this.getDecoraterFigure().displayBox.getX(),(int)this.getDecoraterFigure().displayBox.getY(),(int)this.getDecoraterFigure().displayBox.getWidth(),(int)this.getDecoraterFigure().displayBox.getHeight());
    }
}
