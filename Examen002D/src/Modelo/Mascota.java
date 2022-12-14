
package Modelo;

public class Mascota {
    private int codigoChip;			
    private String nombre;				
    private int rutCliente;		
    private String fechaNacimiento;	
    private String especie;
    private String raza;			
    private String descripcion;

    public Mascota() {
        this.codigoChip = 0;
        this.nombre = "";
        this.rutCliente = 0;
        this.fechaNacimiento = "";
        this.especie = "";
        this.raza = "";
        this.descripcion = "";
    }
    public Mascota(int codigoChip, String nombre, int rutCliente, String fechaNacimiento, String especie, String raza, String descripcion) {
        this.codigoChip = codigoChip;
        this.nombre = nombre;
        this.rutCliente = rutCliente;
        this.fechaNacimiento = fechaNacimiento;
        this.especie = especie;
        this.raza = raza;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodigoChip() {
        return codigoChip;
    }

    public void setCodigoChip(int codigoChip) {
        this.codigoChip = codigoChip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public void limpiar()
    {
        this.codigoChip = 0;
        this.nombre = "";
        this.rutCliente = 0;
        this.fechaNacimiento = "";
        this.especie = "";
        this.raza = "";
        this.descripcion = "";
    }
    public String imprimirDatos()
    {
        return  
                "Código Chip           :"  +   this.codigoChip            +
                "Nombre     :"  +   this.nombre     +"\n" +
                "Rut Cliente     :"  +   this.rutCliente    +"\n"+
                "Fecha de Nacimiento :"  +   this.fechaNacimiento   +"\n"+
                "Especie  :"  +   this.especie +"\n"+
                "Raza               :"  +   this.raza        + "\n"+
                "Descripción     :"  +   this.descripcion;
    }
}
