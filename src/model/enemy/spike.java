package model.enemy;

import java.awt.*;
import java.awt.image.BufferedImage;

public class spike extends Enemy {

    private BufferedImage rightImage;

    public spike(double x, double y, BufferedImage style) {
        super(x, y, style);
        setVelX(0);
    }

    @Override
    public void draw(Graphics g) {
        if (getVelX() > 0) {
            g.drawImage(rightImage, (int) getX(), (int) getY(), null);
        } else
            super.draw(g);
    }
}