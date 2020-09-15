package com.github.eduardoh03.eskillo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Localidade {
    
    private Long id;
    
    @EqualsAndHashCode.Exclude
    private String nome;
    
    @EqualsAndHashCode.Exclude
    private String uf;

    @Override
    public String toString() {
        return nome + "-" + uf + " (" + id + ")";
    }

}