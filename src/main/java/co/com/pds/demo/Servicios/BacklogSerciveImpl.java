package co.com.pds.demo.Servicios;


import co.com.pds.demo.entidades.Backlog;
import co.com.pds.demo.repositorio.BacklogRepsository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BacklogSerciveImpl implements BacklogServices {

    @Autowired
    private BacklogRepsository repsository;

    @Override
    public List<Backlog> findAll() {
        return repsository.findAll();
    }

    @Override
    public Backlog create(Backlog backlog) {
        return repsository.save(backlog);
    }
}
