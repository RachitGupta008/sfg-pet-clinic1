package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.petclinic.model.*;
import guru.springframework.petclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final PetService petService;
    private final VetService vetService;
    private final OnwerService onwerService;
    private final PetTypeService petTypeService;
    private  final SpecialitiesService specialitiesService;

    public DataLoader(PetService petService, VetService vetService, OnwerService onwerService, PetTypeService petTypeService, SpecialitiesService specialitiesService) {
        this.petService = petService;
        this.vetService = vetService;
        this.onwerService = onwerService;
        this.petTypeService = petTypeService;
        this.specialitiesService = specialitiesService;
    }

    @Override
    public void run(String... args) throws Exception {
        if(petService.findAll().size()==0){

            loadData();
        }




    }

    private void loadData() {
        Speciality radioLoSpeciality = new Speciality();
        radioLoSpeciality.setDesciption("Radio");
        specialitiesService.save(radioLoSpeciality);


        PetType petType = new PetType();
        petType.setName("Dog");
        petTypeService.save(petType);

        Pet pet = new Pet();

        petService.save(pet);


        System.out.println("Loading Pet Data.....");

        Vet vet = new Vet();
        vet.getSpecialities().add(radioLoSpeciality);

        vetService.save(vet);
        System.out.println("Loading Vet Data.....");


        Owner owner = new Owner();

        owner.setFirstName("Hello");
        owner.setLastName("World");
        onwerService.save(owner);

        Pet catty  = new Pet();
        catty.setPetType(petType);
        catty.setOwner(owner);
        catty.setBirthDate(LocalDate.now());
        petService.save(catty);
    }
}
