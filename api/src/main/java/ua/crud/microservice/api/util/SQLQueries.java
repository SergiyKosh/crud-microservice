package ua.crud.microservice.api.util;

import static ua.crud.microservice.api.util.Constants.*;

public class SQLQueries {
    public static final String CREATE_TABLE_EXCURSIONS = "CREATE TABLE IF NOT EXISTS " + TABLE_EXCURSIONS + "(" + EXCURSION_ID +
            " BIGSERIAL NOT NULL, " + EXCURSION_NAME + " VARCHAR(100) NOT NULL, " + EXCURSION_CATEGORY + " VARCHAR(100) NOT NULL, " +
            EXCURSION_CITY + " VARCHAR(100) NOT NULL, " + EXCURSION_DESCRIPTION + " TEXT NOT NULL" +
            ")";
    public static final String CREATE_EXCURSION = "INSERT INTO " + TABLE_EXCURSIONS + "("
            + EXCURSION_NAME + ", " + EXCURSION_CATEGORY + ", " + EXCURSION_CITY + ", " + EXCURSION_DESCRIPTION + ") VALUES(?, ?, ?, ?)";
    public static final String READ_ALL_EXCURSIONS = "SELECT * FROM " + TABLE_EXCURSIONS;

    public static final String UPDATE_EXCURSION = "UPDATE " + TABLE_EXCURSIONS + " SET " +
            EXCURSION_NAME + "=?," + EXCURSION_CATEGORY + "=?," + EXCURSION_CITY + "=?," + EXCURSION_DESCRIPTION + "=?" +
            " WHERE " + EXCURSION_ID + "=?";

    public static final String GET_EXCURSION_BY_ID = "SELECT * FROM " + TABLE_EXCURSIONS + " WHERE " + EXCURSION_ID + "=?";
}
