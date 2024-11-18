package com.ClientHappinessTeam;

//import java.time.LocalDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CHT")
public class ClientHappinessTeam {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer idd;
	 private String id;
    private String chtcallbeneficiary;
    private String chtfeedbackmailtoclient;
    private String chtallclient;
    private String gettingconcernformsigned;
    // Default constructor
    public ClientHappinessTeam() {}

    // Constructor with parameters
    public ClientHappinessTeam
    	(	String id,
    		String chtcallbeneficiary, 
    		String chtfeedbackmailtoclient, 
    		String chtallclient, 
    		String gettingconcernformsigned )
    {
        this.id = id;
        this.chtcallbeneficiary = chtcallbeneficiary;
        this.chtfeedbackmailtoclient = chtfeedbackmailtoclient;
        this.chtallclient = chtallclient;
        this.gettingconcernformsigned = gettingconcernformsigned;
    }

    // Getters and Setters
    public String getId() {  return id; }
    public void setId(String id) { this.id = id; }
    public String getChtcallbeneficiary() {  return chtcallbeneficiary; }
    public void setChtcallbeneficiary(String chtcallbeneficiary) { this.chtcallbeneficiary = chtcallbeneficiary; }
    public String getChtfeedbackmailtoclient() {  return chtfeedbackmailtoclient; }
    public void setChtfeedbackmailtoclient(String chtfeedbackmailtoclient) { this.chtfeedbackmailtoclient = chtfeedbackmailtoclient; }
    public String getChtallclient() {  return chtallclient; }
    public void setChtallclient(String chtallclient) { this.chtallclient = chtallclient; }
    public String getGettingconcernformsigned() {  return gettingconcernformsigned; }
    public void setGettingconcernformsigned(String gettingconcernformsigned) { this.gettingconcernformsigned = gettingconcernformsigned; }
}
    