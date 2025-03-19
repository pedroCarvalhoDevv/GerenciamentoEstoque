package br.com.estoquegestao.GerenciamentoEstoque.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduto;
    private String descricaoProduto;
    private double precoCompra;
    private double precoVenda;
    private double quantidadeUltimaEntrada;
    private int estoqueAtual;
    private boolean statusProduto;

}
