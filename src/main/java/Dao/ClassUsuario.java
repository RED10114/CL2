package Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import Interface.IUsuario;
import model.TblUsuariocl2;

public class ClassUsuario implements IUsuario{

	@Override
	public TblUsuariocl2 validarUsuario(String usuario, String password) {
		EntityManagerFactory em=Persistence.createEntityManagerFactory("LPII_CL2_SANTIAGOALESSANDRO");
        EntityManager emanager = em.createEntityManager();
        try {
            
            TypedQuery<TblUsuariocl2> query = emanager.createQuery(
                "select u from TblUsuariocl2 u WHERE u.usuariocl2 = :usuario AND u.passwordcl2 = :password", 
                TblUsuariocl2.class);
            query.setParameter("usuario", usuario);
            query.setParameter("password", password);

            
            return query.getSingleResult();
        } catch (NoResultException e) {
            



    return null;
	}finally{
		em.close();
	}
	}
	}
