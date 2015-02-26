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
import uHotDrawFigures.uPolylineFigure;
import uHotDrawFramework.uDrawingView;

/**
 *
 * @author Brandan
 */
public class uPolylineCreationTool extends uCreationTool{

    uPolylineFigure actual;
    public uPolylineCreationTool(uDrawingView view) {
        super(view);
    }
    
    public IFigure creationFigure(){
        return new uPolylineFigure();
    }
    
    public void mouseDown(MouseEvent e){
        if (this.actual==null){
            this.actual = (uPolylineFigure) creationFigure();
            this.actual.addPoint(new Point(e.getX(),e.getY()));
            uDrawingView v = this.getVista();
            v.getDrawing().add(this.actual);
        }
    } 
        
    public void mouseMove(MouseEvent e){
        /*//si dejamos esto hace lineas continuas
        if (this.actual!=null){
            this.actual.addPoint(new Point(e.getX(),e.getY()));
        }*/
              
    }
    
    public void mouseDrag(MouseEvent e){
        //si dejamos esto hace lineas continuas
        if (this.actual!=null){
            this.actual.addPoint(new Point(e.getX(),e.getY()));
        }
              
    }
    
    public void mouseUp(MouseEvent e){
        this.actual=null;
        /*if (this.actual!=null){
            this.actual.addPoint(new Point(e.getX(),e.getY()));
        }*/
    }  
   
    
}
