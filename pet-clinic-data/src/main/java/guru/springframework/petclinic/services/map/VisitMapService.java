package guru.springframework.petclinic.services.map;

import guru.springframework.petclinic.model.Visit;
import guru.springframework.petclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {
    @Override
    public Visit findByID(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Visit save(Visit type) {
        if(type.getPet()==null || type.getPet().getOwner()==null || type.getPet().getId()==null
                || type.getPet().getOwner().getId()==null){
            throw new RuntimeException("Invalid Visit");
        }

        return super.save(type);
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
    super.deleteById(id);
    }

    @Override
    public void delete(Visit type) {
        super.delete(type);
    }
}
