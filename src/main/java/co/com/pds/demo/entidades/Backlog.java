package  co.com.pds.demo.entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "backlog1")
public class Backlog extends  EntidadBase{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_backlog1")
    private  Long id;
    private  String projecidentifier;

    //@JsonBackReference // para que no muestre la relacion
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "project_id")
    private  Project project;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "project_task_id")
    private List<ProjecTask> projecTasks;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Backlog backlog = (Backlog) o;
        return Objects.equals(id, backlog.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
