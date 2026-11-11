public final class CarroElectrico extends Carro {
    private double capacidadBateria;
    private double autonomiaKm;

    

    public CarroElectrico(String marca, String modelo, int ano, double capacidadBateria, double autonomiaKm) {
        super(marca, modelo, ano, 0, "electrico");
        this.capacidadBateria = capacidadBateria;
        this.autonomiaKm = autonomiaKm;
    }

    @Override
    public double calcularConsumo(double km) {
        double kWh = (km / this.autonomiaKm) * this.capacidadBateria;
        System.out.println("Consumo para " + km + " km: " + kWh + " kWh (eléctrico)");
        return kWh;
    }

    public void cargarBateria() {
            System.out.println("Batería cargada al 100%");
            System.out.println("Autonomía disponible: " + this.autonomiaKm + " km");
        }



    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Carro Eléctrico");
        System.out.println("Capacidad batería: " + this.capacidadBateria + " kWh");
        System.out.println("Autonomía: " + this.autonomiaKm + " km");
    }
}