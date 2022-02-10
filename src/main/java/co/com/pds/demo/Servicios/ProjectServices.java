package co.com.pds.demo.Servicios;


import co.com.pds.demo.entidades.Project;

import java.util.List;

public interface ProjectServices {


    //LOS METODOS QUE VAMOS A HACER
    List<Project> findAll();
    Project create(Project project);
}
