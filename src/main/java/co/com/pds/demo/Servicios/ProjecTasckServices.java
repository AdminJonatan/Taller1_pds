package co.com.pds.demo.Servicios;


import co.com.pds.demo.entidades.ProjecTask;


import java.util.List;

public interface ProjecTasckServices {

    List<ProjecTask> findAll();
    ProjecTask create(ProjecTask projecTask);
}
