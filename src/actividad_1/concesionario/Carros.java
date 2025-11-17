
package actividad_1.concesionario;
import java.util.ArrayList;

public class Carros {
    ArrayList<Productos> listaAutos = new ArrayList<>();
        
        public Carros () {
            int i = 1;
            Productos carro1 = new Productos();
                carro1.ID_Vehiculo = 01;
                carro1.Marca = "Toyota";
                carro1.Tipo = "Sedan";
                carro1.Año = 2022;
                carro1.Kilometraje = 15000;

            Productos carro2 = new Productos();
                carro2.ID_Vehiculo = 2;
                carro2.Marca = "Mazda";
                carro2.Tipo = "SUV";
                carro2.Año = 2023;
                carro2.Kilometraje = 8000;

            listaAutos.add(carro1);
            listaAutos.add(carro2);
        
        for (Productos Vehiculo : listaAutos) {
        System.out.println("Vehiculo #" + i +": "+ Vehiculo);
        i +=1;
      }
    }
}