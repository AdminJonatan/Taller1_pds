package co.com.pds.demo.Servicios;


import co.com.pds.demo.entidades.ProjecTask;
import co.com.pds.demo.repositorio.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProjecTaskServiceImpl implements ProjecTasckServices{

    @Autowired
    private ProjectTaskRepository repository;

    @Override
    public List<ProjecTask> findAll() {
        return repository.findAll();
    }

    @Override
    public ProjecTask create(ProjecTask projecTask) {
        return repository.save(projecTask);
    }
}