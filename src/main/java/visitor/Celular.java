package visitor;

public class Celular implements Dispositivo {

    private String marca;
    private int bateria;

    public Celular(String marca, int bateria) {
        this.marca = marca;
        this.bateria = bateria;
    }

    public String getMarca() {
        return marca;
    }

    public int getBateria() {
        return bateria;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.visitarCelular(this);
    }
}
