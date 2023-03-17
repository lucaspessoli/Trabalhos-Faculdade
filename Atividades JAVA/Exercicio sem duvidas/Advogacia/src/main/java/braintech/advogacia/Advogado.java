/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.advogacia;

/**
 *
 * @author aluno
 */
public class Advogado {
    public String nomeAdvogado;
    public int idadeAdvogado;
    private String setorAdvogado;
    private double salarioAdvogado;
    private char sexoAdvogado;
    private String sobrenomeAdvogado;
    private boolean advogadoPublico;
    
    public Advogado(String nomeAdovagado, int idadeAdvogado){
        this.nomeAdvogado = nomeAdovagado;
        this.idadeAdvogado = idadeAdvogado;
    }
    
    public void setSetor(String setorAdvogado){
        this.setorAdvogado = setorAdvogado;
    }
    
    public String getSetor(){
        return setorAdvogado;
    }
    
    public void setSalario(double salarioAdvogado){
        this.salarioAdvogado = salarioAdvogado;
    }
    
    public double getSalario(){
        return salarioAdvogado;
    }
    
    public void setSexo(char sexoAdvogado){
        this.sexoAdvogado = sexoAdvogado;
    }
    
    public char getSexo(){
        return sexoAdvogado;
    }
    
    public void setSobrenome(String sobrenomeAdvogado){
        this.sobrenomeAdvogado = sobrenomeAdvogado;
    }
    
    public String getSobrenome(){
        return sobrenomeAdvogado;
    }
    
    public void setPublico(boolean advogadoPublico){
        this.advogadoPublico = advogadoPublico;
    }
    
    public boolean getPublico(){
        return advogadoPublico;
    }
    
    public void ExibirRegistro(){
        System.out.println("\nNome do advogado: "+ nomeAdvogado);
        System.out.println("Idade do advogado: "+ idadeAdvogado);
        System.out.println("Sobrenome do advogado: "+getSobrenome());
        System.out.println("Gênero do advogado: "+getSexo());
        System.out.println("É funcionário público? "+getPublico());
        System.out.println("Setor do advogado: "+getSetor());
        System.out.println("Sálario do advogado: "+getSalario());
    }
    
}
