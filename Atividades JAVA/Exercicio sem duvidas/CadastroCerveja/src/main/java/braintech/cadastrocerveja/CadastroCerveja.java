/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package braintech.cadastrocerveja;

/**
 *
 * @author aluno
 */
public class CadastroCerveja {

    public static void main(String[] args) {
        Cerveja crv1 = new Cerveja("cerveja malte","brahma",250,35);
        Cerveja crv2 = new Cerveja("cerveja duplo malte","skol",250,36);
        Cerveja crv3 = new Cerveja("cerveja garrafa","heineken",350,42);
        Cerveja crv4 = new Cerveja("cerveja vinho","Chuva Dourada",1000,82);
        Cerveja crv5 = new Cerveja("cerveja roxa","Lopes",820,12);
        
        crv1.setCodigoCerveja(0);
        crv1.setLocalidade("sp");
        crv1.ExibeRelatorio();
        
        crv2.setCodigoCerveja(1);
        crv2.setLocalidade("sp");
        crv2.ExibeRelatorio();
        
        crv3.setCodigoCerveja(2);
        crv3.setLocalidade("rj");
        crv3.ExibeRelatorio();
        
        crv4.setCodigoCerveja(3);
        crv4.setLocalidade("pr");
        crv4.ExibeRelatorio();
        
        crv5.setCodigoCerveja(4);
        crv5.setLocalidade("mg");
        crv5.ExibeRelatorio();
    }
}
