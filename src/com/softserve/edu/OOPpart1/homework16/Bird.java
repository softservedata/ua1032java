package com.softserve.edu.OOPpart1.homework16;

public abstract class Bird {


    private boolean layEggs;
    private boolean isPredator;
    private String feather;
    private String gender;



    public abstract String fly();

    public void setAttributes(boolean layEggs, boolean isPredator, String feather){
        this.layEggs = layEggs;
        if(layEggs == false){
            gender = "Male";
        }else{
            gender = "Female";
        }
        this.isPredator = isPredator;
        this.feather = feather;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public String getFeather() {
        return feather;
    }

    public String getGender() {
        return gender;
    }
}
