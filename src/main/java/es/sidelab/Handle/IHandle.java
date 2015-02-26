/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Handle;

import java.awt.Point;
import javax.tools.Tool;
import uHotDrawFigures.IFigure;
import uHotTool.uAbstractTool;

public interface IHandle extends IFigure,Tool
{
 IFigure owner();
 Point locate();
}
