package com.rexxie;

import dagger.ObjectGraph;
import org.apache.commons.dbutils.QueryRunner;
import com.rexxie.db.ConnectionProvider;

import javax.inject.Inject;

import java.sql.Connection;
import java.sql.SQLException;

public class Application implements Runnable {

    private final ConnectionProvider prov;

    @Inject
    public Application(ConnectionProvider prov) {
        this.prov = prov;
    }

    public static void main(String[] args) {
        ObjectGraph objectGraph = ObjectGraph.create(new AppModule());
        Application app = objectGraph.get(Application.class);
        app.run();
    }

    @Override
    public void run() {
        try {
            Connection connection = this.prov.getConnection("secretary");
            QueryRunner queryRunner = new QueryRunner();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}