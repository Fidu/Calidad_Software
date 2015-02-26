/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uHotTool;

import java.awt.event.MouseEvent;
import uHotDrawFigures.IFigure;
import uHotDrawFramework.uDrawingView;

/**
 *
 * @author Brandan
 */
public class uSelectionTool extends uAbstractTool{

private uDrawingView v;
private uAbstractTool fChild;

    public uSelectionTool(uDrawingView v1){
        this.v=v1;
    }
    public IFigure findFigure(int x,int y){
        return v.getDrawing().findFigure(x,y);
    }
    
    public void mouseDown(MouseEvent e){
        v.clearSelection();
        IFigure figure=findFigure(e.getX(),e.getY());
        if(figure!=null){
            fChild=new uDragTool(v,figure);
        } else{
            fChild=new uSelectAreaTool(v);
        }
        fChild.mouseDown(e);
    }
    
    public void mouseUp(MouseEvent e){
        fChild.mouseUp(e);
    }
    
    public void mouseDrag(MouseEvent e){
        fChild.mouseDrag(e);       
    }
    
    public void mouseMove(MouseEvent e){
    }
    
}

