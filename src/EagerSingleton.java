public class EagerSingleton {

    //Created instance at the time of class loading
    private static final EagerSingleton instance = new EagerSingleton();

    //Private constructor to avoid client applications to create instance of this Singleton class
    private EagerSingleton() {
    }

    //Clients can access this method to get the instance of this class
    public static EagerSingleton getInstance() {
        return instance;
    }
}
