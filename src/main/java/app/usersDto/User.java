package app.usersDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    private Integer id;
    private String first_name;
    private String last_name;
    private String email;
}
