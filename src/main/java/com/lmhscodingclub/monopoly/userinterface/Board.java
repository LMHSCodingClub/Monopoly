package com.lmhscodingclub.monopoly.userinterface;

import java.io.File;
import java.io.IOException;

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
    private Color white = new Color(255, 255, 255);
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
        g2.fill(new Rectangle2D.Double(62.5, 62.5, width, height));
        
        try {
            drawInnerRectangles(g2);
            drawProperties(g2);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private void drawInnerRectangles(Graphics2D g2) throws IOException {
        // Rectangles on inside of board that are rotated 45 degrees
        AffineTransform old = g2.getTransform();
        
        //g2.rotate(Math.toRadians(-45));

        // Chance
        g2.setColor(new Color(255, 165, 0));
        g2.fill(new Rectangle2D.Double(100, 150, 100, 50));
        g2.fill(new Rectangle2D.Double(400, 150, 100, 50));
        // x, y, w, h

        // Community Chest
        g2.setColor(new Color(0, 165, 255));
        g2.fill(new Rectangle2D.Double(100, 400, 100, 50));
        g2.fill(new Rectangle2D.Double(400, 400, 100, 50));

        // Monopoly logo
        //  drawMonopolyLogo(g2);

        g2.setTransform(old);
    }

    private void drawMonopolyLogo(Graphics2D g2) throws IOException {
        AffineTransform at = g2.getTransform();
        at.translate(250, 250);
        at.rotate(Math.toRadians(45));
        BufferedImage logo = ImageIO.read(new File("/images/logo.png"));
        g2.drawImage(logo, at, null);
    }

    private void drawProperties(Graphics2D g2) {
        g2.setColor(white);
        g2.setBackground(green);

        // Properties
        // x, y, w, h
        //Dimensions of tile: length - 62.4, width - 41.6, corner tiles - 62.4 X 62.4
        
        // top row
        for(int i = 0; i < height; i+=41.6){
            g2.fill(new Rectangle2D.Double(62.4+i, 62.4, 41.6, 62.4));
        }
        // bottom row
        for(int i = 0; i < height; i+=41.6){
            g2.fill(new Rectangle2D.Double(62.4+i, 499.1, 41.6, 62.4));
        }
        // left side
        for(int q = 0; q < height; q+=41.6){
            g2.fill(new Rectangle2D.Double(0, 62.4+q, 62.4, 41.6));
        }
        // right side
        for(int q = 0; q < height; q+=41.6){
            g2.fill(new Rectangle2D.Double(550, 62.4+q, 62.4, 41.6));
        }
    }
}