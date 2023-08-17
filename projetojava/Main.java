public class Main {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 40;
        int total;

        total = num1 + num2;

        System.out.println(total);

        ///---------q1---------//

        int horaTrabalhada = 15;
        double horas = 40;
        double salario;

        salario = horas * horaTrabalhada;
        System.out.println(salario);



        //-------------------q2-------------///

        int num4 = 3;
        int num5 = 3;

        if(num4 > num5){
            System.out.println("numero menor");
        }
        else if(num4 < num5) {
            System.out.println("numero maior");
        }
        else{
            System.out.println("numero igual");
        }

        //-----------------q3---------------------------///

        double nota1 = 50;
        double nota2 = 50;
        double nota3 = 50;

        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 70){
            System.out.println("Aprovado");

        }
        else if(media > 40 && media < 70) {

            System.out.println("Você ta na final");

        }
        else {


            System.out.println("Você tá lascado");

        }


        ///--------------------q4-------------///

        double salario1 = 3000;

        if(salario1 <= 900){

            System.out.println("isento");
        }

        else if(salario1 >= 901 && salario1 < 1500){
            double salarioComDesconto = salario1 * 0.95;
            System.out.println(salarioComDesconto);
        }

        else if(salario1 > 1500 && salario1 <= 2500){

            double salarioComDesconto = salario1 * 0.90;
            System.out.println(salarioComDesconto);
        }
        else{
            double salarioComDesconto = salario1 * 0.80;
            System.out.println(salarioComDesconto);
        }













    }
}
