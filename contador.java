import java.util.Scanner;

public class contador {
 public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
        try{
            contar(parametroUm, parametroDois);
        }catch(Exception e ){
            System.out.println("Segundo parametro tem que ser maior que o primeiro");
        }
 }
	static void contar(int parametroUm, int parametroDois ) {
        int contagem = parametroDois - parametroUm;
        if(contagem > 0){
        int i;
        System.out.println("abacaxi");
        for(i=1;i<=contagem;i++){
                System.out.println("contagem "+i);
                

        }
    }
}
}
