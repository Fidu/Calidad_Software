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
import uHotDrawFramework.uDrawingView;

/**
 *
 * @author Brandan*/

public class uDragTool extends uAbstractTool{
    private uDrawingView v;
    private IFigure figure;
    
    public uDragTool(uDrawingView dv,IFigure f){
        this.v=dv;
        this.figure=f;
    }
    public void mouseDown(MouseEvent e){
        this.v.addToSelection(figure);
    }
    public void mouseUp(MouseEvent e){
        
    }
    public void mouseDrag(MouseEvent e){
        Rectangle r=figure.getDisplayBox();
        Point p=new Point(e.getX()-r.x,e.getY()-r.y);
        figure.moveBy(p.getX(),p.getY());
    }
    public void mouseMove(MouseEvent e){
    }
}