package co.com.pds.demo.controlador;


import co.com.pds.demo.entidades.Project;
import co.com.pds.demo.Servicios.ProjectServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Project")
public class ProjectController {


    @Autowired
    private ProjectServices services;

    @GetMapping("")
    public List<Project> findAll(){
        return services.findAll();
    }

    @PostMapping
    public Project create(@RequestBody Project project){
        return  services.create(project);
    }
}