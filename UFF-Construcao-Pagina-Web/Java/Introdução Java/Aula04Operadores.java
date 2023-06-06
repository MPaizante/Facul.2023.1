package academy.devdojo.Dojo.Java;

public class Aula04Operadores {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 15;
        double n3 = n1 + n2;
        System.out.println("Valor:" + n3);
        System.out.println( "Valor:" +n3 * n1);
        System.out.println("Valor:" + (n3 - n1) + " outro valor:" + (n3+n1));
        System.out.println("Valor:" + (n3 / n1));
        System.out.println("Valor:" + n3 / n2);

        int resto = 20 % 2;
        int resto1 = 21 % 2;
        System.out.println(resto);
        System.out.println(resto1);//bom para verdadeiro ou falso

        boolean isDezMaiorDoQueVinte = 10 > 20;
        boolean isDezMenorDoQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDeQueVinte = 10 != 20;


        System.out.println(isDezMaiorDoQueVinte);
        System.out.println(isDezMenorDoQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezIgualDez);
        System.out.println(isDezDiferenteDeQueVinte);

        /**
         * && (AND, e) - || (or, ou) - !(NOT, não, negação)
         */


        int idade = 20;
        float sal = 3500F;
        boolean lei = idade > 30 && sal >= 4612;
        boolean lei2 = idade < 30 && sal >=3381;
        System.out.println(lei);
        System.out.println(lei2);

        double VTCC = 200;
        double VTCP = 10000;
        float VP = 5000F;

        boolean isPlay5 = VTCC > VP || VTCP > VP;
        System.out.println(isPlay5);

        //Operadores de atribuição =, +=, -=,*= , /=, %=

        double bonus = 1888;
        bonus += 2000 ;
        System.out.println(bonus);
        bonus -= 2000;
        System.out.println(bonus);
        bonus *= 2;
        System.out.println(bonus);
        bonus /= 2;
        System.out.println(bonus);
        bonus %= 2;
        System.out.println(bonus);

    }
}
