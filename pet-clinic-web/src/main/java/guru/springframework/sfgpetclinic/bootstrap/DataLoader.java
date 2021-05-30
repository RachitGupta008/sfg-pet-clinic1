package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.model.Pet;
import guru.springframework.petclinic.model.PetType;
import guru.springframework.petclinic.model.Vet;
import guru.springframework.petclinic.services.OnwerService;
import guru.springframework.petclinic.services.PetService;
import guru.springframework.petclinic.services.PetTypeService;
import guru.springframework.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final PetService petService;
    private final VetService vetService;
    private final OnwerService onwerService;
    private final PetTypeService petTypeService;


    public DataLoader(PetService petService, VetService vetService, OnwerService onwerService, PetTypeService petTypeService) {
        this.petService = petService;
        this.vetService = vetService;
        this.onwerService = onwerService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType petType = new PetType();
        petType.setName("Dog");
        petTypeService.save(petType);

        Pet pet = new Pet();

        petService.save(pet);


        System.out.println("Loading Pet Data.....");

        Vet vet = new Vet();

        vetService.save(vet);
        System.out.println("Loading Vet Data.....");

        Owner owner = new Owner();

        owner.setFirstName("Hello");
        owner.setLastName("World");
        onwerService.save(owner);

    }
}
