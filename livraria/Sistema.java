package livraria;

import java.util.Scanner;

public class Sistema {

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        Livraria livraria = new Livraria();

        while (opcao != 4){
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Detalhar livro");
            System.out.println("4 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    Livro l = criarLivro(sc);
                    livraria.cadastroLivro(l);
                    break;
                case 2:
                    System.out.println("Listando livro");
                    System.out.println(livraria.listarLivros());
                    break;
                case 3:
                    System.out.println("Deletando livro");
                    int id;
                    System.out.println("detalhando livro");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.println(livraria.detalharLivroPorId(id));
                    break;
                case 4:
                    System.out.println("Encerrando o sistema");
                    break;
                default:
                    System.out.println("opção invalida");
                    break;
             }
        }
        sc.close();    
    }
    private static Livro criarLivro(Scanner sc){
        System.out.println("Adicionando livro");
        int id; String titulo;
        String nomeAutor; String anopublicacao; String editora;
        System.out.println("Id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Titulo: ");
        titulo = sc.nextLine();
        System.out.println("Autor: ");
        nomeAutor = sc.nextLine();
        System.out.println("Ano: ");
        anopublicacao = sc.nextLine();
        System.out.println("Editora: ");
        editora = sc.nextLine();

        Livro l  = new Livro(id, titulo, nomeAutor, anopublicacao, editora);
        return l;
    }
}
