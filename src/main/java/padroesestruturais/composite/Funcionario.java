package padroesestruturais.composite;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Cargo {

    private List<Cargo> Cargos;

    public Funcionario(String descricao) {
        super(descricao);
        this.Cargos = new ArrayList<Cargo>();
    }

    public void addCargo(Cargo Cargo) {
        this.Cargos.add(Cargo);
    }

    public String getCargo() {
        String saida = "";
        saida = "funcionario: " + this.getDescricao() + "\n";
        for (Cargo Cargo : Cargos) {
            saida += Cargo.getCargo();
        }
        return saida;
    }
}
