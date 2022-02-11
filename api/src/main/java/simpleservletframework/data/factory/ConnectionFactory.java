package simpleservletframework.data.factory;

import simpleservletframework.data.connection.DatabaseConnection;
import simpleservletframework.data.pool.ConnectionPool;

public class ConnectionFactory {
    public static DatabaseConnection getInstance() {
        return new ConnectionPool();
    }
}
