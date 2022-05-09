package dev.rachamon.api.common.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnectorProvider implements IDatabaseConnector {
    private final String connectionString;
    private Connection connection;

    public SQLiteConnectorProvider(String fileLocation) {
        this.connectionString = "jdbc:sqlite:" + fileLocation;

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean isInitialized() {
        return true;
    }

    @Override
    public void closeConnection() {
        try {
            if (this.connection != null) {
                this.connection.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void connect(ConnectionCallback callback) {
        if (this.connection == null) {
            try {
                this.connection = DriverManager.getConnection(this.connectionString);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        try {
            callback.accept(this.connection);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
