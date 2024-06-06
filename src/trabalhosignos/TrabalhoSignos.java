package trabalhosignos;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class TrabalhoSignos {

    public static void main(String[] args) {
        String nome;
        Calendar hoje = Calendar.getInstance();
        int dia, mes, ano, idade = 0, signo, sexo, cor = 0;
        int diaA, mesA, anoA;
        diaA = hoje.get(Calendar.DATE);
        mesA = hoje.get(Calendar.MONTH) + 1;
        anoA = hoje.get(Calendar.YEAR);

        Scanner ler = new Scanner(System.in);

        //perguntas ao usuário
        System.out.println("Qual seu nome? ");
        nome = ler.nextLine();

        if (nome.length() >= 8) {

        } else {
            System.out.println("Seu nome deve ter no minimo 8 letras");
            return;
        }
        String carateres = "1234567890!@#$%¨&*()-_=+§{[ª~^|}]'º:;?/°,.\\\"";
        if (nome != carateres) {

        } else {
            System.out.println("Seu nome só deve ter letras");
            return;
        }

        System.out.println("Qual é dia que você nasceu?");
        dia = ler.nextInt();

        System.out.println("Qual o mês que você nasceu?");
        mes = ler.nextInt();

        if (mes >= 1 && mes <= 12) {
        } else {
            System.out.println("Informe o mês entre 1 a 12");
            return;
        }

        System.out.println("Qual o ano que você nasceu?");
        ano = ler.nextInt();

        if (ano >= 1900 && ano <= anoA) {
        } else {
            System.out.println("Informe o ano entre 1900 até o ano atual");
            return;
        }

        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            System.out.println("Esse mês só possui 30 dias");
            return;

                    }else if (mes ==2 &&  (ano%4==0 && ano %100!=0)|| (ano%400==0)){
        System.out.println("Fevereiro em ano Bissexto tem só 29 dias");
        return;

        } else if (mes == 2 && dia <= 28) {
            System.out.println("Fevereiro só tem 28 dias");
            return;
        }
        
        System.out.println("Qual é o seu sexo 1-Feminino ou 2-Masculino");
        sexo = ler.nextInt();

        if (sexo == 1 || sexo == 2) {

        } else {
            System.out.println("Informe o sexo como 1-Feminino e 2-Masculino");
            return;
        }

        //tratamento ao usuário
        if (sexo == 1) {
            System.out.println("Sra. " + nome);
        } else if (sexo == 2) {
            System.out.println("Sr. " + nome);
        } else {
            System.out.println("Informe um número válido");
        }

        //calculo idade
        idade = ((anoA * 365 + mesA * 12 + diaA) - (ano * 365 + mes * 12 + dia)) / 365;

        // RESULTADO
        System.out.println("Você é do signo " + gerarSigno(dia, mes, ano) + " você tem " + idade + " anos de idade");

        System.out.println("Seus números da sorte são " + declararNumeroSorte(gerarSigno(dia, mes, ano)) + " e sua cor é " + declararCor(nome));
    }

    //cor aleatória
    public static String declararCor(String cor) {

        String corAleatoria[] = {"vermelho-intenso", "verde-aconchegante", "amarelo-vivo", "rosa-delicado", "laranja-expressivo ", "branco-pigmentado", "violeta-silencioso", "marrom-avermelhado", "magenta "};
        Random nCor = new Random();
        int i = nCor.nextInt(corAleatoria.length);
        cor = corAleatoria[i];

        return cor;

    }

    //descobrir o signo
    public static String gerarSigno(int dia, int mes,
            int ano) {
        String signo = "";
        if (dia >= 21 && dia <= 31 && mes == 3 || dia >= 1 && dia <= 20 && mes == 4) {
            signo = "Áries";
        } else if (dia >= 21 && dia <= 30 && mes == 4 || dia >= 1 && dia <= 20 && mes == 5) {
            signo = "Touro";
        } else if (dia >= 21 && dia <= 31 && mes == 5 || dia >= 1 && dia <= 20 && mes == 6) {
            signo = "Gêmeos";
        } else if (dia >= 21 && dia <= 30 && mes == 6 || dia >= 1 && dia <= 20 && mes == 7) {
            signo = "Câncer";
        } else if (dia >= 22 && dia <= 31 && mes == 7 || dia >= 1 && dia <= 22 && mes == 8) {
            signo = "Leão";
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
        } else if (dia >= 20 && dia <= 29 && mes == 2 || dia >= 1 && dia <= 20 && mes == 3) {
            signo = "Peixes";
        }

        return signo;
    }
    //número da sorte de acordo com o signo

    public static String declararNumeroSorte(String signo) {

        String result = "";
        if (signo.equals("Áries")) {
            result = " 8, 19, 25, 33, 41 e 56";
        } else if (signo.equals("Touro")) {
            result = " 4, 12, 21, 30, 38 e 47";
        } else if (signo.equals("Gêmeos")) {
            result = "3, 14, 23, 32, 45 e 59";
        } else if (signo.equals("Cancêr")) {
            result = " 10, 16, 27, 36, 49 e 52";
        } else if (signo.equals("Leão")) {
            result = "6, 18, 29, 37, 44 e 55";
        } else if (signo.equals("Virgem")) {
            result = "7, 15, 24, 35, 46 e 58";
        } else if (signo.equals("Libra")) {
            result = " 2, 13, 22, 31, 40 e 51";
        } else if (signo.equals("Escorpião")) {
            result = " 5, 17, 26, 34, 43 e 57";
        } else if (signo.equals("Sagitário")) {
            result = " 9, 20, 28, 39, 48 e 60";
        } else if (signo.equals("Capricórnio")) {
            result = " 1, 11, 31, 42, 53 e 59";
        } else if (signo.equals("Aquário")) {
            result = " 11, 22, 30, 48, 50 e 54";
        } else if (signo.equals("Peixes")) {
            result = " 15, 26, 34, 45, 57 e 60";

        }
        return result;
    }
}
