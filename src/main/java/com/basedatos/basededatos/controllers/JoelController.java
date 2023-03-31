package com.basedatos.basededatos.controllers;

import com.basedatos.basededatos.models.JoelModel;
import com.basedatos.basededatos.services.JoelServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/joel")
public class JoelController {
    @Autowired
    JoelServices joelServices;

    @GetMapping("/getAllP")
    List<JoelModel> getAllJoel(){
        return joelServices.getAll();
    }

    @GetMapping(value = "/getId/{id}")
    JoelModel getJoelById(@PathVariable("id") long id ){
        return joelServices.get(id);
    }

    @PostMapping(value = "/create")
    JoelModel createJoel(@RequestBody JoelModel joelModel){
        return joelServices.register(joelModel);
    }

    @PutMapping(value = "/update/{id}")
    JoelModel updateJoelById(@RequestBody JoelModel joelModel){
        return joelServices.update(joelModel);
    }

    @DeleteMapping(value = "/delete/{id}")
    void  deleteJoelById(@PathVariable("id") long id){
        joelServices.delete(id);
    }
}
