package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.JesusDao;
import com.basedatos.basededatos.models.JesusModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Service
public class JesusService {

    @Autowired
    JesusDao jesusDao;

    public List<JesusModel> getAll(){
        return jesusDao.getAll();
    }

    public JesusModel get(long id){

        return jesusDao.get(id);
    }

    public JesusModel register(JesusModel jesusModel){
        return jesusDao.register(jesusModel);
    }

    public JesusModel update(@RequestBody JesusModel jesusModel){
          return jesusDao.update(jesusModel);
    }

    public void delete(@PathVariable long id){
          jesusDao.delete(id);
    }

}
