import java.util.Properties;

public class PropertyLoader {

    public static String loadProperty(String name) {
        Properties props = new Properties();
        try {
            props.load(PropertyLoader.class.getResourceAsStream("/properties/app.properties"));
        } catch (Exception e) {
            throw new NullPointerException("Ошибка в методе loadProperty класса PropertyLoader");
        }

        String value = "";

        if (name != null) {
            value = props.getProperty(name);
        }
        return value;
    }

}
