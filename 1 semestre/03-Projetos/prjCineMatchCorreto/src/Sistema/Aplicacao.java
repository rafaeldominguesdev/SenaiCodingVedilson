package Sistema;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import prjCineMatchCorreto.Classes.Filme;
import prjCineMatchCorreto.Classes.Genero;
import prjCineMatchCorreto.Classes.Usuario;

public class Aplicacao {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe seu nome : ");
		String nome = s.nextLine();
		
		System.out.println("Informe seu email: ");
		String email = s.nextLine();
		
		Usuario usuario = new Usuario(nome, email);
		
		List<Genero> listaGeneros = new ArrayList<>();
		
		int opcao = -1;
		
		while (opcao !=0 ) {
			
			opcao = s.nextInt();
			s.nextLine();
			
			switch(opcao) {
			case 1 :
				System.out.println("---------- Adicionar Filme ----------");
				System.out.println("Título: ");
				String titulo = s.nextLine();
				
				System.out.println("Ano de Lançamento: ");
				int ano = s.nextInt();
				s.nextLine();
				
				System.out.println("Duração (em minutos): ");
				int duracao = s.nextInt();
				s.nextLine();
				
				System.out.println("---------- Gêneros Diponívies  ----------");
				System.out.println("1. Usar um existente");
				System.out.println("2. Criar um novo");
				System.out.println("Opção: ");
				int opcaoGenero = s.nextInt();
				s.nextLine();
				
				Genero generoSelecionado = null;
				
				if (opcaoGenero == 1) {
					
					
					
				}  else if (opcaoGenero == 2 ) {
					
					
				} else {
					System.out.println("Opção de gênero inválida!");
				}
				
				Filme novoFilme = new Filme(titulo, ano, duracao, generoSelecionado);
				usuario.adicionarFilme(novoFilme);
				System.out.println("Filme foi adicionado:");
				
				break;
			case 2 :
				List<Filme> filme = usuario.getCatalogo();
				for (int i = 0; i < filme.size(); i++) {
					System.out.println(i + " - " + filme.get(i).getTitulo());
					
				}
				
				System.out.println("Informe o número do filme que deseja excluir: ");
				int escolha = s.nextInt();
				s.nextLine();
				
				if (usuario.removerFilme(escolha)) {
					System.out.println("Filme removido");
					
				}else {
					System.out.println("Erro: Filme não existe.");
				}
				
				break;
			case 3 :
				System.out.println("\n-----Catálogo de Filmes-----");
				System.out.println(usuario.toString());
				break;
			case 0 :
				System.out.println("Sistem encerrado!");
				break;
			default : 
				System.out.println("Opção inválida!\n");
			}
			
		}
		
		
	}
}