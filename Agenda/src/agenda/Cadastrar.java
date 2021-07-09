package agenda;

import java.util.Scanner;

public class Cadastrar {
    
   public static String nome = "";
   public static String ddd = "";
   public static String numero = "";
   public static String numero2 = "";  
   public static int reset = 0;
   public static Scanner sc = new Scanner(System.in);
   public static void Usuario(){
        System.out.println("Bem vindo ao cadastro de usuários");
        System.out.println("");
        System.out.println("Digite o nome do usuário");
        nome = sc.nextLine();
        System.out.println("Digite o DDD");
        ddd = sc.nextLine();
        System.out.println("Digite um Número de telefone");
        numero = sc.nextLine();
        Regras();
    }
    public static void Regras(){
        Agenda.LimparTela();
        if(Agenda.nome.contains(nome)){
            reset = 1;
            System.out.println("Este nome já está cadastrado");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
        }if(nome.length() < 5){
            reset = 1;
            System.out.println("Não é possivel cadastrar nomes com menos de 5 caracteres");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
        }        
        if(ddd.length() != 2){
            reset = 1;
            System.out.println("O DDD não contem 2 números");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
        }        
        if(numero.length() < 8){
            reset = 1;
            System.out.println("O número deve conter no mínimo 8 caracteres");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
        }
        if(Agenda.numero.contains(numero)){
            reset = 1;
            System.out.println("Este número já está cadastrado");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
        }
        Direcionar();
    }
    public static void Direcionar(){
        if(reset == 0){
            reset = 0;
            Agenda.LimparTela();  
            Cadastrar2Numero();
        }
        if(reset == 1){
            reset = 0;
            System.out.println("");
            System.out.println("Aguarde...");
            try { Thread.sleep (4000); } catch (InterruptedException ex) {}
            Agenda.LimparTela();
            Cadastrar.Usuario();
        }
        if(reset == 2){
            reset = 0;
            Agenda.nome.add(nome);
            Agenda.numero.add(numero);
            Agenda.numero2.add(numero2);
            Agenda.ddd.add(ddd);
            Agenda.LimparTela();
            System.out.println("Usuário Cadastrado com sucesso");
            System.out.println("");
            System.out.println("Aguarde...");
            try { Thread.sleep (3000); } catch (InterruptedException ex) {}
            Agenda.LimparTela();
            Menu.Navegar();
        }
    } 
       public static void Cadastrar2Numero(){
            System.out.println("Você deseja adicionar mais um número para este usuário?");
            System.out.println("1 - SIM");
            System.out.println("2 - NÂO");
            String Cadastrar2Numero = sc.nextLine();
            switch(Cadastrar2Numero){
                case "1":
                    System.out.println("Digite outro Número de telefone");
                    numero2 = sc.nextLine();
                    if(numero2.length() < 8){
                        Agenda.LimparTela();
                        System.out.println("O número deve conter no mínimo 8 caracteres");
                        System.out.println("");
                        System.out.println("Aguarde...");
                        try { Thread.sleep (3000); } catch (InterruptedException ex) {}
                        Agenda.LimparTela();
                        Cadastrar2Numero();
                    }
                    if(Agenda.numero2.contains(numero2) || numero.contains(numero2)){
                        Agenda.LimparTela();
                        System.out.println("Este número já esta cadastrado");
                        System.out.println("");
                        System.out.println("Aguarde...");
                        try { Thread.sleep (3000); } catch (InterruptedException ex) {}
                        Agenda.LimparTela();
                        Cadastrar2Numero();
                    }else{
                        reset = 2;
                        Direcionar();
                    }
                    break;
                case "2":
                    reset = 2;
                    numero2 = "";
                    Direcionar();
                    break;
                default:
                    System.out.println("Digite uma opção válida");
                    Cadastrar2Numero();
            }
        }
}