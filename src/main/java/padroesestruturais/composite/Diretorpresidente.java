package padroesestruturais.composite;

public class Diretorpresidente {

    private Cargo ementa;

    public void setEmenta(Cargo ementa) {
        this.ementa = ementa;
    }

    public String getEmenta() {
        if (this.ementa == null) {
            throw new NullPointerException("Diretor sem ementa");
        }
        return this.ementa.getCargo();
    }
}
