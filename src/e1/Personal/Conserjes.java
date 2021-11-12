package e1.Personal;

public class Conserjes extends Personal{

    public Conserjes(int edad, int horrocrux, String nombre, String apellidos) {
        super(edad, horrocrux, nombre, apellidos);
    }

    @Override
    public int getRecompensa(int horrocrux) {
        this.recompensa= horrocrux*65;
        return recompensa;
    }
}
