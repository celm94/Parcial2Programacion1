package AdventureGame;

public abstract class Personaje {
    private String nombre;
    private int NivelEnergia;
    private int Vidas;
    private int CapacidadAtaque;
    private int x;
    private int y;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return NivelEnergia;
    }

    public void setEnergia(int energia) {
        this.NivelEnergia = energia;
    }

    public int getVidas() {
        return Vidas;
    }

    public void setVidas(int vidas) {
        this.Vidas = vidas;
    }

    public int getCapacidad() {
        return CapacidadAtaque;
    }

    public void setCapacidad(int capacidad) {
        this.CapacidadAtaque = capacidad;
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
