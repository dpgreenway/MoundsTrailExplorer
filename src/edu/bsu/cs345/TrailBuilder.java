package edu.bsu.cs345;

import java.util.ArrayList;

public class TrailBuilder {

    private ArrayList<Trail> listOfTrails = new ArrayList<>();

    protected void buildTrails(){
        for (int i = 0; i < 6; i++){
            Trail trail = new Trail();
            trail.setTrailName("Trail " + (i+1));
            listOfTrails.add(trail);
        }
    }

    protected ArrayList<Trail> getListOfTrails(){
        return listOfTrails;
    }

    protected String getTrailInformation(int trailNumber){
        if(checkIfListOfTrailsIsEmpty()){
            buildTrails();
        }
        return listOfTrails.get(trailNumber - 1).getTrailName();
    }

    protected boolean checkIfListOfTrailsIsEmpty() {
        return listOfTrails.isEmpty();
    }
}
