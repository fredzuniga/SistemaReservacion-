
package sistemareservacion;

import Habitacion.Habitacion;
import java.util.ArrayList;
import java.util.Date;

public class Reservacion {
     private int cantidad_huepedes;
    private int cantidad_noches;
    private int id;
    private static int conteo = 1;
    private Habitacion habitacion_reservada;
    private Date fecha_inicio;
    private Date fecha_fin;
    ArrayList<Huespedes> lista_huespedes;
    private double costo_reservacion;

    

    public Reservacion(int cantidad_huepedes, int cantidad_noches, Habitacion habitacion_reservada, Date fecha_inicio, Date fecha_fin, ArrayList<Huespedes> lista_huespedes, double costo_reservacion) {
        this.cantidad_huepedes = cantidad_huepedes;
        this.cantidad_noches = cantidad_noches;
        this.habitacion_reservada = habitacion_reservada;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.lista_huespedes = lista_huespedes;
        this.costo_reservacion = costo_reservacion;
        this.id = conteo++;
    }

    public void mostrarDetalleReservacion(){
        System.out.println("Identificado : " + id);
        System.out.println("Cantidad de huespedes " + cantidad_huepedes);
        System.out.println("Fecha inicio: " + fecha_inicio);
        System.out.println("Fecha fin: " + fecha_fin);
        System.out.println("Listado de huespedes");
        for(int i = 0; i < lista_huespedes.size(); i++){
            System.out.println("Nombre del huesped" + lista_huespedes.get(i).getNombre()  );
            System.out.println("Edad del huesped" + lista_huespedes.get(i).getEdad()  );
            int tipo = lista_huespedes.get(i).getTipo_huesped();
            if(tipo == 1)
                System.out.println("Reservó");
            System.out.println("-------------------------------");
        
        }
    }

    public int getCantidad_huepedes() {
        return cantidad_huepedes;
    }

    public void setCantidad_huepedes(int cantidad_huepedes) {
        this.cantidad_huepedes = cantidad_huepedes;
    }

    public int getCantidad_noches() {
        return cantidad_noches;
    }

    public void setCantidad_noches(int cantidad_noches) {
        this.cantidad_noches = cantidad_noches;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getConteo() {
        return conteo;
    }

    public static void setConteo(int conteo) {
        Reservacion.conteo = conteo;
    }

    public Habitacion getHabitacion_reservada() {
        return habitacion_reservada;
    }

    public void setHabitacion_reservada(Habitacion habitacion_reservada) {
        this.habitacion_reservada = habitacion_reservada;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public ArrayList<Huespedes> getLista_huespedes() {
        return lista_huespedes;
    }

    public void setLista_huespedes(ArrayList<Huespedes> lista_huespedes) {
        this.lista_huespedes = lista_huespedes;
    }
    
    public double getCosto_reservacion() {
        return costo_reservacion;
    }

    public void setCosto_reservacion(double costo_reservacion) {
        this.costo_reservacion = costo_reservacion;
    }
    
}

