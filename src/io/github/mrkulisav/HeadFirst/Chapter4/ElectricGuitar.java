package io.github.mrkulisav.HeadFirst.Chapter4;

public class ElectricGuitar {
    private String brand;
    private int numOfPickups;
    private boolean rockStarUsesIt;
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String aBrand) {
        brand = aBrand;
    }
    
    public int getNumOfPickups() {
        return numOfPickups;
    }
    
    public void setNumOfPickups(int num) {
        numOfPickups = num;
    }
    
    public boolean getRockStarUsesIt() {
        return rockStarUsesIt;
    }
    
    public void setRockStarUsesIt(boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
    }
}