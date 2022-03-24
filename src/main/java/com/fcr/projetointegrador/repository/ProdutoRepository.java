package com.fcr.projetointegrador.repository;

import com.fcr.projetointegrador.model.ProdutoModel;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<ProdutoModel, Integer> {
}
