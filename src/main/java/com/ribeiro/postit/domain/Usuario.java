package com.ribeiro.postit.domain;

import lombok.Data;

@Data
public class Usuario {
    private String login;
    private String senha;
    private String perfil;
}
