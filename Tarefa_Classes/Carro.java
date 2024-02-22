public class Carro {
    // Propriedades
    private String marca;
    private String modelo;
    private boolean ligado;

    // Construtor
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = false; // Carro começa desligado
    }

    // Método para ligar o carro
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro está ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    // Método para buzinar
    public void buzinar() {
        System.out.println("Beeeep! Beeeep!");
    }
}
