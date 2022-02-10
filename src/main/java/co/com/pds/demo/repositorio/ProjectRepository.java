package co.com.pds.demo.repositorio;

import co.com.pds.demo.entidades.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
    //POR DEBAJO HACE EL CRUD
}
