package Singleton;

public class DatabaseSingleton {
    private static DatabaseSingleton instance;
    private String connectionString;

    private DatabaseSingleton() {
        this.connectionString = "jdbc:mysql://localhost:3306/mydb";
    }

    public static DatabaseSingleton getInstance() {
        if (instance == null) {
            instance = new DatabaseSingleton();
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Database: Executing query: " + sql);
    }
}
