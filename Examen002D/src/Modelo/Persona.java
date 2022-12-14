
package Modelo;

public abstract class Persona implements IOperaciones {
    private int rut;
    private String dv;
    private String nombre;
    private String direccion;
    private String correo;

    public Persona() {
        this.rut = 0;
        this.dv = "";
        this.nombre = "";
        this.direccion = "";
        this.correo = "";
    }
    
    public Persona(int rut, String dv, String nombre, String direccion, String correo) {
        this.rut = rut;
        this.dv = dv;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    

}
