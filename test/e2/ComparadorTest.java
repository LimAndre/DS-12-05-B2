package e2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;
import java.util.Comparator;

public class ComparadorTest {

        ArrayList<Anuncio> listTotal= new ArrayList<>();
        ArrayList<Anuncio> listTamaño= new ArrayList<>();
        ArrayList<Anuncio> listHabitaciones= new ArrayList<>();
        ArrayList<Anuncio> listBase= new ArrayList<>();
        ArrayList<Anuncio> list= new ArrayList<>();

        Anuncio anuncio1= new Anuncio();
        Anuncio anuncio2= new Anuncio();
        Anuncio anuncio3= new Anuncio();
        Anuncio anuncio4= new Anuncio();

        ComparadorTotal comparadorTotal= new ComparadorTotal();
        ComparadorTamaño comparadorTamaño= new ComparadorTamaño();
        ComparadorHabitaciones compadorHabitaciones= new ComparadorHabitaciones();
        ComparadorBase comparadorBase= new ComparadorBase();

        //CREAR ANUNCIOS
        @BeforeEach
        private void setAnuncios(){
            anuncio1.setAnuncio(11111, 1, 35, 1, 11111, 1, 250, "Calle Maria", 1, 40);
            anuncio2.setAnuncio(22222, 2, 25, 3, 22222, 2, 200, "Calle Juan", 2,35);
            anuncio3.setAnuncio(33333, 2, 30, 2, 33333, 3, 250,"Calle Joan" , 2, 30);
            anuncio4.setAnuncio(44444, 3, 60, 3, 44444, 4, 230,"Calle Barcelona" , 3,30);
        }


        //RELLENAR LAS LISTAS CON LOS ANUNCIOS
        void setListas(){

            listTotal.add(anuncio2);
            listTotal.add(anuncio1);
            listTotal.add(anuncio3);
            listTotal.add(anuncio4);


            listTamaño.add(anuncio2);
            listTamaño.add(anuncio3);
            listTamaño.add(anuncio1);
            listTamaño.add(anuncio4);

            listBase.add(anuncio2);
            listBase.add(anuncio4);
            listBase.add(anuncio1);
            listBase.add(anuncio3);

            listHabitaciones.add(anuncio1);
            listHabitaciones.add(anuncio3);
            listHabitaciones.add(anuncio2);
            listHabitaciones.add(anuncio4);

            list.add(anuncio1);
            list.add(anuncio2);
            list.add(anuncio3);
            list.add(anuncio4);

        }


        //ORDENAR LISTAS
        @Test
         void sortList() {
              setAnuncios();
              setListas();

              Comparador comp = new Comparador();
              comp.setListAnuncios(list);

              comp.setComparatorAnuncio(comparadorTamaño);
              comp.sortList();
              assertEquals(list, listTamaño);

              comp.setComparatorAnuncio(compadorHabitaciones);
              comp.sortList();
              assertEquals(list, listHabitaciones);

              comp.setComparatorAnuncio(comparadorTotal);
              comp.sortList();
              assertEquals(list, listTotal);

              comp.setComparatorAnuncio(comparadorBase);
              comp.sortList();
              assertEquals(list, listBase);
        }


}
