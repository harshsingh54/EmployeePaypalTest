package com.paypal.bfs.test.employeeserv.api.datamodel;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;

@Embeddable
public class Address {
	
		
	 	@JsonProperty("line1")
	    @JsonPropertyDescription("line1")
	 	@NotNull
	 	@Size(min=2, max=25)
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
	    @NotNull
	    @Size(min=2, max=25)
	    private String city;
	    /**
	     * state
	     * (Required)
	     * 
	     */
	    
	    @JsonProperty("state")
	    @JsonPropertyDescription("state")
	    @NotNull
	    @Size(min=2, max=25)
	    private String state;
	    /**
	     * zip code
	     * (Required)
	     * 
	     */
	    
	    @JsonProperty("zip_code")
	    @JsonPropertyDescription("zip code")
	    @NotNull
	    @Size(min=2, max=15)
	    private String zipCode;
	    
	    /**
	     * Country
	     * (Required)
	     * 
	     */
	    
	    @JsonProperty("country")
	    @JsonPropertyDescription("country")
	    @NotNull
	    @Size(min=2, max=15)
	    private String country;
	    

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

	    /**
	     * Country
	     * (Required)
	     * 
	     */
	    @JsonProperty("country")
	    public String getCountry() {
	        return country;
	    }

	    /**
	     * Country
	     * (Required)
	     * 
	     */
	    @JsonProperty("country")
	    public void setCountry(String country) {
	        this.country = country;
	    }
	    
	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("line1");
	        sb.append('=');
	        sb.append(((this.line1 == null)?"<null>":this.line1));
	        sb.append(',');
	        sb.append("city");
	        sb.append('=');
	        sb.append(((this.city == null)?"<null>":this.city));
	        sb.append(',');
	        sb.append("state");
	        sb.append('=');
	        sb.append(((this.state == null)?"<null>":this.state));
	        sb.append(',');
	        sb.append("zipCode");
	        sb.append('=');
	        sb.append(((this.zipCode == null)?"<null>":this.zipCode));
	        return sb.toString();
	    }

}
