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
        System.out.println(" ");
        System.out.println("Digite o nome do usuário");
        nome = sc.nextLine();
        System.out.println("Digite o DDD");
        ddd = sc.nextLine();
        System.out.println("Digite um Número de telefone");
        numero = sc.nextLine();
        Verificar();
    }
   
   public static void outroNum(){
            System.out.println("Você deseja adicionar mais um número para este usuário?");
            System.out.println("1 - SIM");
            System.out.println("2 - NÂO");
            String outroNum = sc.nextLine();
            switch(outroNum){
                case "1":
                    System.out.println("Digite outro Número de telefone");
                    numero2 = sc.nextLine();
                    if(numero2.length() < 7){
                        Agenda.LimparTela();
                        System.out.println("Isto não é um número");
                        System.out.println("");
                        System.out.println("Aguarde...");
                        try { Thread.sleep (3000); } catch (InterruptedException ex) {}
                        Agenda.LimparTela();
                        outroNum();
                    }
                    if(Agenda.numero2.contains(numero2)){
                        Agenda.LimparTela();
                        System.out.println("Este número já esta cadastrado");
                        System.out.println("");
                        System.out.println("Aguarde...");
                        try { Thread.sleep (3000); } catch (InterruptedException ex) {}
                        Agenda.LimparTela();
                        outroNum();
                    }else{
                        Agenda.numero2.add(numero2);
                    }
                    break;
                case "2":
                    Agenda.numero2.add("");
                    break;
                default:
                    System.out.println("Essa opção não existe");
                    outroNum();
            }
        }
    public static void Resetar(){
        if(reset == 1 ){
            System.out.println("");
            System.out.println("Aguarde...");
            try { Thread.sleep (4000); } catch (InterruptedException ex) {}
            Agenda.LimparTela();
            Cadastrar.Usuario();
        }
    }   
    public static void Verificar(){
        Agenda.LimparTela();
        if(Agenda.nome.contains(nome)){
            System.out.println("Este nome já está cadastrado");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
            reset = 1;
        }else if(nome.length() < 5){
            System.out.println("Não é possivel cadastrar nomes com menos de 5 caracteres");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
            reset = 1;
        }else {
            Agenda.nome.add(nome);
        }        
        if(ddd.length() == 2){
            Agenda.ddd.add(ddd);
        }else{
            System.out.println("Isto não é um DDD");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
            reset = 1;
        }        
        if(numero.length() < 7){
            System.out.println("Isto não é um número");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
            reset = 1;
        }
        if(Agenda.numero.contains(numero)){
            System.out.println("Este número já esta cadastrado");
            try { Thread.sleep (1000); } catch (InterruptedException ex) {}
            reset = 1;
        }else{
            Agenda.numero.add(numero);
        }
        Resetar();
        outroNum();
        Agenda.LimparTela();
        System.out.println("Usuário Cadastrado com sucesso");
        System.out.println("");
        System.out.println("Aguarde...");
        try { Thread.sleep (3000); } catch (InterruptedException ex) {}
        Agenda.LimparTela();
        Menu.Navegar();
    }
}

