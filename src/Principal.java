//Rayssa Belo,Vinicius Souza,Leticia Porto e Pedro Henrique.

import java.util.Scanner;
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Propriedade> propriedades = new ArrayList<>();

        int opcao;
        do {
            System.out.println(" MENU ");
            System.out.println("1 - Criar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Criar propriedade");
            System.out.println("4 - Listar propriedades");
            System.out.println("5 - Sair");

            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite seu nome: ");
                    String nome = scanner.nextLine();

                    System.out.println("Digite seu email: ");
                    String email = scanner.nextLine();

                    System.out.println("Digite sua senha: ");
                    String senha = scanner.nextLine();

                    Usuario usuario = new Usuario(nome,email,senha);
                    usuarios.add(usuario);
                    break;
                case 2:
                    for (Usuario Usuario : usuarios) {
                        Usuario.imprimirDados();
                    }
                    break;
                case 3:
                    System.out.println("Digite o título da propriedade: ");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite a descrição da propriedade: ");
                    String descricao = scanner.nextLine();
                    System.out.println("Digite a localização: ");
                    String localizacao = scanner.nextLine();
                    System.out.println("Digite a capacidade de pessoas: ");
                    int capacidade = scanner.nextInt();
                    scanner.nextLine(); // consome o Enter do nextInt()


                    System.out.println("Digite o preço: ");
                    String precoTexto = scanner.nextLine();

                    precoTexto = precoTexto.replace(".", "").replace(",", ".");

                    double precoPorNoite = Double.parseDouble(precoTexto);


                    System.out.println("Escolha o proprietário: ");
                    for (int i = 0; i < usuarios.size(); i++) {
                        System.out.println((i + 1) + "-" + usuarios.get(i).nome);
                    } //i + 1 é para aparecer 1,2,3... para a pessoa,enquanto o Java usa 0,1,2...

                    System.out.println("Digite o número do proprietário: ");
                    int escolha = scanner.nextInt();
                    Usuario proprietario = usuarios.get(escolha - 1);
                    boolean disponibilidade = true;

                    Propriedade propriedade = new Propriedade(
                            disponibilidade,
                            titulo,
                            descricao,
                            capacidade,
                            precoPorNoite,
                            proprietario,
                            localizacao
                    );

                    propriedades.add(propriedade);
                    break;
                case 4:
                    for (Propriedade Propriedade : propriedades) {
                        Propriedade.imprimirDados();
                    }//para cada Propriedade que estiver dentro da lista propriedades vai executar imprimirDados.
                    break;
                case 5:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }while (opcao != 5);
    }
}
