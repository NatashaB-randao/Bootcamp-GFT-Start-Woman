package dio.gof;

/**
 * Singleton "apressado"
 *
 *@Author: NatashaB-randao
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }

}
