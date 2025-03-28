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
    private Map<String, SortedSet<EatenFood>> foods;

    public BloodSugarTracker() 
    {
        foods = new HashMap<>();
    }

    public void addFood(EatenFood food) 
    {
        String foodName = food.getFoodName();
        foods.putIfAbsent(foodName, new TreeSet<>());
        Set<EatenFood> set = foods.get(foodName);
        set.add(food);
    }

    public void addFood(String foodName, int bloodSugar)
    {
        addFood(new EatenFood(foodName, bloodSugar));
    }

    public double getAverage(String foodName)
    {
        if (!foods.containsKey(foodName))
        {
            throw new IllegalStateException("Food "+foodName+" not in the food tracker");
        }
        
        double total = 0;
        for (EatenFood f : foods.get(foodName)) 
        {
            total += f.getBloodSugar();
        }
        return total / foods.get(foodName).size();
    }

    public Collection<EatenFood> getMostRecent(String foodName, int n)
    {
        if (!foods.containsKey(foodName))
        {
            throw new IllegalArgumentException(foodName+" not found");
        }
        
        Iterator<EatenFood> it = foods.get(foodName).iterator();
        List<EatenFood> result = new LinkedList<>();
        for (int i=0; i<n && it.hasNext(); i++) {
            result.add(it.next());
        }
        return result;
    }
}
