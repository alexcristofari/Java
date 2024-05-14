package package1;

public class Computador {
    private String marca;
    private String modelo;
    private String tipo;
    private double preco;

    public Computador(String marca, String modelo, String tipo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }
}
