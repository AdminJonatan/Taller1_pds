package co.com.pds.demo.controlador;

import co.com.pds.demo.entidades.Backlog;

import co.com.pds.demo.Servicios.BacklogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Backlog")
public class BacklogController {


    @Autowired
    private BacklogServices services;


    @GetMapping("")
    public List<Backlog> findAll(){

        return services.findAll();
    }

    @PostMapping
    public Backlog create(@RequestBody Backlog backlog){
        return  services.create(backlog);
    }

}