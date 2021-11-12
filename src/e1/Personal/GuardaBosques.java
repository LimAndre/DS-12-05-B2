package e1.Personal;

public class GuardaBosques extends Personal{

    public GuardaBosques(int edad, int horrocrux, String nombre, String apellidos) {
        super(edad, horrocrux, nombre, apellidos);
    }

    @Override
    public int getRecompensa(int horrocrux) {
       this.recompensa= horrocrux*75;
       return recompensa;
    }
}
