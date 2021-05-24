package guru.springframework.petclinic.services.map;

import guru.springframework.petclinic.model.PetType;
import guru.springframework.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public PetType findByID(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public PetType save(PetType type) {
        return super.save(type);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType type) {
    super.delete(type);
    }
}
