/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uHotDrawFigures;

import java.awt.Graphics;
import java.util.List;

/**
 *
 * @author Brandan
 */
public class uDecoratorFigure extends uAbstractFigure{
    private uAbstractFigure decoraterFigure ;

    public uAbstractFigure getDecoraterFigure() {
        return decoraterFigure;
    }

    public void setDecoraterFigure(uAbstractFigure decoraterFigure) {
        this.decoraterFigure = decoraterFigure;
    }
    
    public void draw(Graphics g){
        decoraterFigure.draw(g);
    }

}
