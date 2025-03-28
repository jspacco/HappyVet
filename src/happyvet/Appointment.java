import java.util.Date;


public class Appointment {
    // name of client
    // type of visit (emergency or regular)
    // description of what neds to be done
    // date of visit

    private String name;

    private VisitType visitType;

    private String description;

    private Date date;

    public Appointment(String name, VisitType visitType, String description, Date date)
    {
        // set all the instance variables to the parameters
        this.name = name;
        this.visitType = visitType;
        this.description = description;
        this.date = date;
    }

    public String toString()
    {
        return String.format("Name: %s\nVisit Type: %s\nDescription: %s\nDate: %s\n", name, visitType, description, date);
    }

    // make get methods
    public String getName()
    {
        return name;
    }

    public VisitType getVisitType()
    {
        return visitType;
    }

    public String getDescription()
    {
        return description;
    }

    public Date getDate()
    {
        return date;
    }

}