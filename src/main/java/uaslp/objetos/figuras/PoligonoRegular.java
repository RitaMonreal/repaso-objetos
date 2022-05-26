package uaslp.objetos.figuras;

public class PoligonoRegular {
    private double lado;
    private int numeroDeLados;

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
        return getPerimetro()*lado/2;
    }

    private double getPerimetro() {
        return lado*numeroDeLados;
    }

    public double getLado() {
        return lado;
    }


}
