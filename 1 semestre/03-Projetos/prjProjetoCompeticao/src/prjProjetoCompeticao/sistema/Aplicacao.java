package prjProjetoCompeticao.sistema;

import java.util.Scanner;

import prjProjetoCompeticao.classes.Atleta;
import prjProjetoCompeticao.classes.Competicao;
import prjProjetoCompeticao.classes.ModalidadeEsportiva;

public class Aplicacao {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("CADASTRO DE COMPETICAO ");
        

        System.out.println("ATLETA");
        System.out.print("Nome: ");
        String nomeAtleta = ler.nextLine();

        System.out.print("Data de nascimento: ");
        String dataNascimento = ler.nextLine();

        System.out.print("Nacionalidade: ");
        String nacionalidade = ler.nextLine();

        Atleta atleta = new Atleta(nomeAtleta, dataNascimento, nacionalidade);

        System.out.println("MODALIDADE");
        System.out.print("Nome: ");
        String nomeModalidade = ler.nextLine();

        System.out.print("Categoria: ");
        String categoria = ler.nextLine();

        System.out.print("Genero: ");
        String genero = ler.nextLine();

        System.out.print("Regras: ");
        String descricaoRegras = ler.nextLine();

        ModalidadeEsportiva modalidade = new ModalidadeEsportiva(nomeModalidade,
        	categoria, genero, descricaoRegras);

        System.out.println("COMPETICAO");
        System.out.print("Nome: ");
        String nomeCompeticao = ler.nextLine();

        System.out.print("Data: ");
        String dataCompeticao = ler.nextLine();

        System.out.print("Cidade: ");
        String cidadeSede = ler.nextLine();

        System.out.print("Status: ");
        String status = ler.nextLine();

        Competicao competicao = new Competicao(nomeCompeticao, dataCompeticao,
        	cidadeSede, status, modalidade, atleta);

        competicao.apresentar();

        ler.close();
    }
}
