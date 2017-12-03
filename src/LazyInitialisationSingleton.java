public class LazyInitialisationSingleton {

    private static LazyInitialisationSingleton instance;

    private LazyInitialisationSingleton() {
    }

    //This is initialised only when the object is demanded for the first time
    public static LazyInitialisationSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitialisationSingleton();
        }
        return instance;
    }
}
