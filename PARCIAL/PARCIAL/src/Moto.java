public class Moto extends Vehiculo {

    
    private int cilindrada;
    private boolean esSportiva;

    public Moto(String marca, String modelo, int ano, int cilindrada, boolean esSportiva) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
        this.esSportiva = esSportiva;
    }



    @Override
    public final double calcularConsumo(double km) {
        double litros = km * (this.cilindrada / 150000.0);
        System.out.println("Consumo moto para " + km + " km: " + litros + " litros");
        return litros;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Motocicleta");
        System.out.println("Cilindrada: " + this.cilindrada + " cc");
        if (this.esSportiva) {
            System.out.println("Categoría: Deportiva");
        } else {
            System.out.println("Cateforía: Urbana");
        }
    }
    
}