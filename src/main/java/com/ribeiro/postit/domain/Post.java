package com.ribeiro.postit.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dh_post")
    private LocalDateTime dataHoraPost;

    private String conteudo;


    @ManyToOne
    private Usuario usuario;

    @OneToMany(mappedBy = "post")
    private List<Comentario> comentarios = new ArrayList<>();

}
