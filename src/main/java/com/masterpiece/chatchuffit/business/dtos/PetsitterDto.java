package com.masterpiece.chatchuffit.business.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.masterpiece.chatchuffit.business.Environment;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.*;
import java.time.LocalDateTime;

@CrossOrigin(value = "http://localhost:4200")
@EntityListeners(value = AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class PetsitterDto {

    @NotBlank
    @Size(min = 1, max = 20)
    private String firstName;
    @NotBlank
    @Size(min = 1, max = 20)
    private String lastName;
    @NotBlank
    private String animalAllowed;
    @NotNull
    private Double price;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Environment environment;
    @Pattern(regexp = ".+@.+\\.[a-z]+", message = "Invalid mail syntax")
    @Email
    private String mail;
    @Column(nullable = false)
    @Pattern(regexp = "(0|(\\+33)|(0033))[1-9][0-9]{8}", message = "Invalid phone syntax")
    private String phone;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;


   /* @NotNull
    private Address address;


    */

    public PetsitterDto() {
    }

    public PetsitterDto(@NotBlank @Size(min = 1, max = 20) String firstName, @NotBlank @Size(min = 1, max = 20) String lastName, @NotBlank String animalAllowed, @NotNull Double price, @NotNull Environment environment, @Pattern(regexp = ".+@.+\\.[a-z]+", message = "Invalid mail syntax") @Email String mail, @Pattern(regexp = "(0|(\\+33)|(0033))[1-9][0-9]{8}", message = "Invalid phone syntax") String phone, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.animalAllowed = animalAllowed;
        this.price = price;
        this.environment = environment;
        this.mail = mail;
        this.phone = phone;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

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

    public String getAnimalAllowed() {
        return animalAllowed;
    }

    public void setAnimalAllowed(String animalAllowed) {
        this.animalAllowed = animalAllowed;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
