package com.basedatos.basededatos.dao;
import com.basedatos.basededatos.models.JesusModel;
import java.util.List;

public interface JesusDao {

      List<JesusModel> getAll();
      JesusModel get(long id);
      JesusModel register(JesusModel jesusModel);
      JesusModel update(JesusModel jesusModel);
      void delete(  long id);

}
