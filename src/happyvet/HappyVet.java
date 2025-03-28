package happyvet;
import java.util.Queue;
import java.util.LinkedList;

public class HappyVet
{
    // Two queues
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

    /**
     * An open question here is whether to return null or throw
     * an excpetion if there are no more appointments. We've chosen
     * to return null but it's a subjective descision.
     * 
     * @return Return the next appointment, or null if there
     * are not more appointments.
     */
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