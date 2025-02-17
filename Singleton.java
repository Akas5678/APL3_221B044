public class Singleton {

   
    private static final Singleton instance = new Singleton();

    
    private static int accessCount = 0;

   
    private Singleton() {
        
        if (instance != null) {
            throw new IllegalStateException("Instance already created");
        }
    }

   
    public static Singleton getInstance() {
        accessCount++; 
        return instance;
    }

    
    public static int getAccessCount() {
        return accessCount;
    }

   
    public void displayMessage() {
        System.out.println("Singleton instance accessed!");
    }

    
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.displayMessage(); 
        Singleton singleton2 = Singleton.getInstance();
        singleton2.displayMessage(); 
        Singleton singleton3 = Singleton.getInstance();
        singleton3.displayMessage(); 

        
        System.out.println("Singleton accessed " + Singleton.getAccessCount() + " times.");
    }
}
