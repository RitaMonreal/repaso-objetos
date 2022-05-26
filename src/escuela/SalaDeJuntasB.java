package uaslp.objetos.escuela;

public class SalaDeJuntasB implements SalaDeJuntas{
    @Override
    public String getNombre() {
        return ("Sala B");
    }

    static SalaDeJuntasB uniqueInstance;

    public static SalaDeJuntasB getInstance()
    {
        if(uniqueInstance == null)
        {
            uniqueInstance = new SalaDeJuntasB();
        }
        return uniqueInstance;
    }
}
