package com.ribeiro.postit.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String login;
    private String senha;
    private String perfil;

    @OneToMany(mappedBy = "usuario")
    private List<Post> posts = new ArrayList<>();

    public Usuario(Long id, String nome, String login, String perfil) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.perfil = perfil;
    }

    public Usuario() {

    }
}
