package e2;

import java.util.Comparator;

public class ComparadorTamaño implements Comparator<Anuncio> {


    @Override
    public int compare(Anuncio a, Anuncio b) {
        return Integer.compare(a.getTamano(),b.getTamano() );
    }
}
