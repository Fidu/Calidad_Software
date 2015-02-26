/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uHotDrawFramework;

import Listener.IDrawingListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import uHotDrawFigures.IFigure;
import uHotDrawFigures.uRectangleFigure;
import uHotTool.uAbstractTool;

/**
 *
 * @author Brandan
 */
public class uDrawingView extends JPanel implements MouseListener,MouseMotionListener,IDrawingListener{
   private uDrawing drawing;
   private uDrawingEditor editor;
   private List<IFigure> uSelectionFigures;

    public uDrawingView() {
        super();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.uSelectionFigures = new ArrayList<IFigure>();
    }
           
    public uAbstractTool uAbstactTool(){
        return editor.getCurrentTool();
    }   

    public List<IFigure> getuSelectionFigures() {
        return uSelectionFigures;
    }

    public void setuSelectionFigures(List<IFigure> uSelectionFigures) {
        this.uSelectionFigures = uSelectionFigures;
    }

    
    
    public uDrawingEditor getEditor() {
        return editor;
    }
    
    public uAbstractTool tool(){
        return editor.getCurrentTool();
    }


    public void setEditor(uDrawingEditor editor) {
        this.editor = editor;
    }
    
    public uDrawing getDrawing() {
        return drawing;
    }

    public void setDrawing(uDrawing drawing) {
        this.drawing = drawing;
    }
   
   @Override
    public void paint(Graphics a){
       a.setColor(Color.black);
       this.drawing.draw(a);
       a.setColor(Color.red);
        for(IFigure f: this.uSelectionFigures){
            uRectangleFigure aux = new uRectangleFigure((int)f.getDisplayBox().getX(),(int)f.getDisplayBox().getY(),(int)f.getDisplayBox().getWidth(),(int)f.getDisplayBox().getHeight());
            aux.draw(a);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println(" mouseClicked ");
    }

    public void mousePressed(MouseEvent aEvent){
        System.out.println(" mouseDown ");
        tool().mouseDown(aEvent);
        editor.repaint();
    }
    public void mouseReleased(MouseEvent aEvent){
        tool().mouseUp(aEvent);
        editor.repaint();
    }
    
    public void mouseMoved(MouseEvent aEvent){
        tool().mouseMove(aEvent);
        editor.repaint();
    } 
    
    public void mouseDragged(MouseEvent aEvent){
        tool().mouseDrag(aEvent);
        editor.repaint();
    }


    @Override
    public void mouseExited(MouseEvent e) {    
        System.out.println("mouseExited ");
    }

    @Override
    public void mouseEntered(MouseEvent e) {   
        System.out.println("mouseEntered ");
    }

    public void clearSelection() {
        this.uSelectionFigures = new ArrayList<IFigure>();
    }

    public void addToSelection(IFigure f) {
        this.uSelectionFigures.add(f);
    }

    @Override
    public void drawingChanged() {
        this.editor.repaint();
    }
}
