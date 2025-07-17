 package repaso_ej1_Proyecto;

public class Subsidio {
    private double montoSolicitado;
    private String motivo;
    private boolean otorgado;

    public Subsidio(double montoSolicitado, String motivo) {
        this.setMontoSolicitado (montoSolicitado) ;
        this.setMotivo (motivo) ;
        this.setOtorgado (false) ;
    }

    public double getMontoSolicitado() {
        return montoSolicitado;
    }

    public void setMontoSolicitado(double montoSolicitado) {
        this.montoSolicitado = montoSolicitado;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public boolean isOtorgado() {
        return otorgado;
    }

    public void setOtorgado(boolean otorgado) {
        this.otorgado = otorgado;
    }
    
    public double getDineroOtorgado(){
        if (this.isOtorgado()) return this.getMontoSolicitado();
        else return 0;
    }
}
