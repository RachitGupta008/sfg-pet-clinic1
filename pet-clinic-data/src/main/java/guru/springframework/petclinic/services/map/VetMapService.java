package guru.springframework.petclinic.services.map;


import guru.springframework.petclinic.model.Vet;
import guru.springframework.petclinic.services.SpecialitiesService;
import guru.springframework.petclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialitiesService specialitiesService;

    public VetMapService(SpecialitiesService specialitiesService) {
        this.specialitiesService = specialitiesService;
    }

    @Override
    public Vet findByID(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Vet save(Vet type) {
        if(type.getSpecialities().size()>0){
            type.getSpecialities().forEach(speciality -> {

                if(speciality.getId()==null){
                    speciality.setId(specialitiesService.save(speciality).getId());
                }
            });
        }

        return super.save(type);
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
