package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparator implements Comparator<Contacto>{

    @Override
    public int compare(Contacto o1, Contacto o2) {
        // Primero  el Apellido en orden Alfabetico
        int comparatorApellido = o1.getApellido().compareToIgnoreCase(o2.getApellido());
        
        if(comparatorApellido !=0){
            return comparatorApellido;
        }

        return o1.getNombre().compareToIgnoreCase(o2.getNombre());

        
    }
   
}