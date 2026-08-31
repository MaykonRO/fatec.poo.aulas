package org.fatec.aula3;

/**
 *
 * @author lab53
 */
public class Foo {
    public int x;
    private int y;
    int z; //no modifier

    public int getY(){
        // a leitura de y é feito dentro da classe,
        // porem a chamada de get y e' aberta para todos
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    
}
