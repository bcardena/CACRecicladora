/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain.Reportes;

/**
 *
 * @author Bryan
 */
public class Reporte {
    private String nombre;

    public Reporte() {
    }

    public Reporte(String nombre) {
        this.nombre = nombre;
    }
    
    private boolean generar(String nombre)
    {
        try {
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
