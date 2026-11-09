package visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ManutencaoVisitorTest {

    @Test
    void deveRealizarManutencaoNotebook() {
        Notebook notebook = new Notebook("Dell Inspiron", 16);

        ManutencaoVisitor visitor = new ManutencaoVisitor();

        assertEquals(
                "Manutencao do notebook: Dell Inspiron | Memoria RAM: 16GB",
                visitor.realizarManutencao(notebook)
        );
    }

    @Test
    void deveRealizarManutencaoCelular() {
        Celular celular = new Celular("Galaxy S24", 4000);

        ManutencaoVisitor visitor = new ManutencaoVisitor();

        assertEquals(
                "Manutencao do celular: Galaxy S24 | Bateria: 4000mAh",
                visitor.realizarManutencao(celular)
        );
    }

    @Test
    void deveRealizarManutencaoTelevisao() {
        Televisao televisao = new Televisao("LG OLED", 55);

        ManutencaoVisitor visitor = new ManutencaoVisitor();

        assertEquals(
                "Manutencao da televisao: LG OLED | Polegadas: 55",
                visitor.realizarManutencao(televisao)
        );
    }
}
