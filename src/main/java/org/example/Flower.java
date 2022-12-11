package org.example;

public class Flower {
    private int sepalLength;
    private String color;
    private int price;

    public int getSepalLength() {
        return sepalLength;
    }

    public void setSepalLength(int sepalLength) {
        this.sepalLength = sepalLength;
    }

    public String getColor() {
        return color;
    }

    public void setColor(FlowerColor color) {
        switch (color) {
            case RED: this.color = "#FF0000"; break;
            case BLUE: this.color = "#0000FF"; break;
            case WHITE: this.color = "#FFFFFF"; break;
            case YELLOW: this.color = "#FFFF00"; break;
            case PURPLE: this.color = "#A020F0"; break;
            case PINK: this.color = "#FFC0CB"; break;
            case BLACK: this.color = "#000000"; break;

        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
