package e1;

import e1.Personal.*;
import e1.Residentes.*;
import e1.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    Colegio hogwarts = new Colegio();
    Persona[] personas = new Persona[6];
    Personal[] trabajadores = new Personal[4];

    @BeforeEach
    void setHogwarts() {

        //INICIAR ESTUDIANTES
        Estudiantes hermione= new Estudiantes(16, 3, "Hermione", "Granger", Residentes.casa.Gryffindor);
        Estudiantes harry= new Estudiantes(16, 4, "Harry", "Potter", Residentes.casa.Gryffindor);
        Estudiantes ron= new Estudiantes(16, 2, "Ron", "Weasley", Residentes.casa.Gryffindor);

        //INICIAR DOCENTES
        Docentes minerva= new Docentes(40, 1, "Minerva", "McGonagall", Docentes.Asignaturas.Transformaciones);
        Docentes severus= new Docentes(45, 2, "Snape", "Severus", Docentes.Asignaturas.Defensa);

        //INCIAR FANTASMAS
        Fantasmas baron= new Fantasmas(200, 1, "Barón", "Sanguineo", Residentes.casa.Slytherin);
        //Fantasmas baron= new Fantasmas(200, 1, "Barón", "Sanguineo", "Fantasma", Residentes.casa.Slytherin);

        //INICIAR GUARDABOSQUES
        GuardaBosques rubeus= new GuardaBosques(46, 2, "Rubeus", "Hagrid");

        //INICIAR CONSERJES
        Conserjes argus= new Conserjes(52, 0, "Argus", "Filch");


        //INICIAR LISTA PERSONAS
        personas[0]=hermione;
        personas[1]=baron;
        personas[2]=rubeus;
        personas[3]=minerva;
        personas[4]=severus;
        personas[5]=argus;

        //INCIAR LISTA TRABAJADORES
        trabajadores[0]=rubeus;
        trabajadores[1]=minerva;
        trabajadores[2]=severus;
        trabajadores[3]=argus;
    }


    @Test
    void imprimirRecompensa(){

        assertEquals("Hermione Granger (Estudiante de Gryffindor, 3 horrocruxes): 270 galeones\n" +
                             "Barón Sanguineo (Fantasma de Slytherin, 1 horrocruxes): 160 galeones\n" +
                             "Rubeus Hagrid (GuardaBosques, 2 horrocruxes): 150 galeones\n" +
                             "Minerva McGonagall (Docente de Transformaciones, 1 horrocruxes): 50 galeones\n" +
                             "Snape Severus (Docente de Defensa, 2 horrocruxes): 75 galeones\n" +
                             "Argus Filch (Conserje, 0 horrocruxes): 0 galeones\n" +
                             "La recompensa total del colegio Hogwarts es de 705 galeones\n",
                             hogwarts.imprimirRecompensa(personas));;
    }

    @Test
    void imprimirSalarios(){

        assertEquals("Rubeus Hagrid (GuardaBosques): 180 galeones\n" +
                             "Minerva McGonagall (Docente de Transformaciones): 400 galeones\n" +
                             "Snape Severus (Docente de Defensa): 500 galeones\n" +
                             "Argus Filch (Conserje): 160 galeones\n" +
                             "El gasto de Hogwarts en personal es de 1240 galeones",
                             hogwarts.imprimirSalarios(trabajadores));
    }

}
