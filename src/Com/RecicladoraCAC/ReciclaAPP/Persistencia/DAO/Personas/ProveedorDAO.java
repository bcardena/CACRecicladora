/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.RecicladoraCAC.ReciclaAPP.Persistencia.DAO.Personas;

import Com.RecicladoraCAC.ReciclaAPP.Persistencia.Entidades.Personas.Proveedor;

/**
 *
 * @author Bryan
 */
public class ProveedorDAO {
     Proveedor proveedor;
    
    private boolean crear(Proveedor proveedor)
    {
      return true;
    }
    
    private boolean consultar(int id)
    {
        return true;
    }
    
    private boolean eliminar(int id)
    {
        return true;
    }
    
    private boolean actualizar(int id, String nombre, String direccion, String telefono)
    {
        return true;
    }
}
