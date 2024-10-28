package io.hexlet;

import io.hexlet.geometry.Quadrate;

public class App {
    public static Quadrate enlargeQuadrate(Quadrate quadrate) {
        // Увеличиваем сторону квадрата в 2 раза
        return new Quadrate(quadrate.getSide() * 2);
    }

    public static void main(String[] args) {
        var quadrate = new Quadrate(3);
        var enlargedQuadrate = App.enlargeQuadrate(quadrate);
        System.out.println(enlargedQuadrate.getSide()); // 6
    }
}
