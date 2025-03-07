package br.com.estoquegestao.GerenciamentoEstoque.model.dto;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity

public class ProdutoDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduto;
    private String descricaoProduto;
    private double precoCompra;
    private double precoVenda;
    private int estoqueAtual;
    private boolean statusProduto;

}
