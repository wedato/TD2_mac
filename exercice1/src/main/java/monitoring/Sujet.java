package monitoring;

public interface Sujet {

    public void inscrire(Observer observer, TypeEvenement typeEvenement);
    public void desinscrire(Observer observer);
    public void notifier(TypeEvenement typeEvenement);

}
