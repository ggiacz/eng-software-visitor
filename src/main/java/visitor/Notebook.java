package visitor;

public class Notebook implements Dispositivo {

    private String marca;
    private int memoriaRam;

    public Notebook(String marca, int memoriaRam) {
        this.marca = marca;
        this.memoriaRam = memoriaRam;
    }

    public String getMarca() {
        return marca;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.visitarNotebook(this);
    }
}
