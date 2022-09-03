package com.ribeiro.postit.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Post {
    private Long id;
    private LocalDateTime dataHoraPost;
    private String conteudo;

    private Usuario usuario;

}
