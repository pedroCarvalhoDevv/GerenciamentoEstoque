package br.com.estoquegestao.GerenciamentoEstoque.repository;

import br.com.estoquegestao.GerenciamentoEstoque.model.entity.Secao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecaoRepository extends JpaRepository <Secao , Long> {
}
