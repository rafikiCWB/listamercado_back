package com.brisaboa.appmercado.repo;

import com.brisaboa.appmercado.model.Produto;
import org.springframework.data.repository.CrudRepository;


public interface ProdutoRepo extends CrudRepository<Produto, Integer> {

}
