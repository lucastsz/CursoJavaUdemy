package br.com.estrutura_repetitiva.app;

import br.com.estrutura_repetitiva.exercice01.ListUsers;
import br.com.estrutura_repetitiva.exercice01.User;
import br.com.estrutura_repetitiva.exercice02.PlanoCartesiano;
import br.com.estrutura_repetitiva.exercice03.ContadorCombustivel;
import java.util.Scanner;

public class AppEstruturaRepetitiva {

    public static void main(String[] args) {
        // Exercicio 01
        Scanner sc = new Scanner(System.in);
        String cpf, email, password;
        int result;

        System.out.println("Digite o numero do exercicio que voce deseja visualizar: ");
        result = sc.nextInt();

        switch (result) {
            case 1:
                User user1 = new User("Lucas", "Souza", "02600602593", "lucassouza.1000@hotmail.com", "12345");
                ListUsers listUsers = new ListUsers();
                listUsers.AddUsers(user1);
                User userTest = new User();
                System.out.println("Digite seu Email:");
                email = sc.next();
                System.out.println("Digite seu CPF:");
                cpf = sc.next();
                System.out.println("Digite sua senha:");
                password = sc.next();
                userTest = new User(cpf, email, password);
                while (listUsers.FindUser(userTest) == false) {
                    System.out.println("Credenciais erradas, digite novamente...");

                    System.out.println("Digite seu Email:");
                    email = sc.next();

                    System.out.println("Digite seu CPF:");
                    cpf = sc.next();

                    System.out.println("Digite sua senha:");
                    password = sc.next();

                    userTest = new User(cpf, email, password);

                    if (listUsers.FindUser(userTest) == true) {
                        break;
                    }
                }
                System.out.println("seja bem vindo\n");
                break;
            case 2:
                int x,
                 y;
                System.out.println("Digite o eixo x:");
                x = sc.nextInt();
                System.out.println("Digite o eixo y:");
                y = sc.nextInt();
                PlanoCartesiano planoCartesiano = new PlanoCartesiano(x, y);
                if (planoCartesiano.isNull()) {
                    System.out.println("Fim do programa");
                } else {
                    while (!planoCartesiano.isNull()) {
                        System.out.println("Eixo x: " + planoCartesiano.getX() + ", eixo y: " + planoCartesiano.getY() + ", Quadrante: " + planoCartesiano.quadrante());

                        System.out.println("Digite o eixo x:");
                        planoCartesiano.setX(sc.nextInt());

                        System.out.println("Digite o eixo y:");
                        planoCartesiano.setY(sc.nextInt());

                    }
                }
                break;
            case 3:
                ContadorCombustivel cont = new ContadorCombustivel();
                int valor;

                System.out.println("Qual o seu combusível favorito? (1: Alcool - 2: Gasolina - 3: Diesel)");
                System.out.println("Digite 4 se deseja sair");
                valor = sc.nextInt();

                cont.CalculoAutomatico(valor);

                while (valor != 4) {

                    System.out.println("Qual o seu combusível favorito? (1: Alcool - 2: Gasolina - 3: Diesel)");
                    System.out.println("Digite 4 se deseja sair");
                    valor = sc.nextInt();
                    cont.CalculoAutomatico(valor);

                }
                
                cont.Result();
                default:
        }
    }
}
