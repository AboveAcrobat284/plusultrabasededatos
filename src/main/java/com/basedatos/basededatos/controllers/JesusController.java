package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.JesusModel;
import com.basedatos.basededatos.services.JesusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jesus")
public class JesusController {

    @Autowired
    JesusService jesusService;

    @GetMapping("/getAll")
    List<JesusModel> getAllJesus(){
        return jesusService.getAll();
    }

    @GetMapping(value = "/getId/{id}")
    JesusModel getJesusById(@PathVariable("id") long id ){
        return jesusService.get(id);
    }

    @PostMapping(value = "/create")
    JesusModel createJesus(@RequestBody JesusModel jesusModel){
     return jesusService.register(jesusModel);
    }



    @PutMapping(value = "/update/{id}")
    JesusModel updateJesusById(@RequestBody JesusModel jesusModel){
        return jesusService.update(jesusModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteJesusById(@PathVariable("id") long id){
        jesusService.delete(id);
    }
}
