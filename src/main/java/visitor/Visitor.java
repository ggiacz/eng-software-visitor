package visitor;

public interface Visitor {

    String visitarNotebook(Notebook notebook);

    String visitarCelular(Celular celular);

    String visitarTelevisao(Televisao televisao);
}
