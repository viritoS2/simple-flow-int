package candidatura;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametroInvalidosException exception) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametroInvalidosException {

        if(parametroUm> parametroDois)throw new ParametroInvalidosException();
        int contagem = parametroDois - parametroUm;
        for (int i=0;parametroUm<=parametroDois; i++){
            System.out.println(i);
            parametroUm++;
        }
    }
}
