package padroesestruturais.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiretorpresidenteTest {

    @Test
    void deveRetornarEmentadiretorpresidente() {
        Funcionario funcionario001 = new Funcionario("analista");

        Funcionario funcionario002 = new Funcionario("analista");
        Gerente gerente001 = new Gerente("adm", 8);
        funcionario002.addCargo(gerente001);

        Funcionario funcionario003 = new Funcionario("analista");
        Gerente gerente002 = new Gerente("ti", 8);
        Gerente gerente003 = new Gerente("rh", 8);
        funcionario003.addCargo(gerente002);
        funcionario003.addCargo(gerente003);

        Funcionario ementa = new Funcionario("analista");
        ementa.addCargo(funcionario001);
        ementa.addCargo(funcionario002);
        ementa.addCargo(funcionario003);

        Diretorpresidente diretorpresidente = new Diretorpresidente();
        diretorpresidente.setEmenta(ementa);

    }

    @Test
    void deveRetornarExecacaodiretorpresidenteSemEmenta() {
        try {
            Diretorpresidente diretorpresidente = new Diretorpresidente();
            diretorpresidente.getEmenta();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Diretor sem ementa", e.getMessage());
        }
    }
}