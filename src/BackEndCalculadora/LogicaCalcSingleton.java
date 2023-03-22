
package BackEndCalculadora;

/**
 *
 * @author dudur
 */
public class LogicaCalcSingleton {
    private float primeiroValor;
    private float segundoValor;
    private static LogicaCalcSingleton Singlenton;
    
    public void finaliza(){
        Singlenton=null;
    }
    public static LogicaCalcSingleton Single(float primeiroValor,float segundoValor){
        if (Singlenton==null){
           Singlenton = new LogicaCalcSingleton(primeiroValor,segundoValor);
        }
        return Singlenton;
    }
    
    private LogicaCalcSingleton(float primeiroValor,float segundoValor){
        this.primeiroValor= primeiroValor;
        this.segundoValor= segundoValor;
    }

    @Override
    public String toString() {
        return "LogicaCalcSingleton{" + "primeiroValor=" + primeiroValor + ", segundoValor=" + segundoValor + '}';
    }
    
    public float Soma(){
        return this.primeiroValor + this.segundoValor;
    }
     public float Sub(){
        return this.primeiroValor - this.segundoValor;
    }
     public float Div(){
        return this.primeiroValor / this.segundoValor;
    }
      public float Mult(){
        return this.primeiroValor * this.segundoValor;
    }

    public float getPrimeiroValor() {
        return primeiroValor;
    }

    public void setPrimeiroValor(float primeiroValor) {
        this.primeiroValor = primeiroValor;
    }

    public float getSegundoValor() {
        return segundoValor;
    }

    public void setSegundoValor(float segundoValor) {
        this.segundoValor = segundoValor;
    }

    public static LogicaCalcSingleton getSinglenton() {
        return Singlenton;
    }

    public static void setSinglenton(LogicaCalcSingleton Singlenton) {
        LogicaCalcSingleton.Singlenton = Singlenton;
    }
      
}
