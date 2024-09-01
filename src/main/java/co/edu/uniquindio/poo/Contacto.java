package co.edu.uniquindio.poo;

public class Contacto {
    private String nombre;
    private String alias;
    private String direccion;
    private String telefono;
    private String email;

    /**
     * Creacion del constructor
     * @param nombre 
     * @param alias
     * @param direccion
     * @param telefono
     * @param email
     */
    public Contacto(String nombre, String alias, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.alias = alias;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    // Getters y setters para cada atributo
    public String getNombre() { 
        return nombre; 
    }
    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }

    public String getAlias() { 
        return alias; 
    }
    public void setAlias(String alias) { 
        this.alias = alias; 
    }

    public String getDireccion() { 
        return direccion; 
    }
    public void setDireccion(String direccion) { 
        this.direccion = direccion; 
    }

    public String getTelefono() { 
        return telefono; 
    }
    public void setTelefono(String telefono) { 
        this.telefono = telefono; 
    }

    public String getEmail() { 
        return email; 
    }
    public void setEmail(String email) { 
        this.email = email; 
    }
    
    /**
     * Línea 1: Verifica si el objeto que se está comparando es el mismo que el objeto actual.
     * Línea 2: Verifica si el objeto que se está comparando es nulo o si pertenece a una clase diferente.
     * Línea 3: Realiza un cast del objeto genérico 'obj' a un objeto de tipo 'Contacto'.
     * Línea 3: Realiza un cast del objeto genérico 'obj' a un objeto de tipo 'Contacto'.
     * @return  Si ambos atributos son iguales, retorna true; de lo contrario, retorna false.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Contacto contacto = (Contacto) obj;
        
        return nombre.equals(contacto.nombre) && telefono.equals(contacto.telefono);
    }

    /**
     * Línea 1: Calcula el código hash del atributo 'nombre' utilizando el método hashCode() de la clase String.
     * Este valor se almacena en la variable 'result'.
     * Línea 2: Multiplica el valor actual de 'result' por 31 y le suma el código hash del atributo 'telefono'.
     * Esta operación combina los códigos hash de 'nombre' y 'telefono' para producir un código hash único para el objeto.
     * @return  Retorna el valor final de 'result' como el código hash del objeto.
     */
    @Override
    public int hashCode() {
        int result = nombre.hashCode();
        result = 31 * result + telefono.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return '\n' + "Contacto: {" +
                "nombre = '" + nombre + '\n' +
                ", alias = '" + alias + '\n' +
                ", direccion = '" + direccion + '\n' +
                ", telefono = '" + telefono + '\n' +
                ", email ='" + email + '\n' +
                '}' + '\n';
    }
}
