package ch.bbzbl.entities;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import java.time.LocalDate;

@Entity
public class Agent extends AbstractEntity {

    private String firstName;
    private String lastName;
    @Email
    private String email;
    private String phone;
    private LocalDate dateOfBirth;
    private String codeName;
    private String role;
    private boolean licenseToKill;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getCodeName() {
        return codeName;
    }
    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public boolean isLicenseToKill() {
        return licenseToKill;
    }
    public void setLicenseToKill(boolean licenseToKill) {
        this.licenseToKill = licenseToKill;
    }

}
