/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.megaexercicio;

/**
 *
 * @author aluno
 */
public class MegaExercicio {

    public static void main(String[] args) {
        Ingresso in = new Ingresso(25);
        IngressoVIP i = new IngressoVIP(250);
        
        System.out.println(in.toString());
        System.out.println(i.toString());
        
        Empregado e = new Empregado("jorjao", 2500);
        Gerente g = new Gerente("Departamentao","Gerentao", 900);
        Vendedor v = new Vendedor("pelicano", 2000, 10);
        
        System.out.println("======================================================================");

        
        System.out.println(e.toString());
        System.out.println("Total com comissao: "+ v.CalcularComissao(200));
        System.out.println(g.toString());
        
        ContaBancaria cb = new ContaBancaria("joao", 2, 2500);
        ContaPoupanca cc = new ContaPoupanca(cb.getCliente(), cb.getNum_conta(), cb.getSaldo(), 44);
        ContaEspecial ce = new ContaEspecial(cb.getCliente(), cb.getNum_conta(), cb.getSaldo(),-300);
        
        ce.Sacar(2800);
        cc.CalcularNovoSaldo(2500);
        cb.SacarCB(300);
        
        System.out.println("======================================================================");

        
        Animal an = new Animal("leao", 2, 3, "vermelho", "terra", 25);
        Peixe pe = new Peixe(an.getNome(), an.getComprimento(), an.getPatas(), an.getCor(), an.getAmbiente(), an.getVelocidade(), "legal");
        Mamifero ma = new Mamifero(an.getNome(), an.getComprimento(), an.getPatas(), an.getCor(), an.getAmbiente(), an.getVelocidade(), "feijao");
        
        System.out.println("======================================================================");
        
        an.Dados();
        pe.Caracteristica();
        pe.Dados();
        ma.Alimento();
        ma.Dados();
        
    }
}
