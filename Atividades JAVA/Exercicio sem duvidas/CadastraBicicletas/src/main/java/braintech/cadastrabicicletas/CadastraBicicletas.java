/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package braintech.cadastrabicicletas;

/**
 *
 * @author aluno
 */
public class CadastraBicicletas {

    public static void main(String[] args) {
        
        Bike bicicleta = new Bike("branca", "Gt Sprint");
        bicicleta.cadastroFornecedor(100, "decathlon");
        bicicleta.cadastroMarca("BMX", 15, 26);

        System.out.println("\nCor da bicicleta: " + bicicleta.getCor());
        System.out.println("Modelo da bicicleta: " + bicicleta.getModelo());
        System.out.println("Fornecedor da bicicleta: " + bicicleta.getFornecedor());
        System.out.println("Valor da bicicleta: " + bicicleta.getValor());
        System.out.println("Marca da bicicleta: " + bicicleta.getMarca());
        System.out.println("Tamanho da bicicleta: " + bicicleta.getTamanho());
        System.out.println("Aro da bicicleta: " + bicicleta.getAro());

        
        Bike bicicleta2 = new Bike("amarelo", "Marcos Bike");
        bicicleta2.cadastroFornecedor(100, "lara");
        bicicleta2.cadastroMarca("monark", 22, 21);

        System.out.println("\nCor da bicicleta: " + bicicleta2.getCor());
        System.out.println("Modelo da bicicleta: " + bicicleta2.getModelo());
        System.out.println("Fornecedor da bicicleta: " + bicicleta2.getFornecedor());
        System.out.println("Valor da bicicleta: " + bicicleta2.getValor());
        System.out.println("Marca da bicicleta: " + bicicleta2.getMarca());
        System.out.println("Tamanho da bicicleta: " + bicicleta2.getTamanho());
        System.out.println("Aro da bicicleta: " + bicicleta2.getAro());

        Bike bicicleta3 = new Bike("rosa", "monarkv2");
        bicicleta3.cadastroFornecedor(100, "peneiraBicicletaria");
        bicicleta3.cadastroMarca("testiculo", 2, 15);

        
        System.out.println("\nCor da bicicleta: " + bicicleta3.getCor());
        System.out.println("Modelo da bicicleta: " + bicicleta3.getModelo());
        System.out.println("Fornecedor da bicicleta: " + bicicleta3.getFornecedor());
        System.out.println("Valor da bicicleta: " + bicicleta3.getValor());
        System.out.println("Marca da bicicleta: " + bicicleta3.getMarca());
        System.out.println("Tamanho da bicicleta: " + bicicleta3.getTamanho());
        System.out.println("Aro da bicicleta: " + bicicleta3.getAro());

        Bike bicicleta4 = new Bike("amarelo", "Port");
        bicicleta4.cadastroFornecedor(100, "rubi");
        bicicleta4.cadastroMarca("amarga", 2, 11);

        System.out.println("\nCor da bicicleta: " + bicicleta4.getCor());
        System.out.println("Modelo da bicicleta: " + bicicleta4.getModelo());
        System.out.println("Fornecedor da bicicleta: " + bicicleta4.getFornecedor());
        System.out.println("Valor da bicicleta: " + bicicleta4.getValor());
        System.out.println("Marca da bicicleta: " + bicicleta4.getMarca());
        System.out.println("Tamanho da bicicleta: " + bicicleta4.getTamanho());
        System.out.println("Aro da bicicleta: " + bicicleta4.getAro());

        Bike bicicleta5 = new Bike("preta", "lenta");
        bicicleta5.cadastroFornecedor(100, "saci");
        bicicleta5.cadastroMarca("sete", 12, 11);

        System.out.println("\nCor da bicicleta: " + bicicleta5.getCor());
        System.out.println("Modelo da bicicleta: " + bicicleta5.getModelo());
        System.out.println("Fornecedor da bicicleta: " + bicicleta5.getFornecedor());
        System.out.println("Valor da bicicleta: " + bicicleta5.getValor());
        System.out.println("Marca da bicicleta: " + bicicleta5.getMarca());
        System.out.println("Tamanho da bicicleta: " + bicicleta5.getTamanho());
        System.out.println("Aro da bicicleta: " + bicicleta5.getAro());

        Bike bicicleta6 = new Bike("termonetro", "maria joaquina");
        bicicleta6.cadastroFornecedor(100, "entrelacos da bike");
        bicicleta6.cadastroMarca("dodge ram", 11, 7);

        System.out.println("\nCor da bicicleta: " + bicicleta6.getCor());
        System.out.println("Modelo da bicicleta: " + bicicleta6.getModelo());
        System.out.println("Fornecedor da bicicleta: " + bicicleta6.getFornecedor());
        System.out.println("Valor da bicicleta: " + bicicleta6.getValor());
        System.out.println("Marca da bicicleta: " + bicicleta6.getMarca());
        System.out.println("Tamanho da bicicleta: " + bicicleta6.getTamanho());
        System.out.println("Aro da bicicleta: " + bicicleta6.getAro());
    }
}
