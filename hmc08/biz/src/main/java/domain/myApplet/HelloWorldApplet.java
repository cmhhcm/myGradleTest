package domain.myApplet;

import java.applet.Applet;
import java.awt.*;

/**
 * Author:meice Huang
 * Time: 2019-09-01 09:16
 */
public class HelloWorldApplet extends Applet {
    @Override
    public void paint(Graphics g){
        g.drawString("Hello World",25,50);
    }
}
