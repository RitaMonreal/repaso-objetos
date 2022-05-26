package uaslp.objetos.figuras;

public class Triangulo extends Figura{

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super("Triangulo");
        this.base=base;
        this.altura=altura;
    }

    public Triangulo() {
        super("Triangulo");
    }

    public Triangulo(String triangul){
        super(triangul);
    }

    public void setBase(double base) {
        this.base=base;
    }

    public void setAltura(double altura) {
        this.altura=altura;
    }

    public double getArea() {
        if(base == 0){
            throw new BaseNoProvistaException();
        }

        if(altura == 0){
            throw new AlturaNoProvistaException();
        }
        return base*altura/2;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public String getDescription() {
        return "Cualquier triangulo";
    }
}
