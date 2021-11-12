package e2;

import java.util.Comparator;

public class ComparadorBase implements Comparator<Anuncio> {

    @Override
    public int compare(Anuncio a, Anuncio b) {
        return Double.compare(a.getPrecioBase(), b.getPrecioBase());
    }
}
