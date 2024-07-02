import java.util.Scanner;

public class TesteData {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);  

      System.out.println("Digite os valores da data.");
	
      System.out.print("Dia: ");
      int dia = input.nextInt();
        
      System.out.print("Mês: ");
      int mes = input.nextInt();
        
      System.out.print("Ano: ");
      int ano = input.nextInt();
        
      while (dia > 31 || mes > 12 || dia < 0 || mes < 0 || ano < 0){
        System.out.println("Algum valor é inválido. Digite os valores da data novamente.");
          
        System.out.print("Dia: ");
        dia = input.nextInt();
          
        System.out.print("Mês: ");
        mes = input.nextInt();
          
        System.out.print("Ano: ");
        ano = input.nextInt();
        }
      
      Data data1 = new Data(dia, mes, ano);
      System.out.println(data1.mostra1());
      System.out.println(data1.mostra2());
      
      String bissexto = (data1.bissexto() == true) ? "Sim" : "Não";
      System.out.println("Esse ano é bissexto? " + bissexto);

      System.out.println("Dias transcorridos: " + data1.diasTranscorridos());

      Data.apresentarDataAtual();
            
      input.close();
    }
  }