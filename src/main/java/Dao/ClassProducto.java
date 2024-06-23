package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interface.IProducto;
import model.TblProductocl2;

public class ClassProducto implements IProducto{

	@Override
	public void RegistrarProducto(TblProductocl2 producto) {
		// TODO Auto-generated method stub
        EntityManagerFactory em = Persistence.createEntityManagerFactory("LPII_CL2_SANTIAGOALESSANDRO");
        //GESTIONAR LAS ENTIDADES
        EntityManager emanager = em.createEntityManager();
        //INICIAMOS LA TRANSACCION
        emanager.getTransaction().begin();
        //REGISTRAMOS A LA BASE DE DATOS
        emanager.persist(producto);
        //EMITIR UN MSJ POR PANTALLA
        System.out.println("Producto Registrado en la Base de Datos");
        //CONFIRMAMOS LA TRANSACCION
        emanager.getTransaction().commit();
        //CERRAMOS
        emanager.close();
	}

	@Override
	public List<TblProductocl2> ListarProducto() {

        EntityManagerFactory em=Persistence.createEntityManagerFactory("LPII_CL2_SANTIAGOALESSANDRO");
       
        EntityManager emanager = em.createEntityManager();

       
        emanager.getTransaction().begin();
       
        List<TblProductocl2> listaprodu=emanager.createQuery("Select p from TblProductocl2 p",TblProductocl2.class).getResultList();
     
        emanager.getTransaction().commit();
       
        emanager.close();
        //
        return listaprodu;
		
	}

}
