import java.util.Date;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  
  public static void main(String[] args) {
      Appointment a1 = new Appointment("A snake named John", VisitType.REGULAR, "Check up", new Date());

      Appointment a2 = new Appointment("A dog named Dog", VisitType.EMERGENCY, "spleen exploded", new Date());

      System.out.println(a1);

      System.out.println(a2);
    
  }
}