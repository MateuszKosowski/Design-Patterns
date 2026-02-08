package Singleton;

public class SingletonDemo {
    public static void main(String[] args) {

        DatabaseSingleton db1 = DatabaseSingleton.getInstance();
        db1.query("SELECT * FROM users");

        DatabaseSingleton db2 = DatabaseSingleton.getInstance();
        db2.query("INSERT INTO logs VALUES ('Hello')");

        if (db1 == db2) {
            System.out.println("\nSUCCESS: db1 i db2 are the same object!");
        } else {
            System.out.println("\nERROR: We have a problem!");
        }
    }
}
