import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){
        
         // Inicializa as variáveis 
         int numeroConta=0;
         String codigoAgencia="";
         String nomeCorrentista="";
         float numeroSaldo=0;

         try{
            // Cria um objeto para pegar a entrada do teclado
            Scanner teclado = new Scanner(System.in).useLocale(new Locale("pt","BR"));
            // Questiona e pega o nome da pessoa
            System.out.print("Entre o nome do correntista, Ex: Fulado de Tal : ");
            nomeCorrentista = teclado.nextLine();
            // Questiona e pega a agencia do correntista
            System.out.print("Entre o código da agência, Ex: 1-234 : ");
            codigoAgencia = teclado.nextLine();
            // Questiona e pega o numero da conta do correntista
            System.out.print("Entre o número da conta, Ex: 123 : ");
            numeroConta = teclado.nextInt();
            // Questiona e pega o saldo do correntista
            System.out.print("Entre o número do saldo da conta, Ex: 59,00: ");
            numeroSaldo = teclado.nextFloat();
            // Pega todas as variaveis preenchidas e as exibe de forma formatada para o usuário
            System.out.printf("\nOlá %s!\nSua agência é %s, sua conta é %d e o saldo que você tem é R$ %.2f\n",nomeCorrentista, codigoAgencia, numeroConta, numeroSaldo);
         }
         // Se ocorrer erro de digitação, por exemplo, digitar string onde se espera intero, exibe mensagem de erro
         catch(Exception e){
            System.out.println("Você digitou no formato errado, tente depois!");
         }
    }

}