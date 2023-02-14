package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();
        for(int i = 0; i < 3; i++) {


            zofka.move(100);
            zofka.turnLeft(90);
            zofka.move(100);
            zofka.turnLeft(90);
            zofka.move(100);
            zofka.turnLeft(90);
            zofka.move(100);
            zofka.turnLeft(90);
            zofka.move(100);
            zofka.turnLeft(45);
            zofka.move(75);
            zofka.turnLeft(90);
            zofka.move(75);
            zofka.turnRight(180);
            zofka.move(75);
            zofka.turnRight(90);
            zofka.move(75);
            zofka.turnRight(45);
            zofka.move(100);
            zofka.turnLeft(90);
            zofka.move(120);
            zofka.turnLeft(90);
        }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
