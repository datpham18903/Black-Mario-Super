package model.enemy;

import java.awt.*;
import java.awt.image.BufferedImage;

public class KoopaFly extends Enemy{

    private BufferedImage rightImage;

    public KoopaFly(double x, double y, BufferedImage style) {
        super(x, y, style);
        setVelX(-4);
    }

    @Override
    public void draw(Graphics g){
        if(getVelX() > 0){
            g.drawImage(rightImage, (int)getX(), (int)getY(), null);
        }
        else
            super.draw(g);
    }
    @Override
    public void updateLocation() {
        // Check if KoopaFly is at the desired height
        if (getY() != 0) {
            // If not, adjust y position
            setY(250);
        }

        // Update x position as usual
        setX(getX() + getVelX());
    }

    public void setRightImage(BufferedImage rightImage) {
        this.rightImage = rightImage;
    }
}
