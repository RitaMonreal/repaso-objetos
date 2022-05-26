package uaslp.objetos.escuela;

public class SalaDeJuntasA implements SalaDeJuntas{
    @Override
    public String getNombre() {
        return ("Sala A");
    }

    static SalaDeJuntasA uniqueInstance;

    public static SalaDeJuntasA getInstance()
    {
        if(uniqueInstance == null)
        {
            uniqueInstance = new SalaDeJuntasA();
        }
        return uniqueInstance;
    }
}
