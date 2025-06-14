package pl.dawidcode.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dawidcode.springboot.SoftwareEngineer;

import java.util.List;

@RestController
@RequestMapping("/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return List.of(new SoftwareEngineer(1,"Dawid","Java,JS"),
                new SoftwareEngineer(2,"Michał","Python, Java, Node,Spring"));
    }
}
