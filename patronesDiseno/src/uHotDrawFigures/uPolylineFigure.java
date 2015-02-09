/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uHotDrawFigures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.sound.sampled.Line;

/**
 *
 * @author Brandan
 */
public class uPolylineFigure extends uAbstractFigure{
    
     private List<Point> puntos;

    public uPolylineFigure() {
        this.puntos = new ArrayList();
    }

    public List<Point> getPuntos() {
        return puntos;
    }

    public void setPuntos(List<Point> puntos) {
        this.puntos = puntos;
    }
    
    public void addPoint(Point p){
        this.puntos.add(p);
    }
    
    public void draw(Graphics g){
        Point anterior = new Point();
        Point actual = new Point();
        Iterator iterador = this.puntos.iterator();
        if (iterador.hasNext()){
            anterior = (Point) iterador.next();
            while(iterador.hasNext()){
                actual = (Point) iterador.next();
                g.drawLine((int)anterior.getX(),(int) anterior.getY(), (int)actual.getX(),(int) actual.getY());
                anterior=actual;
            }
        }
    }
    
    public void moveBy(double x, double y){
        for(Point f: this.puntos){
            f.translate((int)x,(int) y);
        }
    }
    
}
