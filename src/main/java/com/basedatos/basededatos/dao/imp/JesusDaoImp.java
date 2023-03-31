package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.JesusDao;
import com.basedatos.basededatos.models.JesusModel;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class JesusDaoImp implements JesusDao {

    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<JesusModel> getAll(){
        String hql = "FROM JesusModel as u";
        return (List<JesusModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public JesusModel get(long id){
        return entityManager.find(JesusModel.class, id);

    }
    @Transactional
    @Override
    public JesusModel register(JesusModel jesusModel){
        entityManager.merge(jesusModel);
        return jesusModel;
    }
    @Transactional
    @Override
    public JesusModel update(JesusModel jesusModel){
        entityManager.merge(jesusModel);
        return jesusModel;
    }
    @Transactional
    @Override
    public void delete(  long id){
        JesusModel jesusModel = get(id);
        entityManager.remove(jesusModel);
    }
}
