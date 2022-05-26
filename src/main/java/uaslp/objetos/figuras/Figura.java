package uaslp.objetos.figuras;

abstract class Figura extends DrawableItem{
    private final String name;//Cada objeto tendrá su nombre porque no es una variable

    public Figura(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract double getArea() throws LadoNoProvistoException;
}
