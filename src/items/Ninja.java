package items;
public class Ninja
{
    private String name;

    public Ninja(String name){
        this.name = name;
    }

    public String tostring() {
        // does this override?
        return "ninja name is " + name;
    }

    public static void main(String[] args)
    {
        Ninja n = new Ninja("Green Ninja");
        System.out.println(n.toString());
    }
}