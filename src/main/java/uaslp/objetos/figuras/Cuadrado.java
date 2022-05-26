package uaslp.objetos.figuras;

public class Cuadrado extends Figura{

    private double lado;
    private double area;


    public Cuadrado(double lado){
        super("Cuadrado");
        this.lado=lado;
    }
    public Cuadrado(){
        super("Cuadrado");

    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        area = lado * lado;
        if (lado == 0) {
            throw new LadoNoProvistoException();
        }
        return area;
    }
    public double getLado() {
        return lado;
    }
}
