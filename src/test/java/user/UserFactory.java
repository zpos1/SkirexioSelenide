package user;

import utils.PropertyReader;

public class UserFactory {
    public static User withAdminPermision() {
        return new User(PropertyReader.getProperty("skyrexio.user"),
                        PropertyReader.getProperty("skyrexio.pass"));

    }
}
