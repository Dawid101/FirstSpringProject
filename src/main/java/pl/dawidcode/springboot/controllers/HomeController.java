package pl.dawidcode.springboot.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Value("${coderslab.course.name}")
    private String myCustomProperty;



    @GetMapping("/sampleProperty")
    @ResponseBody
    public String sampleProperty(){
        return myCustomProperty;
    }

}
