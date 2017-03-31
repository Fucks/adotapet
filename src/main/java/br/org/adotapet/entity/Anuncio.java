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

    public Anuncio(Long id, String foto, String descricao, String tipo) {
        this.id = id;
        this.foto = foto;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public Anuncio() {
    }
    
    
}
