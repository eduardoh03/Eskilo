package com.github.eduardoh03.eskillo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class Perfil {
    
    private Long id;
    private String nome;
    private String sobre;
    private String cargoAtual;
    private Localidade localidade;
    private String email;
    private String endereco;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private Date dataNascimento;
    private boolean visibilidadePerfil;
    private Fotografia fotografia;

    private List<Experiencia> experiencias = new ArrayList<>();
    private List<Telefone> telefones = new ArrayList<>();
    private List<Formacao> formacoes = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    private List<Competencia> competencias = new ArrayList<>();

}
