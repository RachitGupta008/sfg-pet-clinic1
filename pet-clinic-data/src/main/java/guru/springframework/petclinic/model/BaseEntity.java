package guru.springframework.petclinic.model;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
@Entity
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
