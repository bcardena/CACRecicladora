/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.Entidades.Personas;

/**
 *
 * @author Bryan
 */
public class Proveedor {
    private String telefono;
    private int id;
    private String direccion;

    public Proveedor() {
    }

    public Proveedor(String telefono, int id, String direccion) {
        this.telefono = telefono;
        this.id = id;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
