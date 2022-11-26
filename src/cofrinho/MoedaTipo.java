package cofrinho;

import java.util.Locale;

public enum MoedaTipo {
    REAL(1.0, new Locale("pt","BR")),
    DOLLAR(2.0, new Locale("en","US")),
    EURO(3.0, new Locale(Locale.ITALIAN.getCountry(), "IT")),
    LIBRAS_ESTERLINAS(5.0, new Locale(Locale.UK.getLanguage(), Locale.UK.getCountry()));

    private double cambio;
    private Locale local;

    private MoedaTipo(double cambio, Locale local) {
        this.cambio = cambio;
        this.local= local;
    }

    public double cambio() {
        return this.cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = Math.abs(cambio);
    }
    public Locale local(){return this.local;}
}
