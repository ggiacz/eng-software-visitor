package visitor;

public class ManutencaoVisitor implements Visitor {

    public String realizarManutencao(Dispositivo dispositivo) {
        return dispositivo.aceitar(this);
    }

    @Override
    public String visitarNotebook(Notebook notebook) {
        return "Manutencao do notebook: " +
                notebook.getMarca() +
                " | Memoria RAM: " +
                notebook.getMemoriaRam() + "GB";
    }

    @Override
    public String visitarCelular(Celular celular) {
        return "Manutencao do celular: " +
                celular.getMarca() +
                " | Bateria: " +
                celular.getBateria() + "mAh";
    }

    @Override
    public String visitarTelevisao(Televisao televisao) {
        return "Manutencao da televisao: " +
                televisao.getMarca() +
                " | Polegadas: " +
                televisao.getPolegadas();
    }
}
