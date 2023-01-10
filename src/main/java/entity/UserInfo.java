package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class UserInfo {

    public UserInfo(String address, String gender, String birth_date) {
        this.address = address;
        this.gender = gender;
        this.birth_date = birth_date;
    }

    public UserInfo() {
    }

    @Id
    @GeneratedValue
    private Long id;
    private String address;
    private String gender;
    private String birth_date;

    /*--------------------------------------------------MAPPING---------------------------------------------------*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birth_date;
    }

    public void setBirthDate(String birth_date) {
        this.birth_date = birth_date;
    }
}
