public abstract class Vehiculo {
    
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadActual;

    public Vehiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadActual = 0.0;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    public double getVelocidadActual(){
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual){
        this.velocidadActual = velocidadActual;
    }
    
    public void acelerar(){
        this.velocidadActual = this.velocidadActual + 10;
        System.out.println("Acelerando... velocidad actual: " + this.velocidadActual + "km/h");
    }

    public void acelerar(int velocidadObjetivo) {
        if (velocidadObjetivo > this.velocidadActual){
            this.velocidadActual = velocidadObjetivo;
            System.out.println("Velocidad establecida en: " + this.velocidadActual + " km/h");
        } else {
            System.out.println("La velocidad objetivo debe ser mayor a la actual");
        }
    }

    public double calcularConsumo(double km) {
        double consumo = (km / 100.0) * 10;
        System.out.println("Consumo estimado para " + km + " km: " + consumo + "litros");
        return consumo;
    }

    public void frenar() {
        this.velocidadActual = 0;
        System.out.println("Vehículo detenido.");
    }

     public void mostrarInfo() {
        System.out.println("=== Información del Vehículo ===");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Año: " + this.ano);
        System.out.println("Velocidad actual: " + this.velocidadActual + " km/h");
    }

}