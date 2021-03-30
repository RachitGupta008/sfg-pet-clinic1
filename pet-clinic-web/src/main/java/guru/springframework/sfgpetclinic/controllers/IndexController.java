package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","/","index"})
    public String index(){
        return "index";
    }
    @RequestMapping({"/vets, /vets/index"})
    public String listVets(){
        return "index";
    }
}
