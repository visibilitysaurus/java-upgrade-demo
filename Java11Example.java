import java.lang.SecurityManager;

public class Java11Example {
    public static void main(String[] args) {
        // SecurityManager has been removed in Java 21
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager == null) {
            System.setSecurityManager(new SecurityManager());
        }
    }
}