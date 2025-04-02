package bloodsugar;

import java.util.Date;

public class FoodRecord
{
    private String foodName;
    private Date date;
    private int bloodSugar;

    public FoodRecord(String foodName, int bloodSugar, Date date) 
    {
        this.foodName = foodName;
        this.bloodSugar = bloodSugar;
        this.date = date;
    }

    public FoodRecord(String foodName, int bloodSugar) 
    {
        // call another constructor
        // must be first line of Java code
        this(foodName, bloodSugar, new Date(System.currentTimeMillis()));
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
