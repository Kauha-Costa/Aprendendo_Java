package Abstracao.entities;
import Abstracao.enums.Color;

public class abstract Shape {

    private Color color;

    public Shape(){

    }

    public Shape(Color color){
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}
