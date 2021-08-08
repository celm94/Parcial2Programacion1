package AdventureGame;

public abstract class Mueble {
            private int x;
            private int y;
            private Heroe heroe;

    public Mueble(int x, int y, Heroe heroe) {
        this.x = x;
        this.y = y;
        this.heroe = heroe;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Heroe getHeroe() {
        return heroe;
    }

    public void setHeroe(Heroe heroe) {
        this.heroe = heroe;
    }
}
