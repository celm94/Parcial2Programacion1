package AdventureGame;

public abstract class Personaje {

    private int NivelEnergia;
    private int Vidas;
    private int CapacidadAtaque;
    private int x;
    private int y;

    public int getNivelEnergia() {
        return NivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        NivelEnergia = nivelEnergia;
    }

    public int getVidas() {
        return Vidas;
    }

    public void setVidas(int vidas) {
        Vidas = vidas;
    }

    public int getCapacidadAtaque() {
        return CapacidadAtaque;
    }

    public void setCapacidadAtaque(int capacidadAtaque) {
        CapacidadAtaque = capacidadAtaque;
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
