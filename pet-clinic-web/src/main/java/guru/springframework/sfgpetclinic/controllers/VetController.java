package guru.springframework.sfgpetclinic.controllers;


import guru.springframework.petclinic.model.Vet;
import guru.springframework.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }


    @RequestMapping({"/vets", "/vets/index","/vets.html"})
    public String listVets(Model model){
        Set<Vet> vetSet = vetService.findAll();
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }


}
