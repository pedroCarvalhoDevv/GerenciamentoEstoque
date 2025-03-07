package br.com.estoquegestao.GerenciamentoEstoque.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_secao")
public class Secao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSecao;
    private String descricaoSecao;
    private double margemVenda;

}
