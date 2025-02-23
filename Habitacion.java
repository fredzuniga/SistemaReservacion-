
package Habitacion;

public class Habitacion {
     // atributos
    private int cantidad_huespedes;
    private int numero_camas;
    private boolean disponibilidad;
    private int numero_maximo_huespedes;
    private double precio_noche;
    private double precio_adicional_persona;
    private boolean disponibilidad_banio;
    private int tipo_habitacion; //

    // Constructores
    public Habitacion() {
    }

    public Habitacion(int cantidad_huespedes, int numero_camas, boolean disponibilidad, int numero_maximo_huespedes, double precio_noche, double precio_adicional_persona, boolean disponibilidad_banio, int tipo_habitacion) {
        this.cantidad_huespedes = cantidad_huespedes;
        this.numero_camas = numero_camas;
        this.disponibilidad = disponibilidad;
        this.numero_maximo_huespedes = numero_maximo_huespedes;
        this.precio_noche = precio_noche;
        this.precio_adicional_persona = precio_adicional_persona;
        this.disponibilidad_banio = disponibilidad_banio;
        this.tipo_habitacion = tipo_habitacion;
    }

    public int getCantidad_huespedes() {
        return cantidad_huespedes;
    }

    public void setCantidad_huespedes(int cantidad_huespedes) {
        this.cantidad_huespedes = cantidad_huespedes;
    }

    public int getNumero_camas() {
        return numero_camas;
    }

    public void setNumero_camas(int numero_camas) {
        this.numero_camas = numero_camas;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getNumero_maximo_huespedes() {
        return numero_maximo_huespedes;
    }

    public void setNumero_maximo_huespedes(int numero_maximo_huespedes) {
        this.numero_maximo_huespedes = numero_maximo_huespedes;
    }

    public double getPrecio_noche() {
        return precio_noche;
    }

    public void setPrecio_noche(double precio_noche) {
        this.precio_noche = precio_noche;
    }

    public double getPrecio_adicional_persona() {
        return precio_adicional_persona;
    }

    public void setPrecio_adicional_persona(double precio_adicional_persona) {
        this.precio_adicional_persona = precio_adicional_persona;
    }

    public boolean isDisponibilidad_banio() {
        return disponibilidad_banio;
    }

    public void setDisponibilidad_banio(boolean disponibilidad_banio) {
        this.disponibilidad_banio = disponibilidad_banio;
    }

    public int getTipo_habitacion() {
        return tipo_habitacion;
    }

    public void setTipo_habitacion(int tipo_habitacion) {
        this.tipo_habitacion = tipo_habitacion;
    }

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
    

