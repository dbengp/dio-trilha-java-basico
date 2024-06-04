package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.ContaBancaria;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        try{
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            ContaBancaria contaBancaria = new ContaBancaria();

            System.out.print("Por favor, digite o número da Agência !: ");
            int numero = sc.nextInt();
            contaBancaria.setNumero(numero);

            System.out.print("Por favor, digite a numeração da sua Agência !: ");
            sc.nextLine();
            String agencia = sc.nextLine();
            contaBancaria.setAgencia(agencia);

            System.out.print("Por favor, digite o nome do Cliente !: ");
            sc.nextLine();
            String nomeCliente = sc.nextLine();
            contaBancaria.setNomeCliente(nomeCliente);
            
            System.out.print("Por favor, digite o valor do Saldo !: ");
            double saldo = sc.nextDouble();
            contaBancaria.setSaldo(saldo);
            
            sc.close();
        
            contaBancaria.toString();
            
        }catch(InputMismatchException e){
            System.err.println("para Numero insira um valor inteiro, exemplo 1021, " +
                      "para Agencia insira Texto, exemplo '067-8', " +
                      "para Nome do Cliente	insira Texto, exemplo 'MARIO ANDRADE', " +
                      "para Saldo insira um	valor Decimal, exemplo 237.48 "
                      + e.getMessage());
        }
    }
}