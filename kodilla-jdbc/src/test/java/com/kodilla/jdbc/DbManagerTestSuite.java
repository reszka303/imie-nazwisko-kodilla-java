package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        DbManager dbManager = DbManager.getInstance();

        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "select * from users";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + ", " +
                    resultSet.getString("firstname") + ", " +
                    resultSet.getString("lastname"));
            counter++;
        }
        resultSet.close();
        statement.close();
        Assert.assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //given
        DbManager dbManager = DbManager.getInstance();

        //when
        String sqlQuery = "select u.firstname, u.lastname, count(*) posts_quantity " +
                "from users u, posts p where u.id = p.user_id " +
                "group by user_id " +
                "having count(*) > 1";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (resultSet.next()) {
            System.out.println(resultSet.getString("firstname") + ", " +
                    resultSet.getString("lastname") + ", " + "posts quantity: " +
                    resultSet.getInt("posts_quantity"));
            counter++;
        }
        resultSet.close();
        statement.close();
        Assert.assertEquals(1, counter);
    }
}
