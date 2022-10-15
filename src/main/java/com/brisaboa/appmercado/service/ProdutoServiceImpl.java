package com.brisaboa.appmercado.service;

import com.brisaboa.appmercado.model.Produto;
import com.brisaboa.appmercado.repo.ProdutoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProdutoServiceImpl implements IProdutoService {

    @Autowired
    private ProdutoRepo repo;

    @Override
    public Produto criarNovoProduto(Produto prod) {
        return repo.save(prod);
    }

    @Override
    public Produto alterarProduto(Produto prod) {
        return null;
    }

    @Override
    public List<Produto> listarTodos() {
        return null;
    }

    @Override
    public List<Produto> buscarPorPalavraChave(String key) {
        return null;
    }

    @Override
    public Produto buscarPorId(Integer id) {
        return null;
    }
}
