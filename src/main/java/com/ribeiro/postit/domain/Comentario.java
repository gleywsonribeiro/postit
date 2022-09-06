package com.ribeiro.postit.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dh_comentario")
    private LocalDateTime dataHoraComentario;

    private String conteudo;

    @ManyToOne
    private Post post;

    @ManyToOne
    private Usuario usuario;

}
