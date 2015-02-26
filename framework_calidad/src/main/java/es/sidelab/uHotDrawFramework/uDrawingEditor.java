/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uHotDrawFramework;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import uHotDrawFigures.uElipseFigure;
import uHotDrawFigures.uRectangleFigure;
import uHotTool.uAbstractTool;
import uHotTool.uCreationTool;
import uHotTool.uPolylineCreationTool;
import uHotTool.uSelectionTool;

/**
 *
 * @author Brandan
 */
public class uDrawingEditor extends JFrame implements ActionListener{
    private uDrawingView view;
    private List<uAbstractTool> tools;
    private uAbstractTool currentTool;
    private uAbstractTool rt,et,pt,st;
    
      public uDrawingEditor() {
        super();
        JPanel barraHerramientas = new JPanel();
        JButton b4 = new JButton("Rectangle");
        b4.setActionCommand("r");
        b4.addActionListener(this);
        barraHerramientas.add(b4);
        JButton b5 = new JButton("Ellipse");
        b5.setActionCommand("e");
        b5.addActionListener(this);
        barraHerramientas.add(b5);
        JButton b6 = new JButton("Polyline");
        b6.setActionCommand("p");
        b6.addActionListener(this);
        barraHerramientas.add(b6);
        JButton b7 = new JButton("Seleccion");
        b7.setActionCommand("s");
        b7.addActionListener(this);
        barraHerramientas.add(b7);
        this.view = new uDrawingView();
        this.view.setEditor(this);
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(barraHerramientas, BorderLayout.NORTH);
        this.getContentPane().add(this.view, BorderLayout.CENTER);

        this.setVisible(true);
        this.pack();
        rt=new uCreationTool(this.getView(),new uRectangleFigure(0,0,10,10));
        et=new uCreationTool(this.getView(),new uElipseFigure(0,0,10,10));
        pt= new uPolylineCreationTool(this.getView());
        st= new uSelectionTool(this.getView());
        currentTool=rt;
    }
    
    public uAbstractTool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(uAbstractTool currentTool) {
        this.currentTool = currentTool;
    }

    public List<uAbstractTool> getTools() {
        return tools;
    }

    public void setTools(List<uAbstractTool> tools) {
        this.tools = tools;
    }

    public uDrawingView getView() {
        return view;
    }

    public void setView(uDrawingView view) {
        this.setContentPane(view);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("e".equals(e.getActionCommand())) {
            setCurrentTool(et);
        }
        if ("r".equals(e.getActionCommand())) {
            setCurrentTool(rt);
        }
        if ("p".equals(e.getActionCommand())) {
            setCurrentTool(pt);
        }
        if ("s".equals(e.getActionCommand())) {
            setCurrentTool(st);
        }
    }
}
