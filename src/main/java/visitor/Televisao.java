package visitor;

public class Televisao implements Dispositivo {

    private String marca;
    private int polegadas;

    public Televisao(String marca, int polegadas) {
        this.marca = marca;
        this.polegadas = polegadas;
    }

    public String getMarca() {
        return marca;
    }

    public int getPolegadas() {
        return polegadas;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.visitarTelevisao(this);
    }
}
