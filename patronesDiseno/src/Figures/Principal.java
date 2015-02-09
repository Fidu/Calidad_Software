/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Figures;

import java.awt.Dimension;
import java.awt.Rectangle;
import uHotDrawFigures.uBorderDecoratorFigura;
import uHotDrawFigures.uDecoratorFigure;
import uHotDrawFigures.uElipseFigure;
import uHotDrawFigures.uPolylineFigure;
import uHotDrawFigures.uRectangleFigure;
import uHotDrawFramework.uDrawing;
import uHotDrawFramework.uDrawingEditor;
import uHotDrawFramework.uDrawingView;

/**
 *
 * @author Brandan
 */
public class Principal {
    public static void main(String[]args){
        uDrawing d = new uDrawing();
        uRectangleFigure f1 = new uRectangleFigure();
        uElipseFigure f2 = new uElipseFigure();
        f2.setDisplayBox(new Rectangle(50,50,60,60));
        f1.setDisplayBox(new Rectangle(10,10,30,30));
        d.add(f1);
        d.add(f2);
        uDrawingEditor e = new uDrawingEditor();
        uDrawingView v = e.getView();
        d.addListener(v);
        v.setDrawing(d);
        v.setPreferredSize(new Dimension(320,240));      
        v.addToSelection(f2);
        e.setVisible(true);
        e.pack();
    }
}
