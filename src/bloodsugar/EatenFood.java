package bloodsugar;

import java.util.Date;

public class EatenFood implements Comparable<EatenFood>
{
    private String foodName;
    private Date date;
    private int bloodSugar;

    public EatenFood(String foodName, int bloodSugar) 
    {
        // call another constructor
        // must be first line of Java code
        this(foodName, bloodSugar, new Date(System.currentTimeMillis()));
    }

    public EatenFood(String foodName, int bloodSugar, Date date) 
    {
        this.foodName = foodName;
        this.bloodSugar = bloodSugar;
        this.date = date;
    }

    public int compareTo(EatenFood other) {
        // I want to sort from biggest to smallest
        return other.date.compareTo(this.date);
    }

    public int getBloodSugar() {
        return this.bloodSugar;
    }

    public Date getDate() {
        return this.date;
    }

    public String getFoodName() {
        return this.foodName;
    }
    
}
