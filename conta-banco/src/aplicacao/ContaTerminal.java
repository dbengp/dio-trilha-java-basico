package aplicacao;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entidade.ContaBancaria;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Por favor, digite o número da Conta!: ");
            int numero = sc.nextInt();

            sc.nextLine();

            System.out.print("Por favor, digite a numeração da sua Agência!: ");
            String agencia = sc.nextLine();

            System.out.print("Por favor, digite o nome do Cliente!: ");
            String nomeCliente = sc.nextLine();
                
            System.out.print("Por favor, digite o valor do Saldo!: ");
            double saldo = sc.nextDouble();

            ContaBancaria conta = new ContaBancaria(numero,agencia,nomeCliente,saldo);
            System.out.print(" " + conta.toString());
            
        }catch (InputMismatchException e) {
            System.err.println("Erro: Formato de entrada inválido! para número da conta insira um valor inteiro, exemplo 1021 " 
                             + "para Agencia insira Texto, exemplo '067-8', " 
                             + "para Nome do Cliente insira Texto, exemplo 'MARIO ANDRADE', " 
                             + "para Saldo insira um valor Decimal, exemplo 237.48 ");
        }finally{
            sc.close();
        }
    }
}