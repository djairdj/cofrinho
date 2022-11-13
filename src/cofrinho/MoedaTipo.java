package cofrinho;

public enum MoedaTipo {
    REAL(1.0), DOLLAR(2.0), EURO(3.0);

    private double cambio;

    private MoedaTipo(double cambio) {
        this.cambio = cambio;
    }

    public double cambio() {
        return this.cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = Math.abs(cambio);
    }
}
