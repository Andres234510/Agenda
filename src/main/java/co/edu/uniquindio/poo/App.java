package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.Grupo.Categoria;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // Crear contactos
        Contacto contacto1 = new Contacto("Juan Pérez", "Juampi", "Calle 123", "555-1234", "juan@example.com");
        Contacto contacto2 = new Contacto("María López", "Mari", "Avenida 456", "555-5678", "maria@example.com");
        Contacto contacto3 = new Contacto("Carlos Ruiz", "Carl", "Boulevard 789", "555-7890", "carlos@example.com");

        // Crear grupos
        Grupo grupoAmigos = new Grupo("Amigos del Colegio", Categoria.AMIGOS);
        Grupo grupoOficina = new Grupo("Equipo de Trabajo", Categoria.OFICINA);

        // Agregar contactos a los grupos
        grupoAmigos.agregarContacto(contacto1);
        grupoAmigos.agregarContacto(contacto2);

        grupoOficina.agregarContacto(contacto1); // Un contacto puede estar en varios grupos
        grupoOficina.agregarContacto(contacto3);

        // Crear una reunión
        Reunion reunion = new Reunion("Reunión de Proyecto", "2024-09-15", "10:00 AM");

        // Agregar asistentes a la reunión
        reunion.agregarAsistente(contacto1);
        reunion.agregarAsistente(contacto3);

        // Mostrar la información
        System.out.println(grupoAmigos);
        System.out.println(grupoOficina);
        System.out.println(reunion);

        // Intentar agregar más de 5 contactos a un grupo
        grupoAmigos.agregarContacto(contacto3);
        grupoAmigos.agregarContacto(new Contacto("Ana García", "Anita", "Calle 321", "555-4321", "ana@example.com"));
        grupoAmigos.agregarContacto(new Contacto("Pedro Rodríguez", "Pedrito", "Avenida 654", "555-6543", "pedro@example.com"));
        grupoAmigos.agregarContacto(new Contacto("Laura Fernández", "Laurita", "Boulevard 987", "555-9876", "laura@example.com"));
        grupoAmigos.agregarContacto(new Contacto("Alberto Gómez", "Beto", "Calle 101", "555-1010", "alberto@example.com")); // Este no se debería agregar

        System.out.println(grupoAmigos);
    }
}

