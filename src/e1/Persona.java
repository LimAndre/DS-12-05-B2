package e1;

import e1.Personal.Conserjes;
import e1.Personal.Docentes;
import e1.Personal.GuardaBosques;
import e1.Residentes.Estudiantes;
import e1.Residentes.Fantasmas;


public abstract  class Persona {

    protected final int edad;
    protected int recompensa;
    protected int horrocrux;
    protected String nombre;
    protected String apellidos;
    protected String tipo;

    public Persona(int edad, int horrocrux, String nombre, String apellidos) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.horrocrux = horrocrux;

    }

    public String getTipo() {

       if(this instanceof Estudiantes){
           tipo="Estudiante";
       }
       else if(this instanceof Docentes){
           tipo="Docente";
       }
       else if(this instanceof GuardaBosques){
           tipo="GuardaBosques";
       }
       else if(this instanceof Conserjes){
           tipo="Conserje";
       }
       else if(this instanceof Fantasmas){
           tipo="Fantasma";
       }
       else {
           System.out.println("ERROR");
       }
        return tipo;
    }
    public int getHorrocrux() {
        return horrocrux;
    }
    public abstract int getRecompensa(int horrocrux);
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }


}
