/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package braintech.advogacia;

/**
 *
 * @author aluno
 */
public class Advogacia {

    public static void main(String[] args) {
        Advogado adv1 = new Advogado("Maria Joaquina", 32);
        Advogado adv2 = new Advogado("Pablo escobar", 45);
        Advogado adv3 = new Advogado("petunia", 22);
        Advogado adv4 = new Advogado("Roger Flamengo", 99);
        Advogado adv5 = new Advogado("Vagabundo", 13);
        Advogado adv6 = new Advogado("lazaro", 92);
        Advogado adv7 = new Advogado("cirilo neves", 29);
        Advogado adv8 = new Advogado("Marcos", 31);
        
        adv1.setSobrenome("lazaroo");
        adv1.setSexo('F');
        adv1.setPublico(true);
        adv1.setSetor("A1");
        adv1.setSalario(92813.43);

        
        adv2.setSobrenome("augusto");
        adv2.setSexo('M');
        adv2.setPublico(true);
        adv2.setSetor("A1");
        adv2.setSalario(29102);

        
        adv3.setSobrenome("marcos");
        adv3.setSexo('M');
        adv3.setPublico(true);
        adv3.setSetor("A1");
        adv3.setSalario(13678.43);
        
        
        adv4.setSobrenome("carolina");
        adv4.setSexo('F');
        adv4.setPublico(true);
        adv4.setSetor("A1");
        adv4.setSalario(9281.43);

        
        adv5.setSobrenome("soares");
        adv5.setSexo('F');
        adv5.setPublico(false);
        adv5.setSetor("A2");
        adv5.setSalario(23900.43);

        
        adv6.setSobrenome("tenebroso");
        adv6.setSexo('M');
        adv6.setPublico(false);
        adv6.setSetor("A1");
        adv6.setSalario(83000.43);
        adv6.ExibirRegistro();
        
        
        adv7.setSobrenome("senor");
        adv7.setSexo('F');
        adv7.setPublico(true);
        adv7.setSetor("A1");
        adv7.setSalario(71932.43);
        adv7.ExibirRegistro();

        
        adv8.setSobrenome("soier");
        adv8.setSexo('M');
        adv8.setPublico(true);
        adv8.setSetor("A3");
        adv8.setSalario(24215.43);
        adv8.ExibirRegistro();
        
    }
}
