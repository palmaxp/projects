package agenda;
import java.util.Scanner;

public class Consultar {
    public static String ddd = "";
    public static String nome = "";
    public static String numero = "";
    public static Scanner sc = new Scanner(System.in);
    public static void DDDNumero(){
        Agenda.LimparTela();
        System.out.println("Digite o DDD");
        ddd = sc.nextLine();
        if(ddd.length() < 2){
            System.out.println("Não é possivel buscar com menos que 2 caracteres");
        }
        System.out.println("Os números com o DDD: "+ddd+", são:");
        for (int i = 0; i < Agenda.ddd.size(); i++){
            if(Agenda.ddd.get(i).equals(ddd)){
                System.out.println(Agenda.numero.get(i));
                System.out.println(Agenda.numero2.get(i));
            } else{
                if(Agenda.ddd.contains(ddd)){
                } else{
                System.out.println("Esse valor não existe");
                break;
                }
            }            
        }
        System.out.println("");
        try { Thread.sleep (3000); } catch (InterruptedException ex) {}
        Menu.NavegarConsultar();
    }
    public static void NomeNumero(){
        Agenda.LimparTela();
        System.out.println("Digite o nome");
        nome = sc.nextLine();
        if(nome.length() < 5){
            System.out.println("Não é possivel buscar com menos que 5 caracteres");
        }
        System.out.println("Os números com o nome: "+nome+", são:");
        for (int i = 0; i < Agenda.nome.size(); i++){
            if(Agenda.nome.get(i).equals(nome)){
                System.out.println(Agenda.numero.get(i));
                System.out.println(Agenda.numero2.get(i));
            }else{
                if(Agenda.nome.contains(nome)){
                } else{
                System.out.println("Esse valor não existe");
                break;
                }
            }  
        }
        System.out.println("");
        try { Thread.sleep (3000); } catch (InterruptedException ex) {}
        Menu.NavegarConsultar();
    }
    public static void NumeroNome(){   
        Agenda.LimparTela();       
        System.out.println("Digite o Numero");
        numero = sc.nextLine();
        if(numero.length() < 8){
            System.out.println("Não é possivel buscar com menos que 8 caracteres");
        }
        System.out.println("Os nomes com o número: "+numero+", são:");
        for (int i = 0; i < Agenda.numero.size(); i++){
            if(Agenda.numero.get(i).equals(numero) || Agenda.numero2.get(i).equals(numero)){
                System.out.println(Agenda.nome.get(i));
            }else{
                if(Agenda.numero.contains(numero)){
                } else{
                System.out.println("Esse valor não existe");
                break;
                }
            } 
        }
        System.out.println("");
        try { Thread.sleep (3000); } catch (InterruptedException ex) {}
        Menu.NavegarConsultar();
    }
}