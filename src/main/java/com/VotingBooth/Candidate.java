package com.VotingBooth;

public class Candidate {
    private String name;
    private String officeAddress;
    private enum partyAffiliation{
        LABOUR,
        CONSERVATIVE,
        LIBDEM,
        GREEN,
        SNP,
        PIRATE,
        MONSTERRAVINGLOONEY,
        MILITANTELVIS
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
}

//politicalaffliation as an enum maybe??
