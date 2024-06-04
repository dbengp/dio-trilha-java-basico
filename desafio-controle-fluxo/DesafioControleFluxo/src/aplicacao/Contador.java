package aplicacao;

import java.util.Scanner;

import java.util.InputMismatchException;
import excecoes.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner terminal = new Scanner(System.in);
	try {
	        System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
                contar(parametroUm, parametroDois);
	     }catch (ParametrosInvalidosException e) {
			System.err.println(e.getMessage());
	     }catch (InputMismatchException e) {
			System.err.println("Digite valores inteiros!");
		}
   }
   public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
	
	    if(parametroUm > parametroDois) {
	        throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
	    }else {
	        int contagem = parametroDois - parametroUm;
	        for(int i = 1; i <= contagem; i++){
	            System.out.println("Imprimindo o número " + i);
	        }
	    }
   }
}
