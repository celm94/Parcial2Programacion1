package AdventureGame;

import java.util.List;

public class Heroe extends Personaje {

    private List<Mueble> mochila;


    public Heroe(int energia, int vidas, int capacidad, int x, int y) {
        super(energia, vidas, capacidad, x, y);
    }
}
