import attractions.Attraction;

import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(){
        stalls = new ArrayList<Stall>();
        attractions = new ArrayList<Attraction>();
    }

    public void addAttraction(Attraction attraction){
        this.attractions.add(attraction);
    };

    public void addStall(Stall stall){
        this.stalls.add(stall);
    }

    public int attractionCount(){
        return  this.attractions.size();
    }

    public int stallCount(){
        return  this.stalls.size();
    }

    public ArrayList<IReviewed> getReviewed() {
        ArrayList<IReviewed> reviewed = new ArrayList<IReviewed>();
        reviewed.add(this.attractions);
        reviewed.add(this.stalls);
        return reviewed;
    }

}
