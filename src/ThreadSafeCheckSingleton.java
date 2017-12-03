public class ThreadSafeCheckSingleton {

    private static ThreadSafeCheckSingleton instance;

    private ThreadSafeCheckSingleton() {
    }

    public static ThreadSafeCheckSingleton getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (ThreadSafeCheckSingleton.class) {
                if(instance == null){
                    instance = new ThreadSafeCheckSingleton();
                }
            }
        }
        return instance;
    }
}
