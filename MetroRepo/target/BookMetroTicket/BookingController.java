import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

package BookMetroTicket;


@RestController
@RequestMapping("/booking")
public class BookingController {

    // Sample endpoint to book a metro ticket
    @PostMapping("/book")
    public ResponseEntity<String> bookTicket(@RequestBody BookingRequest request) {
        // Sample logic: pretend to book a ticket
        String confirmation = "Ticket booked for " + request.getPassengerName() +
                              " from " + request.getSource() +
                              " to " + request.getDestination();
        return new ResponseEntity<>(confirmation, HttpStatus.OK);
    }

    // Sample endpoint to get booking info
    @GetMapping("/{id}")
    public ResponseEntity<String> getBooking(@PathVariable("id") Long bookingId) {
        // Sample logic: pretend to fetch booking info
        String info = "Booking info for ID: " + bookingId;
        return new ResponseEntity<>(info, HttpStatus.OK);
    }
}

// Sample DTO for booking request
class BookingRequest {
    private String passengerName;
    private String source;
    private String destination;

    // Getters and setters
    public String getPassengerName() { return passengerName; }
    public void setPassengerName(String passengerName) { this.passengerName = passengerName; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }
}