package com.paypal.bfs.test.employeeserv.api.datamodel;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

@Embeddable
public class Address {
	
	 @JsonProperty("line1")
	    @JsonPropertyDescription("line1")
	    private String line1;
	    /**
	     * line2
	     * 
	     */
	    @JsonProperty("line2")
	    @JsonPropertyDescription("line2")
	    private String line2;
	    /**
	     * city
	     * (Required)
	     * 
	     */
	    @JsonProperty("city")
	    @JsonPropertyDescription("city")
	    private String city;
	    /**
	     * state
	     * (Required)
	     * 
	     */
	    @JsonProperty("state")
	    @JsonPropertyDescription("state")
	    private String state;
	    /**
	     * zip code
	     * (Required)
	     * 
	     */
	    @JsonProperty("zip_code")
	    @JsonPropertyDescription("zip code")
	    private String zipCode;

	    /**
	     * line1
	     * (Required)
	     * 
	     */
	    @JsonProperty("line1")
	    public String getLine1() {
	        return line1;
	    }

	    /**
	     * line1
	     * (Required)
	     * 
	     */
	    @JsonProperty("line1")
	    public void setLine1(String line1) {
	        this.line1 = line1;
	    }

	    /**
	     * line2
	     * 
	     */
	    @JsonProperty("line2")
	    public String getLine2() {
	        return line2;
	    }

	    /**
	     * line2
	     * 
	     */
	    @JsonProperty("line2")
	    public void setLine2(String line2) {
	        this.line2 = line2;
	    }

	    /**
	     * city
	     * (Required)
	     * 
	     */
	    @JsonProperty("city")
	    public String getCity() {
	        return city;
	    }

	    /**
	     * city
	     * (Required)
	     * 
	     */
	    @JsonProperty("city")
	    public void setCity(String city) {
	        this.city = city;
	    }

	    /**
	     * state
	     * (Required)
	     * 
	     */
	    @JsonProperty("state")
	    public String getState() {
	        return state;
	    }

	    /**
	     * state
	     * (Required)
	     * 
	     */
	    @JsonProperty("state")
	    public void setState(String state) {
	        this.state = state;
	    }

	    /**
	     * zip code
	     * (Required)
	     * 
	     */
	    @JsonProperty("zip_code")
	    public String getZipCode() {
	        return zipCode;
	    }

	    /**
	     * zip code
	     * (Required)
	     * 
	     */
	    @JsonProperty("zip_code")
	    public void setZipCode(String zipCode) {
	        this.zipCode = zipCode;
	    }



}
