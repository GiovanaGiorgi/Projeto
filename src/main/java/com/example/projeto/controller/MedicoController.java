package com.example.projeto.controller;
import com.example.projeto.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    public MedicoController (MedicoService medicoService) {
        super();
        this.medicoService = medicoService;
    }

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String index() {
//        System.out.println("OI");
//        return null;
//    }

}
