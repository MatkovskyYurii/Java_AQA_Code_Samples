package app.config;

import app.usersDto.Person;
import io.restassured.response.Response;

public class UserHttpRequest extends BaseHttpRequest {

    public static final String userUrl = "api/users";

    public Response getUser(String id) {
        return getRequestSpecification()
                .when()
                .get(userUrl + "/" + id);
    }

    public Response getUserList(String page) {
        return getRequestSpecification()
                .when()
                .get(userUrl + "?page=" + page);
    }

    public Response createUser(Person person) {
        return getRequestSpecification()
                .when()
                .body(person)
                .post(userUrl);
    }
}
