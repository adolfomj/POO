package actividad_1.concesionario;
import java.util.Scanner;
import actividad_1.concesionario.Carros;
import actividad_1.concesionario.Motos;

public class Main {
    public static void main(String[] args) {   
        
    Scanner sc = new Scanner(System.in);

        String texto = "";
        
        
        while (!texto.equalsIgnoreCase("salir")) {
            System.out.print("¿Deseas ver los vehiculos disponibles? \n Escribe: \n 1 para si \n 2 para comprar un vehiculo \n salir \n :");
            texto = sc.nextLine();
            System.out.println("Tu escribiste: " + texto);
            
                if ("1".equals(texto)){
                    Carros c = new Carros();
                    Motos m = new Motos();
                    System.out.println("Pulsa "+"enter"+" para continuar");
                    texto = sc.nextLine();

                    System.out.println("-----------------------------------------------------------------------");
                }
                if ("2".equals(texto)){
                    Venta v = new Venta();
                    System.out.println("Ingrese los datos para la facutracion ");

                    // Monto de venta
                    System.out.println("Ingresa el monto de la venta: ");
                    v.monto_De_Venta = sc.nextLong();

                    sc.nextLine();

                    // ID del vehículo vendido
                    System.out.println("Ingresa el ID del vehículo vendido: ");
                    v.ID_Vehiculo_Vendido = sc.nextInt();

                    sc.nextLine();

                    // Nombre del comprador
                    System.out.println("Ingresa el nombre del comprador: ");
                    v.Nombre_Comprador = sc.nextLine();

                    // Apellido del comprador
                    System.out.println("Ingresa el apellido del comprador: ");
                    v.Apellido_Comprador = sc.nextLine();

                    // ID del comprador
                    System.out.println("Ingresa el ID del comprador: ");
                    v.ID_Comprador = sc.nextLong();

            System.out.println("Los datos ingresados son: "+ v);
                }
            }

        System.out.println("Programa terminado.");
    }
}

