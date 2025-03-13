package com.leesairlines.lennupiletid.lennud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Tagab, et see klass vastab requestidele
public class LennudController {



    @RequestMapping("/hello")
    public String home() {
        return "Tere, maailm!";
    }
}
