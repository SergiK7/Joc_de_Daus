package cat.itacademy.barcelonactiva.carapuigmasnou.sergi.s05.t02.n01.model.repository;
import org.springframework.stereotype.Component;

@Component
public class UserResponseDto extends ResponseDto{

    private String name;
    private String surname;
    private String dateOfBirth;
    private String gender;
    private String uuid;


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }
    public String getUuid() {
        return uuid;
    }
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}