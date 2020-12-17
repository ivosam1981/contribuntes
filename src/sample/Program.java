package sample;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Pessoa> pessoas = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int qtd = sc.nextInt();

        for(int i = 1; i<=qtd; i++){
            System.out.println("Tax payer#" + i +" data:");
            System.out.print("Individual orcompany(i/c)?");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Renda Anual: ");
            double renda = sc.nextDouble();

            if(ch == 'i'){
                System.out.print("Gastos com Saúde: ");
                double gastos = sc.nextDouble();
                PessoaFisica pf = new PessoaFisica(name, renda, gastos);
                pf.imposto();
                pessoas.add(pf);

            }else{
                System.out.print("Numero Funcionarios: ");
                int funcionarios = sc.nextInt();

                PessoaJuridica pj = new PessoaJuridica(name, renda, funcionarios);
                pj.imposto();
                pessoas.add(pj);
            }
        }

        System.out.println("TAXES PAID:");

        double sum = 0d;
        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa.getName() + ": $ " + String.format("%.2f", pessoa.imposto()));
            sum += pessoa.imposto();
        }
        System.out.println("TOTAL TAXES:" + String.format("%.2f", sum));
        sc.close();
    }
}
