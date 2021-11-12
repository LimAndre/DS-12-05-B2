package e1;
import e1.Personal.Docentes;
import e1.Personal.Personal;
import e1.Residentes.Estudiantes;
import e1.Residentes.Fantasmas;
import e1.Residentes.Residentes;

public class Colegio {

    public String imprimirRecompensa(Persona[] personas){
        String aux="";
        int sumaTotal=0;

        for (Persona persona : personas) {
            if(persona== null){
                continue;
            }
            aux += persona.getNombre() + " " + persona.getApellidos() + " (" + persona.getTipo();
            if (persona instanceof Estudiantes) {
                aux += " de " + ((Estudiantes) persona).getCasa();
            }
            if (persona instanceof Fantasmas) {
                aux += " de " + ((Fantasmas) persona).getCasa();
            }
            if (persona instanceof Docentes) {
                aux += " de " + ((Docentes) persona).getAsignatura();
            }
            aux += ", " + persona.getHorrocrux() + " horrocruxes): " + persona.getRecompensa(((Persona) persona).getHorrocrux()) + " galeones\n";
            sumaTotal+= persona.getRecompensa(persona.getHorrocrux());
        }
        aux+="La recompensa total del colegio Hogwarts es de "+sumaTotal+" galeones\n";
        System.out.print(aux);

        return aux;
    }

    public String imprimirSalarios(Personal[] trabajadores) {
        String aux = "";
        int sumaTotal=0;

        for (Personal persona : trabajadores) {
            if(persona==null){
                continue;
            }
            aux += persona.getNombre()+" "+persona.getApellidos()+" ("+persona.getTipo();
            if(persona instanceof Docentes){
                aux+=" de "+ ((Docentes) persona).getAsignatura();
            }
            aux+= "): "+ persona.calcularSueldo()+ " galeones\n";
            sumaTotal+=persona.calcularSueldo();
        }
        aux+="El gasto de Hogwarts en personal es de "+ sumaTotal+ " galeones";
        System.out.println(aux);

        return aux;

    }
}


