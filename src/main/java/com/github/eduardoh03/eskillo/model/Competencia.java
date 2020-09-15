package com.github.eduardoh03.eskillo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Competencia {

    private Long id;
    private TipoCompetencia tipoCompetencia;
    
}
