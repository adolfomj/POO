package actividad_1.concesionario;
public class Productos {
        int ID_Vehiculo;
        String Marca;
        String Tipo;
        int Año;
        float Kilometraje;
        
        public String toString() {
            return "ID del Vehiculo: " + ID_Vehiculo +
                   ", Marca: " + Marca + 
                   ", Tipo: " + Tipo + 
                   ", Año: " + Año + 
                   ", Kilometraje: " + Kilometraje;
    }
}

