package guru.springframework.petclinic.services.map;

import guru.springframework.petclinic.model.Speciality;
import guru.springframework.petclinic.services.SpecialitiesService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialitiesMapService extends AbstractMapService<Speciality, Long> implements SpecialitiesService {
    @Override
    public Speciality findByID(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Speciality save(Speciality type) {
        return super.save(type);
    }

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality type) {
        super.delete(type);
    }
}
