package simpleservletframework.data.pool;

import simpleservletframework.data.source.DataSource;
import simpleservletframework.data.connection.DatabaseConnection;

import java.sql.Connection;

public class ConnectionPool implements DatabaseConnection {
    @Override
    public Connection getConnection() {
        return DataSource.getConnection();
    }
}
