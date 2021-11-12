package e2;

import java.util.Objects;

public class Anuncio implements Comparable<Anuncio>{
    int numRef;
    int codigoPostal;
    int numHabitaciones;
    int numBanos;
    int piso;
    int plazasGaraje;
    int tamano;
    double precioGaraje;
    double precio;
    double precioTotal;
    String direccion;

    public double getPrecioGaraje() {
        return precioGaraje;
    }
    public int getPlazasGaraje() {
        return plazasGaraje;
    }
    public int getTamano() {
        return tamano;
    }
    public int getNumRef() {
        return numRef;
    }
    public int getCodigoPostal() {
        return codigoPostal;
    }
    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    public int getNumBanos() {
        return numBanos;
    }
    public int getPiso() {
        return piso;
    }
    public double getPrecioBase() {
        return precio;
    }
    public double getPrecioTotal() {
        this.precioTotal=precio+(this.precioGaraje)*(this.getPlazasGaraje());
        return precioTotal;
    }
    public String getDireccion() {
        return direccion;
    }


    public void setAnuncio(int numRef,int numBanos,int tamaño, int numHabitaciones, int codigoPostal, int piso, double precio, String direccion,int plazasGaraje, double precioGaraje ){
        this.numRef= numRef;
        this.numBanos=numBanos;
        this.numHabitaciones=numHabitaciones;
        this.codigoPostal=codigoPostal;
        this.piso=piso;
        this.direccion=direccion;
        this.plazasGaraje= plazasGaraje;
        this.tamano= tamaño;
        this.precio=precio;
        this.precioGaraje=precioGaraje;
    }

    @Override
    public int compareTo(Anuncio a) {
        return Integer.compare(this.numRef, a.numRef);
    }

    @Override
    public boolean equals(Object o) {
        var a = (Anuncio) o;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anuncio anuncio = (Anuncio) o;

        if (this.getNumRef() != a.getNumRef())return false;
        if(this.getCodigoPostal() != a.getCodigoPostal()) return false;
        if(this.getNumHabitaciones()!= a.getNumHabitaciones()) return false;
        if(this.getNumBanos() != a.getNumBanos()) return false;
        if (this.getPiso() != a.getPiso()) return false;
        if(this.getPlazasGaraje() != a.getPlazasGaraje()) return false;
        if(this.getTamano() != a.getTamano())return false;
        if(this.getPrecioGaraje() != a.getPrecioGaraje()) return false;
        if(this.getPrecioBase() != a.getPrecioBase()) return false;
        if(this.getPrecioTotal() != a.getPrecioTotal()) return false;
        return Objects.equals(this.getDireccion(), a.getDireccion());
    }

    @Override
    public int hashCode() {
        int result =0;
        long temp;

        result= 31 * result+ numRef;
        result= 31 * result+ numBanos;
        result= 31 * result+ numHabitaciones;
        result= 31 * result+ tamano;
        result= 31 * result+ codigoPostal;
        result= 31 * result+ piso;
        result= 31 * result+ plazasGaraje;
        temp = Double.doubleToLongBits(precio);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(precioGaraje);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(precioTotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));

        return result;

    }
}
