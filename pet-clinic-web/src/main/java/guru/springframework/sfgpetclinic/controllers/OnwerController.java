package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.services.OnwerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;


@RequestMapping({"/owners"})
@Controller
public class OnwerController {

    private final OnwerService onwerService;

    public OnwerController(OnwerService onwerService) {
        this.onwerService = onwerService;
    }

    @RequestMapping({"","/", "/index"})
    public String getOwnerList(Model model){
        Set<Owner> set = onwerService.findAll();
        model.addAttribute("owners", onwerService.findAll());
        return "owners/index";
    }
}
