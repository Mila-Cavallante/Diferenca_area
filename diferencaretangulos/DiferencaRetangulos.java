//Exercicio 3
package diferencaretangulos;

/**
 *
 * @author camil
 */
public class DiferencaRetangulos {

    public static void main(String[] args) {
        
        Retangulo m=new Retangulo(0,0,10,10);
        Retangulo n=new Retangulo(0,0,6,6);
        //São duas instâncias de Retangulo
        
        System.out.println("A diferença de área entre dois retângulos é de " 
                    + m.calcularDiferencaArea(n) + " cm².");//passou uma instância dentro da outra.
    }
    
}
