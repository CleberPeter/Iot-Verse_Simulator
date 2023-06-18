/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package things.connectionPoints;

import customWidgets.FilledTriangle;
import java.awt.Color;
import java.awt.GridBagConstraints;
import things.Thing;

/**
 *
 * @author cleber
 */
public class EventConnectionPoint extends ConnectionPoint
{    
    private static final Color DEFAULT_COLOR = new Color(239, 83, 79); 

    public EventConnectionPoint(Thing parentThing, String name, int anchor) {
        super(parentThing, name, anchor, new FilledTriangle(DEFAULT_COLOR, 20, anchor == GridBagConstraints.NORTHEAST ? 0 : Math.PI));
    
    }

    @Override
    public void onAnchorUpdated() {
        FilledTriangle filledTriangle = (FilledTriangle) this.getConnectionPanel();
        
        filledTriangle.setAngle(this.getAnchor() == GridBagConstraints.NORTHEAST ? 0 : Math.PI);
    }
    
    public Color getColor()
    {
        return DEFAULT_COLOR;
    }
    
    public void setColor(Color color)
    {
        FilledTriangle filledTriangle = (FilledTriangle) this.getConnectionPanel();
        
        filledTriangle.setColor(color);
    }
}
