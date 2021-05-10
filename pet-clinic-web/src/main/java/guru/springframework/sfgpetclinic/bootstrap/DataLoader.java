package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.petclinic.model.Pet;
import guru.springframework.petclinic.model.Vet;
import guru.springframework.petclinic.services.PetService;
import guru.springframework.petclinic.services.VetService;
import guru.springframework.petclinic.services.map.PetMapService;
import guru.springframework.petclinic.services.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final PetService petService;
    private final VetService vetService;


    public DataLoader(PetService petService, VetService vetService) {
        this.petService = petService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Pet pet = new Pet();
        pet.setId(01L);
        petService.save(pet);
        System.out.println("Loading Pet Data.....");

        Vet vet = new Vet();
        pet.setId(01L);
        vetService.save(vet);
        System.out.println("Loading Vet Data.....");
    }
}
