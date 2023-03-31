package com.basedatos.basededatos.dao;
import com.basedatos.basededatos.models.JoelModel;
import java.util.List;

public interface JoelDao {
    List<JoelModel> getAll();
    JoelModel get(long id);
    JoelModel register(JoelModel joelModel);
    JoelModel update(JoelModel joelModel);
    void delete(  long id);
}
