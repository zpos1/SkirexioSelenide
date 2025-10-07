package user;

import utils.PropertyReader;

public class UserFactory {
    public static User withAdminPermision() {
        return new User(PropertyReader.getProperty("skyrexio.user"),
                        PropertyReader.getProperty("skyrexio.pass"));
    }

    public static User incorrectUser() {

        return new User(PropertyReader.getProperty("incorrect.user"),
                PropertyReader.getProperty("incorrect.pass"));
    }
}
