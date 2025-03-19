package br.com.estoquegestao.GerenciamentoEstoque.controller;


import br.com.estoquegestao.GerenciamentoEstoque.model.dto.ProdutoDTO;
import br.com.estoquegestao.GerenciamentoEstoque.service.ProdutoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/produto")
public class ProdutoController {

    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService){
        this.produtoService = produtoService;
    }

    @PostMapping
    public ProdutoDTO create (@RequestBody ProdutoDTO produtoDTO){
        return produtoService.create(produtoDTO);
    }

}
