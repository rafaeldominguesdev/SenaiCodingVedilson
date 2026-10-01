package prjSenaiMusic.Sistema;

import java.util.Scanner;

import prjSenaiMusic.Classes.EpisodioPodcast;
import prjSenaiMusic.Classes.MidiaDeAudio;
import prjSenaiMusic.Classes.PlayList;
import prjSenaiMusic.Classes.Usuario;

public class Aplicacao {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Usuario usuario = new Usuario();
		
		System.out.println("=========================");
		System.out.println("=         Usuario       =");
		System.out.println("=========================");
		
		System.out.println("Informe o nome do usuario: ");
		String nomeUsuario = ler.nextLine();
		
		System.out.println("Informe o email do usuario: ");
		String email = ler.nextLine();

		System.out.println("Informe a playlist do usuario: ");
		String minhaPlayList = ler.nextLine();
		
		PlayList playList = new PlayList();
		
		System.out.println("=========================");
		System.out.println("=        PlayList       =");
		System.out.println("=========================");
		
		System.out.println("Informe o titulo da playlist: ");
		String tituloDaPlayList = ler.nextLine();
		
		System.out.println("Informe a data de criação da playlist: ");
		String dataDeCriacao = ler.nextLine();
		
		System.out.println("Informe o conteudo que pussui dentro: ");
		String conteudo = ler.nextLine();
		
		MidiaDeAudio midiaDeAudio = new MidiaDeAudio();
		
		System.out.println("=========================");
		System.out.println("=      MidiaDeAudio     =");
		System.out.println("=========================");
		
		System.out.println("Informe o titulo: ");
		String tituloDaMidia = ler.nextLine();
		
		System.out.println("Informe a duração em segundos: ");
		int duracaoEmSegundos = ler.nextInt();
		
		System.out.println("Informe o ano de lancamento: ");
		String anoDeLancamento = ler.nextLine();
		
		EpisodioPodcast episodioPodcast = new EpisodioPodcast();
		
		System.out.println("=========================");
		System.out.println("=    EpisodioPodCast    =");
		System.out.println("=========================");
		
		System.out.println("Informe o nome do programa: ");
		String nomeDoPrograma = ler.nextLine();
		
		System.out.println("Informe o nome do convidado: ");
		String nomeDoConvidado = ler.nextLine();
		
		
		ler.close();
	}

}
