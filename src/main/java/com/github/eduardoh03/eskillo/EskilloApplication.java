package com.github.eduardoh03.eskillo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.eduardoh03.eskillo.model.AreaEstudo;
import com.github.eduardoh03.eskillo.model.Experiencia;
import com.github.eduardoh03.eskillo.model.Formacao;
import com.github.eduardoh03.eskillo.model.Localidade;
import com.github.eduardoh03.eskillo.model.Perfil;
import com.github.eduardoh03.eskillo.model.TipoFormacao;

//printf("ole")
@SpringBootApplication
public class EskilloApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EskilloApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		AreaEstudo area1 = new AreaEstudo();
		area1.setId(1l);
		area1.setDescricao("Engenharia de Software");
		
		AreaEstudo area2 = new AreaEstudo(2l, "Gastronomia");
		System.out.println(area2.toString());

		TipoFormacao tipo1 = new TipoFormacao();
		tipo1.setId(1l);
		tipo1.setDescricao("Bacharelado");
		System.out.println(tipo1.toString());

		Perfil perfilAnderson = new Perfil();
		perfilAnderson.setId(10l);
		perfilAnderson.setNome("Anderson");
		perfilAnderson.setCargoAtual("Professor");
		perfilAnderson.setEmail("anderson.lima@grupocev.com");

		Formacao formacao1 = new Formacao();
		formacao1.setId(1l);
		formacao1.setTipoFormacao(tipo1);
		formacao1.setAreaEstudo(area1);
		formacao1.setAnoInicio(2020);
		formacao1.setAnoFim(2022);
		formacao1.setNomeInstituicao("iCEV");
		formacao1.setEmAndamento(true);

		perfilAnderson.getFormacoes().add(formacao1);

		Experiencia exp1 = new Experiencia();
		exp1.setId(1l);
		exp1.setCargo("Professor");
		exp1.setNomeEmpresa("iCEV");
		exp1.setLocalidade(new Localidade(1l, "Teresina", "PI"));
		exp1.setOcupacaoAtual(true);

		perfilAnderson.getExperiencias().add(exp1);

	}

}
