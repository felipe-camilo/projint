package com.fcr.projetointegrador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdutoController {

    @GetMapping(value = "/produtos")
    public String Produtos(){
        return "produtos";
    }

    @GetMapping(value = "/produto")
    public String Produto(){
        return "produto";
    }
}
