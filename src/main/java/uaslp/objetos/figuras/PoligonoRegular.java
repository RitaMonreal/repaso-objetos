package uaslp.objetos.figuras;

import static java.lang.Math.tan;

public class PoligonoRegular extends Figura {
    private double lado;
    private int numeroDeLados;

    public PoligonoRegular(int numeroDeLados, double lado) {
        super("Poligono Regular");
        this.numeroDeLados=numeroDeLados;
        this.lado=lado;
    }

    public PoligonoRegular(int numeroDeLados){
        super("Poligono Regular");
        if(numeroDeLados<5){
            throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");
        }
        this.numeroDeLados=numeroDeLados;
    }

    public void setLado(double lado) {
        this.lado=lado;
    }

    public double getArea() {

        double grados;
        double rad;

        grados = 360/(numeroDeLados*2);
        rad=Math.toRadians(grados);
        double apotema = lado / (2 * tan(rad));

        return (getPerimetro()* apotema)/2;
    }

    private double getPerimetro() {
        return lado*numeroDeLados;
    }

    public double getLado() {
        return lado;
    }
}
