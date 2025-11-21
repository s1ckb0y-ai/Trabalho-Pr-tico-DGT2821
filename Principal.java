/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro;

import model.*;

public class Principal {
    public static void main(String[] args) {
        try {
            // Pessoas Físicas
            PessoaFisicaRepo repo1 = new PessoaFisicaRepo();
            repo1.inserir(new PessoaFisica(1, "João Silva", "111.111.111-11", 30));
            repo1.inserir(new PessoaFisica(2, "Maria Souza", "222.222.222-22", 25));
            repo1.persistir("pessoasFisicas.dat");

            PessoaFisicaRepo repo2 = new PessoaFisicaRepo();
            repo2.recuperar("pessoasFisicas.dat");

            System.out.println("=== Pessoas Físicas ===");
            for (PessoaFisica p : repo2.obterTodos()) {
                p.exibir();
            }

            // Pessoas Jurídicas
            PessoaJuridicaRepo repo3 = new PessoaJuridicaRepo();
            repo3.inserir(new PessoaJuridica(1, "Empresa A", "11.111.111/0001-11"));
            repo3.inserir(new PessoaJuridica(2, "Empresa B", "22.222.222/0001-22"));
            repo3.persistir("pessoasJuridicas.dat");

            PessoaJuridicaRepo repo4 = new PessoaJuridicaRepo();
            repo4.recuperar("pessoasJuridicas.dat");

            System.out.println("=== Pessoas Jurídicas ===");
            for (PessoaJuridica p : repo4.obterTodos()) {
                p.exibir();
            }

        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

