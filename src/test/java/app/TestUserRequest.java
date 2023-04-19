package app;

import app.config.UserHttpRequest;
import app.usersDto.Person;
import app.usersDto.User;
import app.usersDto.UserList;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import static app.TestData.user;
import static org.junit.jupiter.api.Assertions.*;

public class TestUserRequest {

    public static UserHttpRequest userHttpRequest;

    @BeforeAll
    public static void init(){
        userHttpRequest = new UserHttpRequest();
    }

    @Test
    public void testGetUserData() {
        User actualUser = userHttpRequest.getUser("2")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .jsonPath()
                .getObject("data", User.class);
        Assertions.assertEquals(actualUser, user);
    }

    @Test
    public void testGetUserList() {
        UserList actualUserList = userHttpRequest.getUserList("1")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(UserList.class);
        assertAll("User list assertions",
                () -> assertNotNull(actualUserList.getData(), "User list is null"),
                () -> assertFalse(actualUserList.getData().isEmpty(), "User list is empty"),
                () -> assertNotNull(actualUserList.getSupport(), "Support field is null"),
                () -> assertFalse(StringUtils.isBlank(actualUserList.getSupport().getUrl()),
                        "Support URL is null or empty"),
                () -> assertFalse(StringUtils.isBlank(actualUserList.getSupport().getText()),
                        "Support text is null or empty")
        );
    }

    @Test
    public void createUser() {
        Person expected = new Person(TestData.userName, TestData.jobTitle, null, null);
        Person actual = userHttpRequest.createUser(expected)
                .then()
                .statusCode(201)
                .contentType(ContentType.JSON)
                .extract()
                .as(Person.class);
        assertAll("Verify created user",
                () -> Assertions.assertEquals(expected.getName(), actual.getName(),
                        "Name is not as expected"),
                () -> Assertions.assertEquals(expected.getJob(), actual.getJob(),
                        "Job title is not as expected"),
                () -> assertNotNull(actual.getId(),
                        "ID is null"),
                () -> assertNotNull(actual.getCreatedAt(),
                        "Created at is null")
        );
    }
}
