package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;


@RequestMapping({"/owners"})
@Controller
public class OnwerController {

    private final OwnerService ownerService;

    public OnwerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/", "/index"})
    public String getOwnerList(Model model){
        Set<Owner> set = ownerService.findAll();
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }

    @RequestMapping({"/find"})
    public String find(){
        int [] arr = new int[10];
        return "notimplemented";
    }
}
