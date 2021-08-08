package AdventureGame;

public abstract class Personaje {
    private int energia;
    private int vidas;
    private int capacidad;
    private int x;
    private int y;


    public Personaje(int energia, int vidas, int capacidad, int x, int y) {
        this.energia = energia;
        this.vidas = vidas;
        this.capacidad = capacidad;
        this.x = x;
        this.y = y;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
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
}
