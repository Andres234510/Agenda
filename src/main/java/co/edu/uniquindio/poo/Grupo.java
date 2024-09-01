package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nombre;
    private Categoria categoria;
    private final List<Contacto> contactos;

    public Grupo(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.contactos = new ArrayList<>();
    }

    public enum Categoria {
    OFICINA,
    FIESTA,
    AMIGOS,
    FAMILIA
}


    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    public List<Contacto> getContactos() { return contactos; }

    public void agregarContacto(Contacto contacto) {
        if (contactos.size() < 5 && !contactos.contains(contacto)) {
            contactos.add(contacto);
        } else {
            System.out.println("No se puede agregar más contactos o contacto duplicado.");
        }
    }

    public void eliminarContacto(Contacto contacto) {
        contactos.remove(contacto);
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                ", contactos=" + contactos +
                '}';
    }
}