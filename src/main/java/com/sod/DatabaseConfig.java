package com.sod;

public class DatabaseConfig {
    private static DatabaseConfig instance = null;
    private String url;
    private String username;
    private String password;

    private DatabaseConfig() {
        this.url = "jdbc:mysql://localhost:3306/fastfood1";
        this.username = "root";
        this.password = "0000";
    }

    public static DatabaseConfig getInstance() {
        if (instance == null) {
            synchronized (DatabaseConfig.class) {
                if (instance == null) {
                    instance = new DatabaseConfig();
                }
            }
        }
        return instance;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
