package co.com.pds.demo.Servicios;


import co.com.pds.demo.entidades.Backlog;

import java.util.List;

public interface BacklogServices {

    List<Backlog> findAll();
    Backlog create(Backlog backlog);
}
