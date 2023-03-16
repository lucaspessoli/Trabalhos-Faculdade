/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package braintech.cadastrabicicletas;

/**
 *
 * @author aluno
 */
public class Bike {
    
    public String marca;
    private String cor;
    private String modelo;
    private String fornecedor;
    public int aro;
    public int tamanho;
    private double valor;    
    
    
    
    public Bike(String cordaBike, String modelodaBike){
        this.cor = cordaBike;
        this.modelo = modelodaBike;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setAro(int aro){
        this.aro = aro;
    }
    
    public int getAro(){
        return aro;
    }
    
    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }
    
    public int getTamanho(){
        return tamanho;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getCor(){
        return cor;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setFornecedor(String fornecedor){
        this.fornecedor = fornecedor;
    }
    public void cadastroFornecedor(double valor, String fornecedor){
        this.fornecedor = fornecedor;
        this.valor = valor;
    }
    
    public void cadastroMarca(String marca, int tamanho, int aro){
        this.marca = marca;
        this.tamanho = tamanho;
        this.aro = aro;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public double getValor(){
        return valor;
    }   
    
    public String getFornecedor(){
        return fornecedor;
    }
    
}
