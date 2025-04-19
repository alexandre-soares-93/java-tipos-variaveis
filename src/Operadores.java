public class Operadores {

    public static void main(String[] args) {
        String nomeUm = "Eliud";
        String nomeDois = new String("Eliud");

        System.out.println(nomeUm.equals(nomeDois));


        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira");
        }

        System.out.println("Numero 1 é igual a Numero 2 ?: " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero 1 é diferente de Numero 2 ?: " + simNao);

        simNao = numero1 > numero2;

        System.out.println("Numero 1 é maior que Numero 2 ?: " + simNao);

    }
}