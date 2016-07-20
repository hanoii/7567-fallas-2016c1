package ar.uba.fi.fallas;

public class Parser {
	public enum Cantidad {
	    NADA, POCO, FRECUENTE, MUCHO
	}
    public enum Complejidad {
        SIMPLE, NORMAL, COMPLEJA
    }

    public enum Formalidad {
        SIR, MADAM, MS, MR, NOMBRE, APODO
    }

    public enum Cortesia {
        YOURS_SINCERELY, YOURS_FAITHFULLY, YOURS, REGARDS, LOVE, BEST_WISHES
    }

    public enum Firma {
        APODO, NOMBRE, NOMBRE_APELLIDO
    }


    private Cortesia saludo;
    private Formalidad forma;
    private Complejidad oraciones;
    private Cantidad pasiva;
    private Cantidad formal;
    private Cantidad contracciones;
    private Firma firma;
    

    public Cortesia getSaludo() {
        return saludo;
    }

    public void setSaludo(Cortesia saludo) {
        this.saludo = saludo;
    }

    public Complejidad getOraciones() {
        return oraciones;
    }

    public void setOraciones(Complejidad oraciones) {
        this.oraciones = oraciones;
    }

    public Formalidad getForma() {
        return forma;
    }

    public void setForma(Formalidad forma) {
        this.forma = forma;
    }

    public Cantidad getPasiva() {
        return pasiva;
    }

    public void setPasiva(Cantidad pasiva) {
        this.pasiva = pasiva;
    }

    public Cantidad getContracciones() {
        return contracciones;
    }

    public void setContracciones(Cantidad contracciones) {
        this.contracciones = contracciones;
    }

    public Cantidad getFormal() {
        return formal;
    }

    public void setFormal(Cantidad formal) {
        this.formal = formal;
    }

    public Firma getFirma() {
        return firma;
    }

    public void setFirma(Firma firma) {
        this.firma = firma;
    }
}
