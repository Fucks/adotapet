package br.org.adotapet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Wellington Felipe Fucks
 *
 * @version 1.0
 * @since 1.0, 30/03/2017
 */
@Entity
@Table
@ToString
@EqualsAndHashCode
public class AnimalPerdido {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @Column
    private String nome;

    @Getter
    @Setter
    @Column
    private String raca;

    @Getter
    @Setter
    @Column
    private String porte;

    @Getter
    @Setter
    @Column
    private String cor;

    public AnimalPerdido(Long id, String nome, String raca, String porte, String cor) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.porte = porte;
        this.cor = cor;
    }

    public AnimalPerdido() {
    }

}
