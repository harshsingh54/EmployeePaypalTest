package com.paypal.bfs.test.employeeserv.api.datamodel;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

@Entity
public class Employee {
	/**
     * employee id
     * 
     */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @JsonProperty("id")
    @JsonPropertyDescription("employee id")
    private Integer id;
    /**
     * first name
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    @JsonPropertyDescription("first name")
	@NotNull
	@Size(min=2, max=25)
    private String firstName;
    /**
     * last name
     * (Required)
     * 
     */
    @NotNull
    @JsonProperty("last_name")
    @JsonPropertyDescription("last name")
	@Size(min=2, max=25)
    private String lastName;
    /**
     * date of birth
     * (Required)
     * 
     */
    @JsonProperty("date_of_birth")
    @JsonPropertyDescription("date of birth")
	@NotNull
	@Size(min=2, max=15)
    private String dateOfBirth;
    /**
     * address
     * (Required)
     * 
     */
    @Embedded    
    @JsonProperty("address")
    @JsonPropertyDescription("address")
    @NotNull
    @Valid
    private Address address;
    
    /**
     * employee id
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

//    /**
//     * employee id
//     * 
//     */
//    @JsonProperty("id")
//    public void setId(String id) {
//        this.id = Integer.valueOf(id);
//    }

    /**
     * first name
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     * first name
     * (Required)
     * 
     */
    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * last name
     * (Required)
     * 
     */
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    /**
     * last name
     * (Required)
     * 
     */
    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * date of birth
     * (Required)
     * 
     */
    @JsonProperty("date_of_birth")
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * date of birth
     * (Required)
     * 
     */
    @JsonProperty("date_of_birth")
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * address
     * (Required)
     * 
     */
    
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * address
     * (Required)
     * 
     */
    @JsonProperty("address")
    public void setAddress(@Valid Address address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("firstName");
        sb.append('=');
        sb.append(((this.firstName == null)?"<null>":this.firstName));
        sb.append(',');
        sb.append("lastName");
        sb.append('=');
        sb.append(((this.lastName == null)?"<null>":this.lastName));
        sb.append(',');
        sb.append("dateOfBirth");
        sb.append('=');
        sb.append(((this.dateOfBirth == null)?"<null>":this.dateOfBirth));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        return sb.toString();
    }

}
