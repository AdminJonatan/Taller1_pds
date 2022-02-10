package  co.com.pds.demo.entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;


@Getter
@Setter
@Entity
@Table(name = "project1")
public class Project extends  EntidadBase  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_project")
    private  Long id;

    @Column(name = "NOMBRE")
    @NotEmpty(message = "El campo no puede estar en blanco")
    private String projecNAME;
    @Column(name = "IDENTIFICADOR")
    @NotEmpty(message = "El campo no puede estar en blanco")
    private String projecidentifier;
    @Column(name = "DESCRIPCION")
    @NotEmpty(message = "El campo no puede estar en blanco")
    private String description;
    @Column(name = "FECAH_INICIO")
    private Date startDate;
    @Column(name = "FECAH_FIN")
    private Date endDate;


    //@JsonBackReference // para que no muestre la relacion
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "backlog_id")
    private Backlog backlog;


    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
