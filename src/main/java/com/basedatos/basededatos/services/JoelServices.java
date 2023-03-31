package com.basedatos.basededatos.services;

import com.basedatos.basededatos.dao.JoelDao;
import com.basedatos.basededatos.models.JoelModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class JoelServices {
    @Autowired
    JoelDao joelDao;

    public List<JoelModel> getAll(){
        return joelDao.getAll();
    }

    public JoelModel get(long id){

        return joelDao.get(id);
    }

    public JoelModel register(JoelModel joelModel){
        return joelDao.register(joelModel);
    }

    public JoelModel update(@RequestBody JoelModel joelModel){
        return joelDao.update(joelModel);
    }

    public void delete(@PathVariable long id){
        joelDao.delete(id);
    }
}
