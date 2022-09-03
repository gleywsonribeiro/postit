package com.ribeiro.postit.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Comentario {
    private Long id;
    private LocalDateTime dataHoraComentario;
    private String conteudo;

    private Post post;
    private Usuario usuario;

}
