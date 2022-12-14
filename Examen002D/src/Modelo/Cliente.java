
package Modelo;

import java.util.ArrayList;

public class Cliente extends Persona implements IOperaciones {		
    private String comuna;		
    private String telefono;		
    private String esEmpresa;
    
    public Cliente(){
    
    }

    
    

    public Cliente(String comuna, String telefono, String esEmpresa, int rut, String dv, String nombre, String direccion, String correo) {
        super(rut, dv, nombre, direccion, correo);
        this.comuna = comuna;
        this.telefono = telefono;
        this.esEmpresa = esEmpresa;
    }
    
    
    @Override
    public boolean grabar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    @Override
    public ArrayList<Object> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public void limpiar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    
    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEsEmpresa() {
        return esEmpresa;
    }

    public void setEsEmpresa(String esEmpresa) {
        this.esEmpresa = esEmpresa;
    }
    
    
    
}
