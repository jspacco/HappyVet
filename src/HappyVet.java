import java.util.Queue;
import java.util.LinkedList;

public class HappyVet
{
    private Queue<Appointment> regularQueue = new LinkedList<Appointment>();
    private Queue<Appointment> emergencyQueue = new LinkedList<Appointment>();

    public void addAppointment(Appointment appointment)
    {
        if (appointment.getVisitType() == VisitType.REGULAR)
        {
            regularQueue.add(appointment);
        }
        else
        {
            emergencyQueue.add(appointment);
        }
    }

    public boolean hasMoreAppointments()
    {
        return !regularQueue.isEmpty() || !emergencyQueue.isEmpty();
    }

    public Appointment getNextAppointment()
    {
        if (emergencyQueue.size() > 0) {
            return emergencyQueue.remove();
        }
        else if (regularQueue.size() > 0)
        {
            return regularQueue.remove();
        }
        else
        {
            return null;
        }
    }
}