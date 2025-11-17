
package actividad_1.concesionario;
import java.util.ArrayList;

public class Motos {
    ArrayList<Productos> listaMotos = new ArrayList<>();

        public Motos() {
            int i = 1;
            Productos moto1 = new Productos();
                moto1.ID_Vehiculo = 3;
                moto1.Marca = "Yamaha";
                moto1.Tipo = "Deportiva";
                moto1.Año = 2021;
                moto1.Kilometraje = 5000;

            Productos moto2 = new Productos();
                moto2.ID_Vehiculo = 4;
                moto2.Marca = "Honda";
                moto2.Tipo = "Scooter";
                moto2.Año = 2022;
                moto2.Kilometraje = 3000;

            listaMotos.add(moto1);
            listaMotos.add(moto2);

        for (Productos moto : listaMotos) {
            System.out.println("Moto #" + i + ": " + moto);
            i++;
        }
    }
}

