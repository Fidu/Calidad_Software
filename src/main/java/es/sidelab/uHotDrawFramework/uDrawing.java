/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uHotDrawFramework;

import Figures.uCompositeFigure;
import Listener.IDrawingListener;
import Listener.IFigureListener;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import uHotDrawFigures.IFigure;

/**
 *
 * @author Brandan
 */
public class uDrawing extends uCompositeFigure implements IFigureListener{

    List<IDrawingListener> observadores;
    public uDrawing() {
        super();
        observadores = new ArrayList();
    }

    public void figureChanged() {
        this.dipatchDrawingListener();
    }
    
    public void dipatchDrawingListener(){
        for(IDrawingListener y :observadores){
            y.drawingChanged();
        }
    }
    
    public void addListener(IDrawingListener listener){
        this.observadores.add(listener);
    }
    
}
