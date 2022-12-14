
package Modelo;

public class Atencion {
    private String fecha;
    private int rutMedico;
    private int codigoMascota;
    private String procedimiento;
    private String observaciones;
    private int valor;

    public Atencion() {
        this.fecha = "";
        this.rutMedico = 0;
        this.codigoMascota = 0;
        this.procedimiento = "";
        this.observaciones = "";
        this.valor = 0;
    }
        
    public Atencion(String fecha, int rutMedico, int codigoMascota, String procedimiento, String observaciones, int valor) {
        this.fecha = fecha;
        this.rutMedico = rutMedico;
        this.codigoMascota = codigoMascota;
        this.procedimiento = procedimiento;
        this.observaciones = observaciones;
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getRutMedico() {
        return rutMedico;
    }

    public void setRutMedico(int rutMedico) {
        this.rutMedico = rutMedico;
    }

    public int getCodigoMascota() {
        return codigoMascota;
    }

    public void setCodigoMascota(int codigoMascota) {
        this.codigoMascota = codigoMascota;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
