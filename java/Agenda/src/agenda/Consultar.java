package agenda;
import java.util.Scanner;

public class Consultar {
    public static void DDDNumero(){
        Agenda.LimparTela();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o DDD");
        String ddd = sc.nextLine();
        if(ddd.length() < 2){
            System.out.println("Não é possivel buscar com menos que 2 caracteres");
        }
        for (int i = 0; i < Agenda.ddd.size(); i++){
            if(Agenda.ddd.get(i).equals(ddd)){
                System.out.println("Os números com o DDD: "+ddd+", são:");
                System.out.println(Agenda.numero.get(i));
                System.out.println(Agenda.numero2.get(i));
            } else{
                System.out.println("Esse valor não existe");
                System.out.println("");
                 try { Thread.sleep (3000); } catch (InterruptedException ex) {}
                Consultar.DDDNumero();
            }            
        }
        System.out.println("");
        try { Thread.sleep (3000); } catch (InterruptedException ex) {}
        Menu.NavegarConsultar();
    }
    public static void NomeNumero(){
        Agenda.LimparTela();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome");
        String nome = sc.nextLine();
        if(nome.length() < 5){
            System.out.println("Não é possivel buscar com menos que 5 caracteres");
        }
        for (int i = 0; i < Agenda.nome.size(); i++){
            if(Agenda.nome.get(i).equals(nome)){
                System.out.println("Os números com o nome: "+nome+", são:");
                System.out.println(Agenda.numero.get(i));
                System.out.println(Agenda.numero2.get(i));
            }else{
                System.out.println("Esse valor não existe");
                System.out.println("");
                 try { Thread.sleep (3000); } catch (InterruptedException ex) {}
                Consultar.DDDNumero();
            }  
        }
        System.out.println("");
        try { Thread.sleep (3000); } catch (InterruptedException ex) {}
        Menu.NavegarConsultar();
    }
    public static void NumeroNome(){   
        Agenda.LimparTela();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o Numero");
        String numero = sc.nextLine();
        if(numero.length() < 8){
            System.out.println("Não é possivel buscar com menos que 8 caracteres");
        }
        for (int i = 0; i < Agenda.numero.size(); i++){
            if(Agenda.numero.get(i).equals(numero) || Agenda.numero2.get(i).equals(numero)){
                System.out.println("Os nomes com o número: "+numero+", são:");
                System.out.println(Agenda.nome.get(i));
            }else{
                System.out.println("Esse valor não existe");
                System.out.println("");
                 try { Thread.sleep (3000); } catch (InterruptedException ex) {}
                Consultar.DDDNumero();
            } 
        }
        System.out.println("");
        try { Thread.sleep (3000); } catch (InterruptedException ex) {}
        Menu.NavegarConsultar();
    }
}