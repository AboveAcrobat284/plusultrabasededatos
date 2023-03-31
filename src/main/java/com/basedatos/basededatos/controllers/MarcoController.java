package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.MarcoModel;
import com.basedatos.basededatos.services.MarcoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/marco")
public class MarcoController {
    @Autowired
    MarcoService marcoService;

    @GetMapping("/getAll")
    List<MarcoModel> getAllMarco(){
        return marcoService.getAll();
    }

    @GetMapping(value = "/getId/{id}")
    MarcoModel getMarcoById(@PathVariable("id") long id ){
        return marcoService.get(id);
    }

    @PostMapping(value = "/create")
    MarcoModel createMarco(@RequestBody MarcoModel MarcoModel){
        return marcoService.register(MarcoModel);
    }

    @PutMapping(value = "/update/{id}")
    MarcoModel updateMarcoById(@RequestBody MarcoModel MarcoModel){
        return marcoService.update(MarcoModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteMarcoById(@PathVariable("id") long id){
        marcoService.delete(id);
    }
}
