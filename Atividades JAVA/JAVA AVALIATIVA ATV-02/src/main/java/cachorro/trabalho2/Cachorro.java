/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cachorro.trabalho2;

/**
 *
 * @author aluno
 */
public class Cachorro {
    private String nome;
    private String corDeOlhos;
    private String sobrenome;
    private int idade;
    private double peso;
    
    public Cachorro(String nNome, String nCorDeOlhos, String nSobrenome, int nIdade, double nPeso){
        nome = nNome;
        corDeOlhos = nCorDeOlhos;
        sobrenome = nSobrenome;
        idade = nIdade;
        peso = nPeso;
    }
    
    public String getNome(){
        return "nome da cachorra: " + nome;
    }
    public String getCorDeOlhos(){
        return "cor de olhos da cachorra: " + corDeOlhos;
    }
    public String getSobrenome(){
        return "sobrenome da cachorra: " + sobrenome;
    }
    public String getIdade(){
        return "idade da cachorra: " + idade;
    }
    public String getPeso(){
        return "peso da cachorra: " + peso;
    }
}
    

