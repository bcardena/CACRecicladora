/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.RecicladoraCAC.ReciclaAPP.Controlador.Materiales;

import Com.RecicladoraCAC.ReciclaAPP.Dominio.DTO.Materiales.MaterialDTO;

/**
 *
 * @author Bryan
 */
public class Material {

    public Material() {
    }
   
    public boolean Registrar(int id, String nombre, Double precioCompra, Double precioVenta, String ubicacion, String estado)
    {
        MaterialDTO materialDTO = new MaterialDTO(id, nombre, precioCompra, precioVenta, ubicacion, estado);
        Com.RecicladoraCAC.ReciclaAPP.Dominio.Materiales.Material mat = new  Com.RecicladoraCAC.ReciclaAPP.Dominio.Materiales.Material(materialDTO);
        return mat.crear(materialDTO);
    }
}
