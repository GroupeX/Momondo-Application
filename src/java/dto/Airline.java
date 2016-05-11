
package dto;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Airline")
public class Airline {
    
    @Id
    private String name;
    @OneToMany(mappedBy = "airline")
    private List<FlightDTO> flights;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FlightDTO> getFlights() {
        return flights;
    }

    public void setFlights(List<FlightDTO> flights) {
        this.flights = flights;
    }

    @Override
    public String toString() {
        return "Airline{" + "name=" + name + ", flights=" + flights + '}';
    }
}
