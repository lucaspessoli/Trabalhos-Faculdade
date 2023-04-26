/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.megaexercicio;

/**
 *
 * @author aluno
 */
public class Gerente extends Empregado {
    private String departamento;

    public Gerente(String departamento,String nome, float salario) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public String toString(){
    return "O nome do departamento é: " + getDepartamento() + ", o nome do empregado: " + getNome() + ", o sálario" + getSalario();
}
}
