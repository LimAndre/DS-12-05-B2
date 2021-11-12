package e2;

import java.util.Comparator;

public class ComparadorHabitaciones implements Comparator<Anuncio> {

    @Override
    public int compare(Anuncio a, Anuncio b) {
        return Integer.compare(a.getNumHabitaciones(), b.getNumHabitaciones());
    }
}
