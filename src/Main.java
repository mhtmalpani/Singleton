public class Main {

    public static void main(String[] args) {

        EagerSingleton eagerSingleton = EagerSingleton.getInstance();

        System.out.println(eagerSingleton);


        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();

        System.out.println(staticBlockSingleton);


        LazyInitialisationSingleton lazyInitialisationSingleton = LazyInitialisationSingleton.getInstance();

        System.out.println(lazyInitialisationSingleton);


        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();

        System.out.println(threadSafeSingleton);


        ThreadSafeCheckSingleton threadSafeCheckSingleton = ThreadSafeCheckSingleton.getInstanceUsingDoubleLocking();

        System.out.println(threadSafeCheckSingleton);


        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();

        System.out.println(billPughSingleton);
    }
}
