package e2;

import java.util.Comparator;

public class ComparadorTotal implements Comparator<Anuncio> {

    @Override
    public int compare(Anuncio a, Anuncio b) {
        return Double.compare(a.getPrecioTotal(), b.getPrecioTotal());
    }
}
