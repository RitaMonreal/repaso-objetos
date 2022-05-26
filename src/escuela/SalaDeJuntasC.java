package uaslp.objetos.escuela;

public class SalaDeJuntasC implements SalaDeJuntas{
    @Override
    public String getNombre() {
        return ("Sala C");
    }

    static SalaDeJuntasC uniqueInstance;

    public static SalaDeJuntasC getInstance()
    {
        if(uniqueInstance == null)
        {
            uniqueInstance = new SalaDeJuntasC();
        }
        return uniqueInstance;
    }
}
