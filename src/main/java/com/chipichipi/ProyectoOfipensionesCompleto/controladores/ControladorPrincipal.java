package com.chipichipi.ProyectoOfipensionesCompleto.controladores;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ControladorPrincipal {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
    
    
}
