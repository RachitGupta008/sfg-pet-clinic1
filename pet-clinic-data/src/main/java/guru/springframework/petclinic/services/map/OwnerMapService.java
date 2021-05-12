package guru.springframework.petclinic.services.map;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.services.CrudService;
import guru.springframework.petclinic.services.OnwerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OnwerService {
    @Override
    public Owner findByID(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Owner save(Owner type) {
        return super.save(type.getId(), type);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
    super.deleteById(id);
    }

    @Override
    public void delete(Owner type) {
        super.delete(type);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
