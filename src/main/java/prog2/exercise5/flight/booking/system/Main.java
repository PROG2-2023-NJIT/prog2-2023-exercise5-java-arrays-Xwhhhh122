package prog2.exercise5.flight.booking.system;

/**
 * Hello world!
 *
 */
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

       
        int size = 3;
        FlightBooking fb = new FlightBooking(size);

        String [] fullName = {"Matt Jive", "Sally Fields", "Posh Quattro"};
        String [] gender = {"Male", "Female", "Other"};
        int [] age = {43, 32, 21};

        for(int i=0; i<size; ++i){
            fb.setPassengerFullName(i, fullName[i]);
            fb.setPassengerGender(i, gender[i]);
            fb.setPassengerAge(i, age[i]);
        }

     for(int j=0; j<size; ++j){
      if((fb.getPassengerFullName(j) == fullName[j]) && (fb.getPassengerGender(j) == gender[j])
              && fb.getPassengerAge(j) == age[j]){
       fb.setPassengerFullName(1,"Matt Jive");
      }
      else {
       fb.setPassengerFullName(1,"Sally Fields");
      }
     }
        for(int j=0; j<size; ++j){
            fb.setTicketNumber(j);
        }


     fb.setTotalPassengers(1,3);

        fb.setPassengerFullName(1,"John Doe");
        //fb.setTicketNumber(1);
        //fb = new FlightBooking(null, null, null, 0, 0);
        fb.setTripSource("2") ;
        fb.setTripDestination("OULU"," Helsinki");
        fb.setFlightCompany("Flights-of-Fancy");


        


     }
}