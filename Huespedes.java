
package sistemareservacion;


public class Huespedes {
      private String nombre;
    private int edad;
    private int tipo_huesped;  // 1 reserva 2 huesped
    
    public Huespedes(String nombre, int edad, int tipo_huesped) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo_huesped = tipo_huesped;
    }
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTipo_huesped() {
        return tipo_huesped;
    }

    public void setTipo_huesped(int tipo_huesped) {
        this.tipo_huesped = tipo_huesped;
    }
    
    
}
    

