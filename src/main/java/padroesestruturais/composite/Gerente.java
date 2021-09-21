package padroesestruturais.composite;

public class Gerente extends Cargo {

    private int cargaHoraria;

    public Gerente(String descricao, int cargaHoraria) {
        super(descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getCargo() {
        return "Tópico: " + this.getDescricao() + " - carga horária: " + this.cargaHoraria + "\n";
    }

}
