import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
            
            Scanner Scanner = new Scanner(System.in);

            System.out.println("Seu Nome:");
            String Nome = Scanner.nextLine();

            System.out.println("Sua Agencia:");
            String Agencia = Scanner.nextLine();

            System.out.println("Seu Numero do cartão(so os 4 ultimos):");
            int Numero = Scanner.nextInt();
            
            System.out.println("Seu Saldo:");
            Float Saldo = Scanner.nextFloat();

            System.out.println("seu nome é"+Nome+" sua agencia é "+Agencia+" Seu numero de cartão é"+Numero+" e Seu Saldo é "+Saldo+"");





       
    }


   
}
