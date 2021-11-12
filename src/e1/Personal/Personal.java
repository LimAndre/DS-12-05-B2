package e1.Personal;

import e1.Persona;

public abstract class Personal extends Persona {

    public int sueldo, salarioTotal;

    public Personal(int edad, int horrocrux, String nombre, String apellidos) {
        super(edad, horrocrux, nombre, apellidos);
    }

    public int calcularSueldo(){
        String aux;
        if(this instanceof Docentes){
            aux=((Docentes) this).getAsignatura();
             switch (aux) {

                 case "Defensa" -> this.sueldo = 500;
                 case "Transformaciones" -> this.sueldo = 400;
                 case "Pociones" -> sueldo = 350;
                 case "Herbología" -> sueldo = 250;
                 case "Historia" -> sueldo = 200;

             }
        }
        else if(this instanceof Conserjes){
            sueldo =160;
        }
        else if(this instanceof GuardaBosques){
            sueldo=180;
        }
        else {
            System.out.println("ERROR");
        }
        return sueldo;
    }

    public int calcularSalarioTotal(){
        salarioTotal= this.getRecompensa(this.getHorrocrux())+this.calcularSueldo();
        return salarioTotal;
    }

}
