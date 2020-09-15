package com.github.eduardoh03.eskillo.repositories;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import com.github.eduardoh03.eskillo.model.Localidade;

public class LocalidadeRepository {

    private final List<Localidade> repository = new ArrayList<>();

    public void adiciona(final Localidade localidade) {
        if (!repository.contains(localidade)) {
            repository.add(localidade);
        }
    }

    public void atualiza(final Localidade localidade) {
        if (repository.contains(localidade)) {
            int pos = repository.indexOf(localidade);
            repository.set(pos, localidade);
        }
    }

    public void remove(final Localidade localidade) {
        if (repository.contains(localidade)) {
            repository.remove(localidade);
        }
    }

    public Localidade busca(Long id) {
        Localidade localidadeEncontrada = null;
        for (Localidade localidade:repository) {
            if (localidade.getId().equals(id)) {
                localidadeEncontrada = localidade;
            }
        }
        return localidadeEncontrada;
    }

    public List<Localidade> lista() {
        return Collections.unmodifiableList(repository);
    }
    
}
