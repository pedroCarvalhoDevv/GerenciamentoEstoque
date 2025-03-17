package br.com.estoquegestao.GerenciamentoEstoque.repository;

import br.com.estoquegestao.GerenciamentoEstoque.model.entity.LogAlteracao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogAlteracaoRepository extends JpaRepository <LogAlteracao , Long > {
}
