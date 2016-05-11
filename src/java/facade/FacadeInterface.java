
package facade;


import dto.FlightDTO;
import dto.FlightInstance;
import dto.Reservation;
import dto.User;
import java.util.Calendar;
import java.util.List;


public interface FacadeInterface {
    
    public List<FlightInstance> getFlightInstance(String from, String to, Calendar date, int numberOfSeats);
    public FlightDTO getFlightById(String flightId);
    public void reserveFlight(Reservation reservation);
    public User getUserByEmail(String email);
    public List<Reservation> getAllReservations();
}
