package dev.pa.spb.pureweb.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lol")
public class HwControlller {

    @GetMapping(path="/hw")
    public String hw(){
        return " Hellon ";
    }

}
