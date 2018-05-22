package abstraccion;

public class Conversion {

    private Grados grados;
    private Metros metros;
    
    public float metrosAPies(){
    
    float  resultado = metros.getMetros()* 3.28f;
    return resultado;
    
    }
    public float centigradosAFarenheit() {
        //Este metodo tiene lógica
        //error lo marca ya que por default el 1.8 lo lee como double

        //Ponerle una f al final para identificar  que es un flotante
        float resultado = grados.getCentigrados() * 1.8f + 32;
        return resultado;

    }

    public Grados getGrados() {
        return grados;
    }

    public void setGrados(Grados grados) {
        this.grados = grados;
    }

    public Metros getMetros() {
        return metros;
    }

    public void setMetros(Metros metros) {
        this.metros = metros;
    }

}
