package co.com.pds.demo.repositorio;

import co.com.pds.demo.entidades.Backlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BacklogRepsository extends JpaRepository<Backlog,Long> {
    //POR DEBAJO HACE EL CRUD

}
