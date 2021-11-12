package e1.Residentes;

public class Estudiantes extends Residentes {


    public Estudiantes(int edad, int horrocrux, String nombre, String apellidos, Residentes.casa casa) {
        super(edad, horrocrux, nombre, apellidos, casa);
        this.casa= casa.toString();
    }

}
