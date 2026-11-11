public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 1600, "gasolina");
        CarroElectrico electrico = new CarroElectrico("Tesla", "Model 3", 2023, 75.0, 500.0);
        Moto moto = new Moto("Honda", "CB500", 2021, 500, true);

        System.out.println("// Demostrar SOBRECARGA de acelerar");
        carro.acelerar();
        carro.acelerar();
        carro.acelerar(120);
        
        electrico.acelerar(80);
        
        moto.acelerar();
        moto.acelerar(150);

        System.out.println("\n// Demostrar SOBREESCRITURA de calcularConsumo");
        carro.calcularConsumo(300);
        electrico.calcularConsumo(300);
        moto.calcularConsumo(300);

        System.out.println("\n// Frenar todos");
        carro.frenar();
        electrico.frenar();
        moto.frenar();

        System.out.println("// Cargar batería del eléctrico");
        electrico.cargarBateria();

        System.out.println("\n// Mostrar información de todos");
        carro.mostrarInfo();
        electrico.mostrarInfo();
        moto.mostrarInfo();

        System.out.println(" // Usar polimorfismo: arreglo de Vehiculo");
        Vehiculo[] flota = {carro, electrico, moto};

        for (Vehiculo vehiculo : flota) {
            vehiculo.calcularConsumo(100);
        }

    }
}