package e1.Residentes;

import e1.Persona;

import java.util.Objects;

public class Residentes extends Persona {

    String casa;

    public Residentes(int edad, int horrocrux, String nombre, String apellidos, Residentes.casa casa) {
        super(edad, horrocrux, nombre, apellidos);
        this.casa = casa.toString();
    }

    public enum casa {
        Gryffindor(),
        Hufflepuff(),
        Ravenclaw(),
        Slytherin();

    }

    public String getCasa() {
        return casa;
    }

    @Override
    public int getRecompensa(int horrocrux) {
        if (Objects.equals(this.casa, "Slytherin")){
            this.recompensa=horrocrux*90*2;
        }
        else {
            this.recompensa=horrocrux*90;
        }
        return recompensa;
    }
}

