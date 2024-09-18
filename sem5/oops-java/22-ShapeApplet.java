import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

// <applet code="ShapeDrawer" width="400" height="400"></applet>
public class ShapeDrawer extends Applet {

    @Override
    public void init() {
        setBackground(Color.WHITE);
    }

    @Override
    public void paint(Graphics g) {
        // Set color for the circle and draw it
        g.setColor(Color.RED);
        g.fillOval(50, 50, 100, 100); // x, y, width, height

        // Set color for the ellipse and draw it
        g.setColor(Color.GREEN);
        g.fillOval(200, 50, 150, 100); // x, y, width, height

        // Set color for the square and draw it
        g.setColor(Color.BLUE);
        g.fillRect(50, 200, 100, 100); // x, y, width, height
    }
}
