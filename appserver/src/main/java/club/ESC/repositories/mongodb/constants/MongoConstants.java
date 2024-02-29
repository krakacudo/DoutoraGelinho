package club.ESC.repositories.mongodb.constants;

public class MongoConstants {
    public static final String DATABASE_URI_PROPERTY = "spring.data.mongodb.uri";
    public static final String DATABASE_NAME_PROPERTY = "spring.data.mongodb.database";
    public static final String INCORRECT_DATABASE_NAME_MESSAGE = "Error when configuring mongo : database name can't be null";
    public static final String INCORRECT_DATABASE_URI_MESSAGE = "Error when configuring mongo : database uri can't be null or empty";
}
