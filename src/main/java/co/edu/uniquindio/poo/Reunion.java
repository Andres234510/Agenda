package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Reunion {
    private String descripcion;
    private String fecha; // Considera usar Date para manipulación de fechas más avanzada
    private String hora; // Considera usar Time para manipulación de horas
    private final List<Contacto> asistentes;

    public Reunion(String descripcion, String fecha, String hora) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.asistentes = new ArrayList<>();
    }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public List<Contacto> getAsistentes() { return asistentes; }

    /**
     * 
     * @param contacto
     */
    public void agregarAsistente(Contacto contacto) {
        if (!asistentes.contains(contacto)) {
            asistentes.add(contacto);
        } else {
            System.out.println("El contacto ya está asignado como asistente.");
        }
    }

    public void eliminarAsistente(Contacto contacto) {
        asistentes.remove(contacto);
    }

    @Override
    public String toString() {
        return "Reunion: {" +
                "descripcion = '" + descripcion + '\n' +
                ", fecha = '" + fecha + '\n' +
                ", hora = '" + hora + '\n' +
                ", asistentes = " + asistentes +
                '}';
    }
}

