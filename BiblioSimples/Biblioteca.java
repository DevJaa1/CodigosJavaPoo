package BiblioSimples;

import java.util.Scanner;

public class Biblioteca {

    
    public static void main(String[] args) {
        bddLivros cadas = new bddLivros();
        Scanner sc = new Scanner(System.in);
        int op;


    do {
        System.out.println();
        System.out.println("-----MENU-----");
        System.out.println("1 - CADASTRAR LIVRO");
        System.out.println("2 - LISTAR LIVRO");
        System.out.println("3 - REMOVER LIVRO DO SISTEMA");
        System.out.println("0 - SAIR DO PROGRAMA");
        System.out.print("Informe uma opção: ");

        op = sc.nextInt();
        sc.nextLine();
        
        switch (op) {
            case 1:
                System.out.print("INFORME O NOME DO AUTOR: ");
                String a = sc.nextLine();

                System.out.print("INFORME A ISBN DO LIVRO: ");
                String i = sc.nextLine();

                System.out.print("INFORME O TITULO DO LIVRO: ");
                String t = sc.nextLine();          
                
                Livros livro = new Livros(a, i, t);
                cadas.cadastrar(livro);
                System.out.println();
                System.out.println("LIVRO CADASTRADO COM SUCESSO!");
                break;

            case 2:
                if(cadas.estaVazio()) {
                    System.out.println("Não existe nenhum livro cadastrado");
                } else {
                    for (Livros l : cadas.listarLivroBdd()) {
                        System.out.println(l);
                    }
                }
                break;
            
            case 3:

                if(cadas.estaVazio()){
                    System.out.println();
                    System.out.println("Não existe livro para ser removido!");
                } else {
                    System.out.println("Informe o ISBN do livro que deseja remover: ");
                    String id = sc.nextLine();

                    boolean encontrado = false;

                for(Livros x : cadas.listarLivroBdd()) {
                    if(x.getIsbn().equalsIgnoreCase(id)) {
                        encontrado = true;
                        break;
                    }
                }
                    
                
                if(encontrado) {
                    boolean removido = cadas.removerLivros(id);

                    if(removido) {
                        System.out.println();
                        System.out.println("Livro Removido");
                    } else {
                        System.out.println("Nenhum Livro foi encontrado com esse ISBN");
                    }
                    
                }
                break;

            }

            case 0:
            System.out.println("Encerrando programa...");
            break;
            
            default:
            break;
        }
        
        
     } while (op != 0);
    

        
        sc.close();

    }

}


