package com.basedatos.basededatos.dao.imp;

import com.basedatos.basededatos.dao.JoelDao;
import com.basedatos.basededatos.models.JoelModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public class JoelDaoImp implements JoelDao {

    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    @Override
    public List<JoelModel> getAll(){
        String hql = "FROM JoelModel as u";
        return (List<JoelModel>) entityManager.createQuery(hql).getResultList();
    }
    @Transactional
    @Override
    public JoelModel get(long id){
        return entityManager.find(JoelModel.class, id);

    }
    @Transactional
    @Override
    public JoelModel register(JoelModel joelModel){
        entityManager.merge(joelModel);
        return joelModel;
    }
    @Transactional
    @Override
    public JoelModel update(JoelModel joelModel){
        entityManager.merge(joelModel);
        return joelModel;
    }
    @Transactional
    @Override
    public void delete(  long id){
        JoelModel joelModel = get(id);
        entityManager.remove(joelModel);
    }
}
