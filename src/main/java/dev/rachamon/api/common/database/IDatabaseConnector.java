package dev.rachamon.api.common.database;

import java.sql.Connection;
import java.sql.SQLException;

public interface IDatabaseConnector {
    boolean isInitialized();

    void closeConnection();

    void connect(ConnectionCallback callback);

    interface ConnectionCallback {
        void accept(Connection connection) throws SQLException;
    }
}
