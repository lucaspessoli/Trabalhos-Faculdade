/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.cadastrocerveja;

/**
 *
 * @author aluno
 */
public class Cerveja {
    public String nomeCerveja;
    public String marcaCerveja;
    public int mlCerveja;
    public double valorCerveja;
    private int codigoCerveja;
    private String localidade;
    
    public Cerveja(String nomeCerveja, String marcaCerveja, int mlCerveja, double valorCerveja){
        this.nomeCerveja = nomeCerveja;
        this.marcaCerveja = marcaCerveja;
        this.mlCerveja = mlCerveja;
        this.valorCerveja = valorCerveja;
    }
    
    public void setCodigoCerveja(int codigoCerveja){
        this.codigoCerveja = codigoCerveja;
    }
    public int getCodigoCerveja(){
        return this.codigoCerveja;
    }
    public void setLocalidade(String localidade){
        this.localidade = localidade;
    }
    public String getLocalidade(){
        return this.localidade;
    }
    
    public void ExibeRelatorio(){
        System.out.println("\nNome da cerveja: " + this.nomeCerveja);
        System.out.println("Marca cerveja: " + this.marcaCerveja);
        System.out.println("mL cerveja: " + this.mlCerveja);
        System.out.println("Valor da cerveja: " + this.valorCerveja);
        System.out.println("Marca cerveja: " + this.marcaCerveja);
        System.out.println("Código da cerveja: " + getCodigoCerveja());
        System.out.println("Marca cerveja: " + getLocalidade());
    }
}
