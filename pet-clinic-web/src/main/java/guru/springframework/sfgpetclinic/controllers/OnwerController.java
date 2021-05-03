package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/owners"})
@Controller
public class OnwerController {

    @RequestMapping({"","/", "/index"})
    public String getOwnerList(){
        return "owners/index";
    }
}
