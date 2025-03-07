package br.com.estoquegestao.GerenciamentoEstoque.repository;

import br.com.estoquegestao.GerenciamentoEstoque.model.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository <Produto , Long> {

}
