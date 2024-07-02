import java.util.Date;
import java.text.DateFormat;

public class Data 
{
    private int dia;
    private int mes;
    private int ano;
    
    public Data() {
    }
    
    public Data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }
    
    public void entraDia(int d) {
        this.dia = d;
    }
    
    public void entraMes(int m) {
        this.mes = m;
    }
    
    public void entraAno(int a) {
        this.ano = a;
    }
    
    public void entraDia() {
    }
    
    public void entraMes() {
    }
    
    public void entraAno() {
    }
    
    public int retDia() {
        return dia;
    }
    
    public int retMes() {
        return mes;
    }

    public int retAno() {
        return ano;
    }
    
    public String mostra1() {
        return "Data: " + String.format("%02d", retDia()) + "/" + 
                String.format("%02d", retMes()) +
                "/" + retAno();
    }
    
    public String mostra2() {
        String mesExtenso = "";
        
        switch(retMes()) {
          case 1:
            mesExtenso = "Janeiro";
            break;
          case 2:
            mesExtenso = "Fevereiro";
            break;
          case 3:
            mesExtenso = "Março";
            break;
          case 4:
            mesExtenso = "Abril";
            break;
          case 5:
            mesExtenso = "Maio";
            break;
          case 6:
            mesExtenso = "Junho";
            break;
          case 7:
            mesExtenso = "Julho";
            break;
          case 8:
            mesExtenso = "Agosto";
            break;
          case 9:
            mesExtenso = "Setembro";
            break;
          case 10:
            mesExtenso = "Outubro";
            break;
          case 11:
            mesExtenso = "Novembro";
            break;
          case 12:
            mesExtenso = "Dezembro";
            break;
          default:
            mesExtenso = "Inválido";
            break;
            
    }
        return "Data: " + String.format("%02d", retDia()) + "/" + mesExtenso +
            "/" + retAno();
    }
    
    public boolean bissexto() {
        if (retAno() % 4 == 0) {
            if (retAno() % 100 != 0) {
                return true;
            } else {
                if (retAno() % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }
    
    public int diasTranscorridos() {
        int diasContados = 0;
        int mesAtual = retMes();
        
        diasContados += retDia();
        mesAtual--;
        while(mesAtual != 0) {
            if (mesAtual == 1 || mesAtual == 3 || mesAtual == 5 || mesAtual == 7 || mesAtual == 8 || mesAtual == 10) {
                diasContados += 31;
            } else if ((mesAtual == 4 || mesAtual == 6 || mesAtual == 9 ||  mesAtual == 11)) {
                diasContados += 30;
            } else if (mesAtual == 2) {
                if (bissexto() == true) {
                    diasContados += 29;
                } else {
                    diasContados += 28;
                }
            }
            mesAtual--;
        }
        return diasContados;
    }
    
    public static void apresentarDataAtual() {
        Date dataAtual = new Date();
        DateFormat dataFormatada = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Data atual: " + dataFormatada.format(dataAtual));
    }
}