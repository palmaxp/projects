package agenda;

import java.util.Scanner;

public class Menu {    
    public static void Navegar(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("MENU - PRINCIPAL");
        System.out.println(" ");
        System.out.println("Digite o número conforme a navegação:");
        System.out.println(" ");
        System.out.println("1 - Cadastrar novo usuário");
        System.out.println("2 - Menu de Consulta de informações");
        System.out.println("3 - Sair");
        int resposta = sc.nextInt();
        
        switch(resposta){
            case 1:
                Agenda.LimparTela();
                Cadastrar.Usuario();
                break;
            case 2:
                Agenda.LimparTela();
                Menu.NavegarConsultar();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                Agenda.LimparTela();
                System.out.println("Número invalido, tente novamente");       
                Menu.Navegar();
        }
    }
    public static void NavegarConsultar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU - CONSULTA");
        System.out.println(" ");
        System.out.println("Digite o número conforme a navegação:");
        System.out.println(" ");
        System.out.println("1 - Consultar número pelo DDD");
        System.out.println("2 - Consultar número pelo nome");
        System.out.println("3 - Consultar nome pelo número");
        System.out.println("4 - Voltar para o menu principal");
        System.out.println("5 - Sair");
        int resposta = sc.nextInt();
        
        switch(resposta){
            case 1:
                Agenda.LimparTela();
                Consultar.DDDNumero();
                break;
            case 2:
                Agenda.LimparTela();
                Consultar.NomeNumero();
                break;

            case 3:
                Agenda.LimparTela();
                Consultar.NumeroNome();
                break;
            case 4:
                Agenda.LimparTela();
                Menu.Navegar();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                Agenda.LimparTela();
                System.out.println("Número invalido, tente novamente");       
                Menu.NavegarConsultar();
        }
    }
}