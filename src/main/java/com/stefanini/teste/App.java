package com.stefanini.teste;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.inject.Inject;
import javax.validation.constraints.NotNull;

import com.stefanini.model.Endereco;
import com.stefanini.model.Perfil;
import com.stefanini.model.Pessoa;
import com.stefanini.model.SituacaoDaPessoa;
import com.stefanini.servico.EnderecoServico;
import com.stefanini.servico.PerfilServico;
import com.stefanini.servico.PessoaServico;

import static com.stefanini.model.SituacaoDaPessoa.ATIVO;

public class App {

	@Inject
	private PessoaServico pessoaServico;
	@Inject
	private PerfilServico perfilServico;
	@Inject
	private EnderecoServico enderecoServico;


	public static void main(String[] args) {
		// CONFIGURACAO PARA INICIAR O CONTAINER PARA GERENCIAMENTO DO CDI
		SeContainerInitializer initializer = SeContainerInitializer.newInstance();
		try (final SeContainer container = initializer.initialize()) {
			App app = container.select(App.class).get();
			app.executar();
		}
	}

	public void executar() {
//		buscarTodos();
//		encontrar();
//		salvar();
//		remover();
	}
	
	
//	private void remover() {
//
//		enderecoServico.remover(4);
//		pessoaServico.remover(6L);
//		perfilServico.remover(1);
//
//	}


//	private void encontrar() {
//		Optional<Pessoa> pessoa = pessoaServico.encontrar(5L);
//		if (pessoa.isPresent()) {
//			System.out.println("Pessoa encontrada");
//			System.out.println(pessoa.get());
//		} else {
//			System.out.println("Pessoa não encontrada");
//		}
//	}

//	private void buscarTodos() {
//		pessoaServico.getList().ifPresent(i -> {
//			i.forEach(b -> {
//				System.out.println(b.getNome());
//				System.out.println(b);
//			});
//		});
//	}

//	public void salvar() {
//
//		Perfil perfil = new Perfil();
//		perfil.setNomePerfil("PicleRick");
//		perfil.setDescPerfil("Cientist");
//		LocalDateTime agora = LocalDateTime.now();
//		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm:ss-dd-MM-yyyy");
//		agora.format(formatador);
//		perfil.setHoraInclusao(agora);
//
//		perfilServico.salvar(perfil);
//
//		Perfil pf = new Perfil();
//		pf.setIdPerfil(3);
//
//		List<Perfil> perfils = new ArrayList<>();
//		perfils.add(pf);
//
//		Endereco end = new Endereco();
//		end.setId(5);
//
//		Set<Endereco> enderecos = new HashSet<>();
//		enderecos.add(end);
//
//
//		Pessoa pessoa1 = new Pessoa();
//		pessoa1.setEmail("rsanchez@hotmail.com");
//		pessoa1.setNome("Rick Sanchez");
//		pessoa1.setDataNascimento(LocalDate.of(1950, 12, 27));
//		pessoa1.setSituacao(true);
//		pessoa1.setEnderecos(enderecos);
//		pessoa1.setPerfis(perfils);
//
//		pessoaServico.salvar(pessoa1);

//		Endereco endereco = new Endereco();
//		endereco.setBairro("Asa Norte");
//		endereco.setCep("72000000");
//		endereco.setCidade("Brasília");
//		endereco.setComplemento("Sala 15");
//		endereco.setLogradouro("SHN Quadra 07");
//		endereco.setUf("DF");
//		endereco.setPessoa(pessoa1);
//
//		enderecoServico.salvar(endereco);

//	}

}
