package com.lmhscodingclub.monopoly.userinterface;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;

import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.geom.Rectangle2D;
import java.awt.geom.AffineTransform;


public class Board extends JPanel {
    private Color green = new Color(0, 255, 0);
    private int width = 500;
    private int height = 500;
    
    public Board() {
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public Dimension getPreferredSize() {
        return new Dimension(250,200);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(green);
        g2.setBackground(green);
        
        // Outer and inner borders
        g2.fill(new Rectangle2D.Double(50, 50, width - 50, height - 50));
        
        drawInnerRectangles(g2);
        drawMonopolyLogo();
    }

    private void drawInnerRectangles(Graphics2D g2) {
        // Rectangles on inside of board that are rotated 45 degrees
        AffineTransform old = g2.getTransform();
        
        g2.rotate(Math.toRadians(45));

        // Chance
        g2.setColor(new Color(255, 165, 0));
        g2.fill(new Rectangle2D.Double(130, 130, 100, 50));

        // Community Chest
        g2.fill(new Rectangle2D.Double(450, 450, 100, 50));

        // Monopoly logo
        drawMonopolyLogo(g2);

        g2.setTransform(old);
    }

    private void drawMonopolyLogo(Graphics2D g2) {
        AffineTransform at = g2.getTransform();
        at.translate(250, 250);
        at.rotate(Math.toRadians(45));
        //BufferedImage logo = ImageIO.read(this.getClass().getResource("/images/logo.png"));
        g2.drawImage(logo, at, null);
    }
}