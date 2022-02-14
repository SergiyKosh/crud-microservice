package ua.crud.microservice.api.dao;

import ua.crud.microservice.api.entity.Excursion;
import ua.simpleservletframework.data.annotation.annotation.ComponentDao;
import ua.simpleservletframework.data.factory.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static ua.crud.microservice.api.util.Constants.*;
import static ua.crud.microservice.api.util.SQLQueries.*;

@ComponentDao("excursionDao")
public class ExcursionDao implements Dao<Excursion> {
    @Override
    public void create() {
        try (
                Connection conn = ConnectionFactory.getInstance().getConnection();
                Statement st = conn.createStatement()
        ) {
            st.executeUpdate(CREATE_TABLE_EXCURSIONS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void insert(Excursion excursion) {
        try (
                Connection conn = ConnectionFactory.getInstance().getConnection();
                PreparedStatement ps = conn.prepareStatement(CREATE_EXCURSION)
        ) {
            ps.setString(1, excursion.getName());
            ps.setString(2, excursion.getCategory());
            ps.setString(3, excursion.getCity());
            ps.setString(4, excursion.getDescription());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Excursion excursion) {
        try (
                Connection conn = ConnectionFactory.getInstance().getConnection();
                PreparedStatement ps = conn.prepareStatement(UPDATE_EXCURSION)
        ) {
            ps.setString(1, excursion.getName());
            ps.setString(2, excursion.getCategory());
            ps.setString(3, excursion.getCity());
            ps.setString(4, excursion.getDescription());
            ps.setLong(5, excursion.getExcursionId());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Excursion read(long id) throws SQLException {
        Excursion excursion = null;

        try (
                Connection conn = ConnectionFactory.getInstance().getConnection();
                PreparedStatement st = conn.prepareStatement(GET_EXCURSION_BY_ID)
        ) {
            st.setLong(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                excursion = Excursion.builder()
                        .excursionId(rs.getLong(EXCURSION_ID))
                        .name(rs.getString(EXCURSION_NAME))
                        .category(rs.getString(EXCURSION_CATEGORY))
                        .city(rs.getString(EXCURSION_CITY))
                        .description(rs.getString(EXCURSION_DESCRIPTION))
                        .build();
            }
            rs.close();
        }

        return excursion;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<Excursion> findAll() {
        List<Excursion> excursions = new ArrayList<>();

        try (
                Connection conn = ConnectionFactory.getInstance().getConnection();
                Statement st = conn.createStatement()
        ) {
            ResultSet rs = st.executeQuery(READ_ALL_EXCURSIONS);
            while (rs.next()) {
                Excursion excursion = Excursion.builder()
                        .excursionId(rs.getLong(EXCURSION_ID))
                        .name(rs.getString(EXCURSION_NAME))
                        .category(rs.getString(EXCURSION_CATEGORY))
                        .city(rs.getString(EXCURSION_CITY))
                        .description(rs.getString(EXCURSION_DESCRIPTION))
                        .build();

                excursions.add(excursion);
            }
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return excursions;
    }
}
