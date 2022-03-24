package com.fcr.projetointegrador.controller;

import com.fcr.projetointegrador.model.ProdutoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.fcr.projetointegrador.repository.ProdutoRepository;
import org.springframework.web.servlet.ModelAndView;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProdutoApiController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping(path = "/api/produto/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo) {
        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping(path = "/api/produtos")
          public List<ProdutoModel> findAll() {
            var it = repository.findAll();
            var produtos = new ArrayList<ProdutoModel>();
            it.forEach(e -> produtos.add(e));
            return produtos;  
        }


    @PostMapping(path = "/api/produto/salvar")
    @Transactional
    public ProdutoModel salvar(@RequestBody ProdutoModel produto) {
        return repository.save(produto);
    }


    @DeleteMapping(path = "/api/produto/excluir/{codigo}")
    @Transactional
    public void deletar(@PathVariable("codigo") Integer codigo) {
        repository.deleteById(codigo);
    }

}
