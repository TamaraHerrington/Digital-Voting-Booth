package com.VotingBooth;

import javax.naming.Name;
import java.sql.SQLOutput;

public class Candidate {
    //private final PartyAffiliation partyAffiliation;
    private String name;
    private String officeAddress;

    public Candidate() {
        this.name = name;
        this.officeAddress = officeAddress;
       // this.partyAffiliation = partyAffiliation;
    }


    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //create constructor method

    public Candidate(String name, String officeAddress){// Enum partyAffiliation) - why tf does this enum NOT WORK??)
        this.name = name;
        this.officeAddress = officeAddress;
    }
//instances of the class candidate
    public static void main(String[]args){
        Candidate Bruce = new Candidate( "Bruce Chang", "34 Woolworth Road");
        Candidate Lora = new Candidate("Lora Smith", "7 Freemans Quay");
        Candidate Cameron = new Candidate("Cameron MacDonald", "2 New Street");
    }
}


//politicalaffliation as an enum maybe??
