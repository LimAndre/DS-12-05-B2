package e1.Personal;

import java.util.Objects;

public class Docentes extends Personal {

    private final String asigRepartida;

    public Docentes(int edad, int horrocrux, String nombre, String apellidos, Asignaturas asigRepartida) {
        super(edad, horrocrux, nombre, apellidos);
        this.asigRepartida= asigRepartida.toString();
    }

    public enum Asignaturas{
        Historia(),
        Transformaciones(),
        Defensa(),
        Herbología(),
        Pociones();

    }

    public String getAsignatura(){
        return asigRepartida;
    }

    @Override
    public int getRecompensa(int horrocrux) {
      if(Objects.equals(this.getAsignatura(), "Defensa")){
          this.recompensa= horrocrux*50;
          this.recompensa=this.recompensa-(int)(0.25*this.recompensa);
      }
      else{
          this.recompensa=horrocrux*50;
      }
      return this.recompensa;
    }
}
