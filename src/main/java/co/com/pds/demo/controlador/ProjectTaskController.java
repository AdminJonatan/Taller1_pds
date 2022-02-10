package co.com.pds.demo.controlador;

import co.com.pds.demo.entidades.ProjecTask;
import co.com.pds.demo.Servicios.ProjecTasckServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/ProjecTask")
public class ProjectTaskController {


    @Autowired
    private ProjecTasckServices services;

    @GetMapping("")
    public List<ProjecTask> findAll(){
        return services.findAll();
    }

    @PostMapping
    public ProjecTask create(@RequestBody ProjecTask projecTask){
        return  services.create(projecTask);
    }
}
