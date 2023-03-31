package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.MarcoDao;
import com.basedatos.basededatos.models.MarcoModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class MarcoDaoImp implements MarcoDao {


    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<MarcoModel> getAll(){
        String hql = "FROM MarcoModel as u";
        return (List<MarcoModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public MarcoModel get(long id){
        return entityManager.find(MarcoModel.class, id);

    }
    @Transactional
    @Override
    public MarcoModel register(MarcoModel MarcoModel){
        entityManager.merge(MarcoModel);
        return MarcoModel;
    }
    @Transactional
    @Override
    public MarcoModel update(MarcoModel MarcoModel){
        entityManager.merge(MarcoModel);
        return MarcoModel;
    }
    @Transactional
    @Override
    public void delete(  long id){
        MarcoModel MarcoModel = get(id);
        entityManager.remove(MarcoModel);
    }
}
