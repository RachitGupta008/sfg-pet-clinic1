package guru.springframework.petclinic.services.map;

import guru.springframework.petclinic.model.Pet;
import guru.springframework.petclinic.services.CrudService;
import guru.springframework.petclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Pet findByID(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Pet save(Pet type) {
        return super.save(type.getId(),type);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet type) {
        super.delete(type);
    }
}
