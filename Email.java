import java.util.Scanner;
import java.util.HashSet;

public class Email{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite quantos emails deseja verifica:  ");
        int quantidade = ler.nextInt();
        ler.nextLine();

        String[] emails = new String[quantidade];

        System.out.println("Digite seus emails abaixo: ");
        for(int i = 0; i < emails.length; i++){
            emails[i] = ler.nextLine();
        }

        // HashSet vai ajudar a verificar quais emails são unicos, não deixando repetir na contagem final.
        HashSet<String> unicos = new HashSet<>();

        for(int i = 0; i < emails.length; i++) {
            String email = emails[i];

            //separa o email da posição i do vetor em depois do @ e antes do @.
            String[] partes = email.split("@");
            String local = partes[0];
            String dominio = partes[1]; 

            // vai tirar o + do email, retirar os . e remontar o email.
            String[] localSeparado = local.split("\\+");
            local = localSeparado[0];
            local = local.replace(".", "");
            String emailFinal = local + "@" + dominio;
            
            //aqui serve para adicionar os emais ao HashSet.
            unicos.add(emailFinal);
        }   

        //Saida de dados utilizando o HashSet para contabilização
        System.out.println("Emails únicos: " + unicos.size());
        
        ler.close();
    }
}