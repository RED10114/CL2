package Test;

import java.util.List;

import Dao.ClassProducto;
import model.TblProductocl2;

public class TestProducto {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		TblProductocl2 producto= new TblProductocl2();
        //
 ClassProducto crud = new ClassProducto();
/*
        producto.setNombrecl2("pañal");
        producto.setPrecioventacl2(2.30);
        producto.setPreciocompcl2(0.50);
        producto.setEstadocl2("disponible");
        producto.setDescripcl2("economico");

        crud.RegistrarProducto(producto);
        */
        
 List<TblProductocl2> listarProducto = crud.ListarProducto();
 for(TblProductocl2 p:listarProducto){
     System.out.println("Código: "+p.getIdproductocl2()+"\n"+
                         "Nombre: "+p.getNombrecl2()+"\n"+
                         "Precio de Venta: "+p.getPrecioventacl2()+"\n"+
                         "Precio de Compra: "+p.getPreciocompcl2()+"\n"+
                         "Estado: "+p.getEstadocl2()+"\n"+
                         "Descripción: "+p.getDescripcl2()+"\n");
 }
        
	}
}
