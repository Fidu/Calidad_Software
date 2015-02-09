/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figures;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.List;
import java.util.ArrayList;
import uHotDrawFigures.*;



/**
 *
 * @author Brandan
 */
public class uCompositeFigure extends uAbstractFigure{
    private List <IFigure> figures;
    
    public uCompositeFigure(){
        this.figures = new ArrayList <IFigure> ();
    }
    
    public void add(IFigure Figura){
        this.figures.add(Figura);
        this.dispathFiguredChanged();
    }
            
    public void remove(uAbstractFigure Figura){
        this.figures.remove(this.figures.indexOf(Figura));
        this.dispathFiguredChanged();
    }
    
    public List<IFigure> getFigures(){
        return this.figures;
    }
    public void draw(Graphics g){
        for(IFigure f: this.figures){
            f.draw(g);
        }
  }
    
    public IFigure clone(){
        return this;
    }
    
    public IFigure findFigure(int x, int y){
        IFigure figura = null;
        for(IFigure f: this.figures){
            if(f.getDisplayBox().contains(new Point(x,y)))
                figura=f;   
        }
        return figura;
    }
    
    public List<IFigure> findFigures(Rectangle rectangulo){
        ArrayList figuras = new ArrayList<IFigure>();
        IFigure figura = null;
        for(IFigure f: this.figures){
            if(rectangulo.contains(f.getDisplayBox()))
                figuras.add(f);
        }
        return figuras;
    }    

}
