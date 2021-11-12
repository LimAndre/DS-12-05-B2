package e1.Residentes;

import java.util.Objects;

public class Fantasmas extends Residentes{


    public Fantasmas(int edad, int horrocrux, String nombre, String apellidos, Residentes.casa casa) {
        super(edad, horrocrux, nombre, apellidos, casa);
        this.casa= casa.toString();
    }

    @Override
    public int getRecompensa(int horrocrux) {
        if (Objects.equals(this.casa, "Slytherin")){
            this.recompensa=horrocrux*80*2;
        }
        else {
            this.recompensa=horrocrux*80;
        }
        return recompensa;
    }
}
