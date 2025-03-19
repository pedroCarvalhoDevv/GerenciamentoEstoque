package br.com.estoquegestao.GerenciamentoEstoque.service;

import br.com.estoquegestao.GerenciamentoEstoque.model.dto.ProdutoDTO;
import br.com.estoquegestao.GerenciamentoEstoque.model.entity.Produto;
import br.com.estoquegestao.GerenciamentoEstoque.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    private ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService (ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public ProdutoDTO create(ProdutoDTO produtoDTO){

        Produto produto = new Produto();
        produto.setDescricaoProduto(produto.getDescricaoProduto());
        produto.setPrecoCompra(produto.getPrecoCompra());
        produto.setQuantidadeUltimaEntrada(produto.getQuantidadeUltimaEntrada());

        Produto produtoSalvo = produtoRepository.save(produto);

        return new ProdutoDTO(
                produtoSalvo.getDescricaoProduto(),
                produtoSalvo.getPrecoCompra(),
                produtoSalvo.getPrecoVenda(),
                produtoSalvo.getEstoqueAtual()
        );

    }

}
