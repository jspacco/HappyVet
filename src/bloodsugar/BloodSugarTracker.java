package bloodsugar;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class BloodSugarTracker 
{
    private Map<String, List<FoodRecord>> foods;

    public BloodSugarTracker() 
    {
        foods = new HashMap<>();
    }

    public void addFood(FoodRecord food) 
    {
        String foodName = food.getFoodName();
        //if (!foods.containsKey(foodName)) foods.put(foodName, new LinkedList<>());
        foods.putIfAbsent(foodName, new LinkedList<>());
        List<FoodRecord> result = foods.get(foodName);
        result.add(food);
    }

    public void addFood(String foodName, int bloodSugar)
    {
        addFood(new FoodRecord(foodName, bloodSugar));
    }

    public double getAverage(String foodName)
    {
        if (!foods.containsKey(foodName))
        {
            throw new IllegalStateException("Food "+foodName+" not in the food tracker");
        }
        
        double total = 0;
        for (FoodRecord f : foods.get(foodName)) 
        {
            total += f.getBloodSugar();
        }
        return total / foods.get(foodName).size();
    }

    public Collection<FoodRecord> getMostRecent(String foodName, int n)
    {
        if (!foods.containsKey(foodName))
        {
            throw new IllegalArgumentException(foodName+" not found");
        }

        List<FoodRecord> result = foods.get(foodName);
        
        if (result.size() < n) return result;

        return result.subList(result.size() - n, result.size());
    }
}
