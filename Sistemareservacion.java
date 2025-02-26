
package sistemareservacion;

import Habitacion.Habitacion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class Sistemareservacion {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bienvenido al Sistema RHH ");
        System.out.println("Elige una opcion");
        int opcion = 0;
        ArrayList<Habitacion> lista_habitaciones = new ArrayList<>();
        ArrayList<Reservacion> lista_reservaciones = new ArrayList<>();
        lista_habitaciones.add(new Habitacion(4,2,true,5,1000.00,500.00,true,1));
        lista_habitaciones.add(new Habitacion(2,2,true,3,900.00,400.00,true,1));
        lista_habitaciones.add(new Habitacion(4,2,true,5,1300.00,600.00,true,2));
                    
        do{
            System.out.println("0.- Salir del sistema");
            System.out.println("1.- Agregar habitacion al sistema");
            System.out.println("2.- Listar habitaciones del sistema");
            System.out.println("3.- Registrar reservacion");
            System.out.println("4.- Lista de reservaciones");
            System.out.println("5.- Reporte de reservaciones");
             System.out.println("10.- Listar habitaciones del sistema");
            opcion = Integer.parseInt(reader.readLine());
            switch(opcion){
                case 1:
                    System.out.println("Agregar habitacion");
                    int cantidad_habitacion_registrar = 0;
                    System.out.println("Indica la cantidad de habitacione a agregar");
                    cantidad_habitacion_registrar =  Integer.parseInt(reader.readLine());
                    for(int i = 0; i < cantidad_habitacion_registrar; i++){
                        // habitación por habitación, una por una
                        System.out.println("Indica la cantidad cantidad_huespedes de la habitacion " + (i + 1) );
                        int cantidad_huespedes =  Integer.parseInt(reader.readLine());
                        System.out.println("Indica la cantidad numero_camas de la habitacion " + (i + 1) );
                        int numero_camas =  Integer.parseInt(reader.readLine());
                        
                        Habitacion nueva_habitacion = new Habitacion();
                        nueva_habitacion.setCantidad_huespedes(cantidad_huespedes);
                        nueva_habitacion.setNumero_camas(numero_camas);
                        lista_habitaciones.add(nueva_habitacion);
                    }
                    //System.out.println(lista_habitaciones);
                    break;
                case 2:
                    System.out.println("Lista de habitaciones");
                    //System.out.println("boolean test --> " + lista_habitaciones.isEmpty());
                    if(lista_habitaciones.isEmpty()){
                        System.out.println("No hay habitaciones registradas");
                    }else{
                        for(int i = 0; i < lista_habitaciones.size(); i++){
                            System.out.println(lista_habitaciones.get(i).toString());
                        }
                    }
                    //lista_habitaciones.forEach(habitacion -> System.out.println("getCantidad_huespedes: " + habitacion.getCantidad_huespedes()));
                    break;
                case 3:
                    System.out.println("Nueva reservacion");
                    try {
                        System.out.println("Indica el numero de habitacion a reservar");
                        int numero_habitacion = Integer.parseInt(reader.readLine());
                        Habitacion habitacion_reservada = null;
                        
                        for(int i = 0; i < lista_habitaciones.size(); i++){
                            if(lista_habitaciones.get(i).getId() == numero_habitacion){
                                habitacion_reservada = lista_habitaciones.get(i);
                                break;
                            }
                        }
                        if(habitacion_reservada == null){
                            System.out.println("Error, no existe la habitacion buscada");
                            break;
                        }
                        
                        System.out.println("Indica la cantidad de noches");
                        int cantidad_noches = Integer.parseInt(reader.readLine());
                        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); // Formato de fecha
                        System.out.println("Indica la fecha de inicio de reservacion: ");
                        String fechaTextoInicio = reader.readLine();
                        System.out.println("Indica la fecha de fin de reservacion: ");
                        String fechaTextoFin = reader.readLine();
                        Date fecha_inicio = formatter.parse(fechaTextoInicio); // Convertir a Date
                        Date fecha_fin = formatter.parse(fechaTextoFin); // Convertir a Date
                        
                        System.out.println("Indica la cantidad de huespedes");
                        int numero_huespedes = Integer.parseInt(reader.readLine());
                        while(numero_huespedes <= 0){
                            System.out.println("Error, cantidad de huespede invalido");
                            numero_huespedes = Integer.parseInt(reader.readLine());
                        }
                        while(numero_huespedes > habitacion_reservada.getNumero_maximo_huespedes()){
                            System.out.println("Error, ingresa una cantidad menor de huespedes");
                            numero_huespedes = Integer.parseInt(reader.readLine());
                        }
                        ArrayList<Huespedes> lista_huespedes = new ArrayList<>();
                        for(int i = 0; i < numero_huespedes; i++){
                            System.out.println("Datos del huesped " + (i+1));
                            System.out.println("Indica el nombre del huesped");
                            String nombre_huesped = reader.readLine();
                            System.out.println("Indica la edad del huesped");
                            int edad = Integer.parseInt(reader.readLine());
                            System.out.println("Indica si es el reservante(1) / normal (2)");
                            int reservante = Integer.parseInt(reader.readLine());
                            lista_huespedes.add(new Huespedes(nombre_huesped, edad, reservante));
                        }
                        double costo_reservacion = cantidad_noches * habitacion_reservada.getPrecio_noche();
                        lista_reservaciones.add(new Reservacion(numero_huespedes, habitacion_reservada.getNumero_camas(), habitacion_reservada, fecha_inicio, fecha_fin,lista_huespedes, 0));
                        System.out.println("Reservación guardada exitosamente");
                        
                    } catch (IOException e) {
                        System.out.println("Error de entrada/salida: " + e.getMessage());
                    } catch (ParseException e) {
                        System.out.println("Formato de fecha inválido. Use dd/MM/yyyy.");
                    }
                    
                    
                    break;
                case 4:
                    System.out.println("Listado de reservaciones");
                    if(lista_reservaciones.isEmpty()){
                        System.out.println("No hay reservaciones registradas");
                    }else{
                        for(int i = 0; i < lista_reservaciones.size(); i++){
                            lista_reservaciones.get(i).mostrarDetalleReservacion();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Reporte del día");
                    System.out.println("Cantidad de reservaciones " + lista_reservaciones.size());
                    double cobro_total = 0;
                    for(int i = 0; i < lista_reservaciones.size(); i++){
                        cobro_total += lista_reservaciones.get(i).getCosto_reservacion();
                    }
                    System.out.println("Total cobrado: " + cobro_total);
                    
                case 10:
                    break;
                default:
                    if(opcion != 0) // sí opcion es diferente a 0 ?
                        System.out.println("Opción no valida");
                    break;
            }
        }while(opcion != 0); 
        
        
    } 
}

    
        
