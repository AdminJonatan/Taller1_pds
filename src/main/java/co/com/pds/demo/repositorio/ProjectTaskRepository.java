package co.com.pds.demo.repositorio;

import co.com.pds.demo.entidades.ProjecTask;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectTaskRepository extends JpaRepository<ProjecTask,Long> {

    //POR DEBAJO HACE EL CRUD
}
