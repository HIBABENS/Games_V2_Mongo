package controllers;

import org.mongodb.morphia.Datastore;

import Entity.UserEntity;

import javax.annotation.PostConstruct;
import javax.ejb.DependsOn;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import java.math.BigDecimal;


@Startup
@DependsOn("DBConnection")
@Singleton
public class UserStartupFactory {

    @Inject
    Datastore datastore;

    @PostConstruct
    private void init() {
        if (datastore.find(UserEntity.class).countAll() == 0) {
            for (int i = 1; i < 12; i++) {
            	UserEntity user = new UserEntity();
            	user.setUsername("hiba");
            	user.setPassword("hiba");
                user.setFirstname("hiba");
                user.setLastName("Bens");
                datastore.save(user);
            }
        }
    }

}
