package actividad_1.concesionario;

public class Venta {
    long monto_De_Venta;
    int ID_Vehiculo_Vendido;
    String Nombre_Comprador;
    String Apellido_Comprador;
    long ID_Comprador;
    
    public String toString() {
        return "Venta del vehículo ID#" + ID_Vehiculo_Vendido +
           " a nombre de " + Nombre_Comprador + " " + Apellido_Comprador + " Con ID: " + ID_Comprador +
           " por $" + monto_De_Venta;
    }
}
