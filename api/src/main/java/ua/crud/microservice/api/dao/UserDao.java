package ua.crud.microservice.api.dao;

import ua.crud.microservice.api.entity.Role;
import ua.crud.microservice.api.entity.User;
import ua.simpleservletframework.data.annotation.annotation.ComponentDao;
import ua.simpleservletframework.data.factory.ConnectionFactory;

import java.sql.*;
import java.util.List;

import static ua.crud.microservice.api.util.Constants.*;
import static ua.crud.microservice.api.util.SQLQueries.*;

@ComponentDao
public class UserDao implements Dao<User> {
    @Override
    public void create() {
        try (
                Connection conn = ConnectionFactory.getInstance().getConnection();
                Statement st = conn.createStatement()
        ) {
            st.executeUpdate(CREATE_TABLE_USER);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void insert(User user) {
        try (
                Connection conn = ConnectionFactory.getInstance().getConnection();
                PreparedStatement ps = conn.prepareStatement(CREATE_USER)
        ) {
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getUsername());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getRole().getRole());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(User user) {
        try (
                Connection conn = ConnectionFactory.getInstance().getConnection();
                PreparedStatement ps = conn.prepareStatement(UPDATE_USER)
        ) {
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getUsername());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getRole().getRole());
            ps.setLong(5, user.getUserId());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User read(long id) throws SQLException {
        User user = null;

        try (
                Connection conn = ConnectionFactory.getInstance().getConnection();
                PreparedStatement st = conn.prepareStatement(GET_EXCURSION_BY_ID)
        ) {
            st.setLong(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                user = User.builder()
                        .userId(rs.getLong(USER_ID))
                        .email(rs.getString(EMAIL))
                        .username(rs.getString(USERNAME))
                        .password(rs.getString(PASSWORD))
                        .role(Role.valueOf(rs.getString(ROLE)))
                        .build();
            }
            rs.close();
        }

        return user;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
