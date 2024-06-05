package trabalhosignos;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class TrabalhoSignos {

    public static void main(String[] args) {
        String nome;
        Calendar hoje = Calendar.getInstance();
        int dia, mes, ano, idade = 0, signo, sexo;
        int diaA, mesA, anoA;
        diaA = hoje.get(Calendar.DATE);
        mesA = hoje.get(Calendar.MONTH) + 1;
        anoA = hoje.get(Calendar.YEAR);

        Scanner ler = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        nome = ler.nextLine();

        System.out.println("Qual é dia que você nasceu?");
        dia = ler.nextInt();

        System.out.println("Qual o mês que você nasceu?");
        mes = ler.nextInt();

        System.out.println("Qual o ano que você nasceu?");
        ano = ler.nextInt();

        System.out.println("Qual é o seu sexo 1-Feminino ou 2-Masculino");
        sexo = ler.nextInt();

        //retirar caracteres especiais e quantidade de letras
        if (sexo == 1) {
            System.out.println("Srtª. " + nome);
        } else if (sexo == 2) {
            System.out.println("Srt. " + nome);
        } else {
            System.out.println("Informe um número válido");
        }

        

        // RESULTADO
        idade = ((anoA * 365 + mesA * 12 + diaA) - (ano * 365 + mes * 12 + dia)) / 365;
        System.out.println("Você é do signo " + gerarSigno(dia, mes, ano) + " você tem " + idade + " anos de idade");
        System.out.println("Seus números da sorte são " + numeroSorte(gerarSigno(dia, mes, ano)));

        //descobrir signo
    }

    public static String gerarSigno(int dia, int mes,
            int ano) {
        String signo = "";
        if (dia >= 21 && dia <= 30 && mes == 6 || dia >= 1 && dia <= 20 && mes == 7) {
            signo = "Câncer";
        } else if (dia >= 22 && dia <= 31 && mes == 7 || dia >= 1 && dia <= 22 && mes == 8) {
            signo = " Leão";
        } else if (dia >= 23 && dia <= 31 && mes == 8 || dia >= 1 && dia <= 22 && mes == 9) {
            signo = "Virgem";
        } else if (dia >= 23 && dia <= 30 && mes == 9 || dia >= 1 && dia <= 22 && mes == 10) {
            signo = "Libra";
        } else if (dia >= 23 && dia <= 31 && mes == 10 || dia >= 1 && dia <= 21 && mes == 11) {
            signo = "Escorpião";
        } else if (dia >= 22 && dia <= 30 && mes == 11 || dia >= 1 && dia <= 21 && mes == 12) {
            signo = "Sagitário";
        } else if (dia >= 23 && dia <= 31 && mes == 12 || dia >= 1 && dia <= 20 && mes == 1) {
            signo = "Capricórnio";
        } else if (dia >= 23 && dia <= 31 && mes == 1 || dia >= 1 && dia <= 19 && mes == 2) {
            signo = "Aquário";
        } else if (dia >= 20 && dia <= 28 && mes == 2 || dia >= 1 && dia <= 20 && mes == 3) {
            signo = "Peixes";
        } else {
            System.out.println("Informe, dados válidos");
        }

        return signo;
    }

    public static String numeroSorte(String signo) {

        String result = "";
        if (signo.equals("Aries")) {
            result = " 8, 19, 25, 33, 41 e 56";
        } else if (signo.equals("Touro")) {
            result = " 4, 12, 21, 30, 38 e 47";
        } else if (signo.equals("gemeos")) {
            result = "3, 14, 23, 32, 45 e 59";
        } else if (signo.equals("cancer")) {
            result = " 10, 16, 27, 36, 49 e 52";
        } else if (signo.equals("leao")) {
            result = "6, 18, 29, 37, 44 e 55";
        } else if (signo.equals("virgem")) {
            result = "7, 15, 24, 35, 46 e 58";
        } else if (signo.equals("libra")) {
            result = " 2, 13, 22, 31, 40 e 51";
        } else if (signo.equals("escorpiao")) {
            result = " 5, 17, 26, 34, 43 e 57";
        } else if (signo.equals("sagitario")) {
            result = " 9, 20, 28, 39, 48 e 60";
        } else if (signo.equals("capricornio")) {
            result = " 1, 11, 31, 42, 53 e 59";
        } else if (signo.equals("aquario")) {
            result = " 11, 22, 30, 48, 50 e 54";
        } else {
            result = " 15, 26, 34, 45, 57 e 60";

        }
        return result;

    }
public static String definirAnoBissexto (int mes, int dia, int ano){
          String result = " ";
        if ((mes==4 || mes==6 || mes==9 || mes==11)&& dia>30){
            result = "O mês "+mes+" só possue 30 dias";

    } else if (mes ==2 &&(ano%4==0 && ano %100!=0)||(ano%400==0)){
        if (dia>29){
            result ="Ano bissexto, Fevereiro só possue 29 dias";
            return result;
            
        }
        
        //caracter especial
        if (nome == "1234567890!@#$%¨&*()-_=+§{[ª~^|}]'º:;?/°,.\\\"") {
            System.out.println("Informe o seu nome sem caracteres especiais");
        } else {
            System.out.println("Legal, se seu nome fosse verdadeiro");
        }
    }

