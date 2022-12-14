
package Modelo;

import java.util.ArrayList;

public class Medico extends Persona implements IOperaciones {
    private String especialidad;
    
    public Medico(){
        
        this.especialidad= "";
    }

    public Medico(String especialidad, int rut, String dv, String nombre, String direccion, String correo) {
        super(rut, dv, nombre, direccion, correo);
        this.especialidad = especialidad;
    }
     

    @Override
    public boolean grabar() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void limpiar() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public ArrayList<Object> listar() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
