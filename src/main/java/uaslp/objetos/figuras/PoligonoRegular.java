package uaslp.objetos.figuras;

import static java.lang.Math.tan;
import static java.lang.Math.tanh;

public class PoligonoRegular {
    private double lado;
    private int numeroDeLados;
    private double apotema;

    public PoligonoRegular(int numeroDeLados, double lado) {
        this.numeroDeLados=numeroDeLados;
        this.lado=lado;
    }

    public PoligonoRegular(int numeroDeLados){
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
        apotema = lado/(2*tan(rad));

        return (getPerimetro()*apotema)/2;
    }

    private double getPerimetro() {
        return lado*numeroDeLados;
    }

    public double getLado() {
        return lado;
    }


}
