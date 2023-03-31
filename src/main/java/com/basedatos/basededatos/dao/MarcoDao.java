package com.basedatos.basededatos.dao;

import com.basedatos.basededatos.models.MarcoModel;

import java.util.List;

public interface MarcoDao {

    List<MarcoModel> getAll();
    MarcoModel get(long id);
    MarcoModel register(MarcoModel MarcoModel);
    MarcoModel update(MarcoModel MarcoModel);
    void delete(  long id);
}
