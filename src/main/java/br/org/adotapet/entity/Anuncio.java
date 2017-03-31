package br.org.adotapet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
public class Anuncio {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Getter
    @Setter
    @Column
    private String foto;
    
    @Getter
    @Setter
    @Column
    private String descricao;
    
    @Getter
    @Setter
    @Column
    private String tipo;
    
    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.EAGER, optional = true)
    private AnimalPerdido animalPerdido;
    
    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.EAGER, optional = true)
    private Doacao doacao;

    public Anuncio(Long id, String foto, String descricao, String tipo, AnimalPerdido animalPerdido, Doacao doacao) {
        this.id = id;
        this.foto = foto;
        this.descricao = descricao;
        this.tipo = tipo;
        this.animalPerdido = animalPerdido;
        this.doacao = doacao;
    }
    
    public Anuncio() {
    }
    
    
}
