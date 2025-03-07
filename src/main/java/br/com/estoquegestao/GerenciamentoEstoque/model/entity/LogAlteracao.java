package br.com.estoquegestao.GerenciamentoEstoque.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_logAlteracao")
public class LogAlteracao {
    @Id
    @GeneratedValue
    private Long idLog;
    private String logAlteracao;
    private Date dataAlteracao;
}
