
import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;

public class TimeGraph extends JFrame {

    private ArrayList<ArrayList<Time>> timesList;
    public static final int xScale = 10;
    public static final int yScale = 10;

    public TimeGraph(ArrayList<ArrayList<Time>> timeList) {
        super("Time Graph");

        this.timesList = timeList;

        this.setSize(800, 800);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        JLabel xAxisLabel = new JLabel("input size");
        xAxisLabel.setSize(200, 50);
        xAxisLabel.setLocation(400, 650);
        // this.add(xAxisLabel);

        setUpLabels();

        this.revalidate();
        this.repaint();

    }

    public void setUpLabels() {
        for (int i = 0; i < 200; i += 50) {
            JLabel label = new JLabel(Integer.toString(i * xScale));
            label.setSize(100, 50);
            label.setLocation(i + 100, 550);
            label.setBackground(Color.BLACK);

            // System.out.println(i + 100 + " " + 550);
            this.add(label);
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawLines(g);
        drawData(g);
    }

    void drawData(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.blue);

        for (ArrayList<Time> times : timesList) {
            for (Time time : times) {
                g2d.fillOval(100 + time.getSize() / xScale, 550 - (int) time.getTime() * yScale, 10, 10);
            }
        }

    }

    void drawLines(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.drawLine(100, 50, 100, 550);
        g2d.drawLine(100, 550, 550, 550);
    }
}
