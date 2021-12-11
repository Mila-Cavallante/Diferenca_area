//Exercicio 3
package diferencaretangulos;

/**
 *
 * @author camil
 */
public class Retangulo {
    int x1,x2,y1,y2;
    
    public Retangulo (int x1, int y1, int x2, int y2){ //passando as coordenadas
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }
    
    public int getArea(){ //Cálculo da área de cada retangulo
        int a=x2-x1;
        int b=y2-y1;
        return a*b;
    }
    
    //cálculo da diferença dos retângulos
    public int calcularDiferencaArea(Retangulo ret){ //passou uma instância para dentro da outra
         int result=this.getArea()-ret.getArea();
         return result;
    }
    
}
