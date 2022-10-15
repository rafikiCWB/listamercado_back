package com.brisaboa.appmercado.service;

import com.brisaboa.appmercado.model.Produto;

import java.util.List;

public interface IProdutoService {
    Produto criarNovoProduto(Produto prod);

    Produto alterarProduto(Produto prod);

    List<Produto> listarTodos();

    List<Produto> buscarPorPalavraChave(String key);

    Produto buscarPorId(Integer id);

}
