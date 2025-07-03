package controllers;
import java.util.*;
import models.Contacto;
import utils.ContactoComparadorConNumero;
import utils.ContactoComparator;

public class ContactoController {
    public ContactoController(){
        runTreeContacto();
        runTreeContactoComparador();
    }
    private void runTreeContacto(){
        Set<Contacto> contactos = new TreeSet<>(new ContactoComparator());
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez", "123456789"));
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));

        for( Contacto contacto : contactos ){
            System.out.println(contacto);
        }
    }
    private void runTreeContactoComparador(){
        Set<Contacto> contactos = new TreeSet<>(new ContactoComparadorConNumero() );
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez", "123456789"));
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        System.out.println();

        System.out.println("------Contactos orden alfabetico apellido - nombre - telefono(des)------");
        for(Contacto contacto : contactos) {
            System.out.println(contacto.getNombre() + " " + contacto.getApellido() + " - " + contacto.getTelefono());
        }
    }

}