package guru.springframework.petclinic.services;



import java.util.Set;

public interface CrudService<T, ID> {

    T findByID(ID id);

    T save(T type);

    Set<T> findAll();

    void delete(T type);

    void deleteById(ID id);
}
