/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uHotDrawFigures;

import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author bj.gonzalezg
 */
public interface IFigure {
    
    public Rectangle getDisplayBox();
    
    public void draw(Graphics grafico);
        
    public void containsPoint(double x, double y);
    
    public void moveBy(double x, double y);
    
    public void setDisplayBox(Rectangle displayBox);
    
    public IFigure clone();
    
}
