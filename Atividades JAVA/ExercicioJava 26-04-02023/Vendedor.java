/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.megaexercicio;

/**
 *
 * @author aluno
 */
public class Vendedor extends Empregado {
    
    private float percentualComissao;
    
    public Vendedor(String nome, float salario, float percentualComissao){
        super(nome,salario);
        this.percentualComissao = percentualComissao;
    }

    public float getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public float CalcularComissao(float valor){
//       float p = ((valor*100) / getPercentualComissao());
       float p = (valor / getPercentualComissao());
       float p1 = (p + valor);
       return p1;
    }
    
    public String toString(){
        return "Nome do funcionario: " + getNome() + " Sálario do funcionario: " + getSalario() 
                + "Sálario bonificado: " + CalcularComissao(getSalario())
                + "O percentual normal: " + getPercentualComissao() + "%";
    }
    
    
    
}
