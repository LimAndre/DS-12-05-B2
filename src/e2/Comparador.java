package e2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparador {

    ArrayList<Anuncio> listAnuncios;
    Comparator<Anuncio> comparatorAnuncio;

    public Comparador(){
        this.listAnuncios= new ArrayList<>();
    }

    public void setListAnuncios(ArrayList<Anuncio> listAnuncios) {
        this.listAnuncios = listAnuncios;
    }

    public void setComparatorAnuncio(Comparator<Anuncio> comparatorAnuncio) {
        this.comparatorAnuncio = comparatorAnuncio;
    }

    public void sortList(){
        listAnuncios.sort(comparatorAnuncio);
    }

}
