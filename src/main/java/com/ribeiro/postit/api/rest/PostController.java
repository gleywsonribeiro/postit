package com.ribeiro.postit.api.rest;

import com.ribeiro.postit.domain.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user")
public class PostController {

    @GetMapping()
    public List<Usuario> listarUsuarios() {
        return Arrays.asList(new Usuario(null, "Gleywson", "gleywson@gmail.com", "admin"));
    }

}
