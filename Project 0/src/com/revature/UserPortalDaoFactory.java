package com.revature;

public class UserPortalDaoFactory {
    public static UserPortalDao userPortalDao;

    private UserPortalDaoFactory() {
    }

    public static UserPortalDao getUserPortalDao(){
        if (userPortalDao == null)
            userPortalDao = new UserPortalDaoImpl();
        return userPortalDao;
    }
}
