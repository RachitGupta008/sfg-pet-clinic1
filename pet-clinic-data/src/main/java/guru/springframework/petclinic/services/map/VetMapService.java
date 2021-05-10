package guru.springframework.petclinic.services.map;


import guru.springframework.petclinic.model.Vet;
import guru.springframework.petclinic.services.CrudService;
import guru.springframework.petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Vet findByID(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Vet save(Vet type) {
        return super.save(type.getId(),type);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet type) {
        super.delete(type);
    }
}
