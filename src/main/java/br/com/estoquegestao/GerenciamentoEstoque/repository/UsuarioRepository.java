package br.com.estoquegestao.GerenciamentoEstoque.repository;

import br.com.estoquegestao.GerenciamentoEstoque.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario , Long> {
}
