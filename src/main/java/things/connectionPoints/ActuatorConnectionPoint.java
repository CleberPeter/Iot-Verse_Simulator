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
public class ActuatorConnectionPoint extends ConnectionPoint
{    
    private static final Color DEFAULT_COLOR = new Color(240, 178, 61);
    
    public ActuatorConnectionPoint(Thing parentThing, String name, int anchor) {
        super(parentThing, name, DEFAULT_COLOR, anchor, new FilledTriangle(DEFAULT_COLOR, 20, anchor == GridBagConstraints.NORTHEAST ? 0 : Math.PI));
    }

    @Override
    public void onAnchorUpdated() {
        FilledTriangle filledTriangle = (FilledTriangle) this.getConnectionPanel();
        
        filledTriangle.setAngle(this.getAnchor() == GridBagConstraints.NORTHEAST ? 0 : Math.PI);
    }   
}