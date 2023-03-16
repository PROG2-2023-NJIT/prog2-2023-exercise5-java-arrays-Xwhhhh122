package prog2.exercise5.flight.booking.system;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;
public class FlightBooking {
    /*enum TripSource {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS;
    }*/

    private String[] ticketNumber;
    private int totalTickets;
    private String[] passengerFullName;

    private TripSource tripSource;
    private String FlightCompany;
    private TripDestination tripDestination;
    private String TripDestination;
    private LocalDate DepartureDate;
    private LocalDate ReturnDate;
    private int TotalPassengers;
    private double TotalTicketPrice;
    private int ChildPassengers;
    private int AdultPassengers;
    private BookingClass bookingClass;
    private TripType tripType;
    private String SourceAirport;
    private SourceAirport sourceAirport;
    private String DestinationAirport;
    private double DepartingTicketPrice;
    private double ReturnTicketPrice;
    private  String[] passengerGender;
    private int[] passengerAge;
    private Scanner scanner;




    /*public FlightBooking(String[] aNull, LocalDate depart, LocalDate returnDate, int i, int i1) {
        this.passengerFullName = aNull;
        this.DepartureDate = depart;
        this.ReturnDate = returnDate;
        this.ChildPassengers = i;
        this.AdultPassengers = i1;
    }*/

    public FlightBooking(int totalTickets) {
        this.totalTickets = totalTickets;
        this.passengerFullName = new String[totalTickets];
        this.passengerGender = new String[totalTickets];
        this.passengerAge = new int[totalTickets];
        this.ticketNumber = new String[totalTickets];
    }
    String [] fullName = {"Matt Jive", "Sally Fields", "Posh Quattro"};
    String [] gender = {"Male", "Female", "Other"};
    int [] age = {43, 32, 21};
    String [] seatsBooked = {"M10EC-Booked","N1EC-Booked","N2EC-Booked"};



    String sdepart = "2023-03-04";
    LocalDate departureDate = LocalDate.parse(sdepart);

    String sreturn = "2023-03-05";
    LocalDate returnDate = LocalDate.parse(sreturn);

    int size = 3;
    /*public FlightBooking(int size) {

    }*/


    public void setTripDate(int tripDate) {


        /*long i = departureDate.toEpochDay() - returnDate.toEpochDay();
        if (i >= 0 && i < 1) {
            LocalDate returnDate = departureDate.plusDays(2);
        } else if (i >= 1 && i < 2) {
            LocalDate returnDate = departureDate.plusDays(1);
        }*/
    }


   

    /*public ArrayList<String> getFlightSeats() {
        return flightSeats;
    }*/


    enum BookingClass {
        FIRST, BUSINESS, ECONOMY
    }
    //private BookingClassOptions bookingClass;

    public void setBookingClass(String bookingclass) {
        switch (bookingclass) {
            case "1":
                this.bookingClass = bookingClass.FIRST;
                break;
            case "2":
                this.bookingClass = bookingClass.BUSINESS;
                break;
            case "3":
                this.bookingClass = bookingClass.ECONOMY;
                break;
            default:

        }
    }


    enum TripType {
        ONE_WAY, RETURN
    }


    //private TripTypeOption tripType;

    public void setTripType(String triptype) {
        switch (triptype) {
            case "1":
                this.tripType = tripType.ONE_WAY;
                break;
            case "2":
                this.tripType = tripType.RETURN;
                break;
            default:

        }
    }


    enum TripSource {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS;
    }
    //private TripSourceOptions tripSource;

    public TripSource getTripSource() {

        return tripSource;
    }

    public void setTripSource(String source) {
        switch (source) {
            case "1":
                this.tripSource = tripSource.NANJING;
                break;
            case "2":
                this.tripSource = tripSource.BEIJING;
                break;
            case "3":
                this.tripSource = tripSource.SHANGHAI;
                break;
            case "4":
                this.tripSource = tripSource.OULU;
                break;
            case "5":
                this.tripSource = tripSource.HELSINKI;
                break;
            case "6":
                this.tripSource = tripSource.PARIS;
                break;
            default:
        }
    }

    enum TripDestination {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS;
    }

    //private TripDestinationOptions tripDestination;
    public String getTripDestination() {

        return TripDestination;
    }

    public void setTripDestination(String tripdestination, String tripdestination2) {

        switch (tripdestination) {
            case "1":
                this.tripDestination = tripDestination.NANJING;
                break;
            case "2":
                this.tripDestination = tripDestination.BEIJING;
                break;
            case "3":
                this.tripDestination = tripDestination.SHANGHAI;
                break;
            case "4":
                this.tripDestination = tripDestination.OULU;
                break;
            case "5":
                this.tripDestination = tripDestination.HELSINKI;
                break;
            case "6":
                this.tripDestination = tripDestination.PARIS;
                break;
            default:
        }
    }

    public String getSourceAirport() {

        return SourceAirport;
    }


    enum SourceAirport {
        NANJING_LUKOU_INTERNATION_AIRPORT
    }


    public void setSourceAirport(String sourceAirport) {
        //sourceAirport = String.valueOf(tripSource);
        // "Nanjing Lukou International Airport";
        if (tripSource == tripSource.NANJING) {
            this.SourceAirport = "Nanjing Lukou International Airport";
        }
        if (tripSource == tripSource.BEIJING) {
            this.SourceAirport = "Beijing Capital International Airport";
        }
        if (tripSource == tripSource.SHANGHAI) {
            this.SourceAirport = "Shanghai Pudong International Airport";
        }
        if (tripSource == tripSource.OULU) {
            this.SourceAirport = "Oulu Airport";
        }
        if (tripSource == tripSource.HELSINKI) {
            this.SourceAirport = "Helsinki Airport";
        }
        if (tripSource == tripSource.PARIS) {
            this.SourceAirport = " Paris Charles de Gaulle Airport";
        }
    }




    /*private ArrayList<String> flightSeats;

    public void setFlightSeats() {
    //ArrayList<String>flightSeats = new ArrayList<>();
        flightSeats = new ArrayList<String>(410);
        for (int i = 1; i <= 100; i++) {
            if (i <= 32) {
                this.flightSeats.add(i + "F-Booked");
            } else {
                this.flightSeats.add(i + "F");
            }
        }
        for (int i = 101; i <= 150; i++) {
            if (i <= 118) {
                this.flightSeats.add(i + "B-Booked");
            } else {
                this.flightSeats.add(i + "B");
            }
        }
        for (char c = 'A'; c <= 'Z'; c++) {

            for (int i = 1; i <= 10; i++) {
                if (c < 'O' || (c == 'N' && i <= 2)) {
                    this.flightSeats.add(c + "" + i + "EC-Booked");
                } else {
                    this.flightSeats.add(c + "" + i + "EC");
                }

                }
            }
        for(int j=0,i=279; j<size; ++j, ++i){

            seatsBooked[j]=flightSeats.get(i);
        }
        }


    public String getFlightSeats(int index) {
        setFlightSeats();
        return this.flightSeats.get(index);
    }

    public void setFlightSeats(int index) {
        setFlightSeats();
        if (index < 0 || index >= flightSeats.size()) {
            System.out.println("Invalid seat index");
            return;
        }

        String seat = flightSeats.get(index);
        if (seat.endsWith("-Booked")) {
            System.out.println("Seat " + seat + " is already booked.");
            return;
        }

        // Book the seat by updating its status to "Booked"
        seat += "-Booked";
        flightSeats.set(index, seat);
        System.out.println("Seat " + seat + " has been booked.");
    }


    private void seatsBooked(int index) {
        String seat = flightSeats.get(index);
        if (seat.endsWith("Booked")) {
            System.out.println("This seat has been reserved. Please choose another seat.");
        } else if (seat.endsWith("F") && index < 32) {
            System.out.println("The first 32 seats in first class have been reserved. Please select seats 33F and beyond.");
        } else if (seat.endsWith("B") && index < 118) {
            System.out.println("The first 18 seats in business class have been reserved. Please select seats 119B and beyond.");
        } else if (seat.endsWith("EC") && (seat.charAt(0) < 'N' || (seat.charAt(0) == 'M' && seat.charAt(1) <= '9'))) {
            System.out.println("The first 10 seats in the first 26 rows of economy class have been reserved. Please select seats M10EC and beyond.");
        } else {
            flightSeats.set(index, seat + "Booked");
            System.out.println("seat" + seat + "The reservation is successful.");
        }
    }*/

    public String getDestinationAirport() {

        return DestinationAirport;
    }

    public void setDestinationAirport(String destinationAirport, String destinationAirport1) {
        DestinationAirport = String.valueOf(tripDestination);
        if (tripDestination == tripDestination.NANJING) {
            this.DestinationAirport = "Nanjing Lukou International Airport";
        }
        if (tripDestination == tripDestination.SHANGHAI) {
            this.DestinationAirport = "Beijing Capital International Airport";
        }
        if (tripDestination == tripDestination.SHANGHAI) {
            this.DestinationAirport = "Shanghai Pudong International Airport";
        }
        if (tripDestination == tripDestination.OULU) {
            this.DestinationAirport = "Oulu Airport";
        }
        if (tripDestination == tripDestination.HELSINKI) {
            this.DestinationAirport = "Helsinki Airport";
        }
        if (tripDestination == tripDestination.PARIS) {
            this.DestinationAirport = " Paris Charles de Gaulle Airport";
        }
    }



    public  String getPassengerGender(int index){

        return passengerGender[index] ;
    }
    public void setPassengerGender(int index, String passengerGender){

        this.passengerGender = new String[]{"Male", "Female", "Other"};;
    }


    public int getPassengerAge(int index){

        return  passengerAge[index];
    }

    public void setPassengerAge(int index ,int passengerAge){
      this.passengerAge =  new int[]{43, 32, 21};

    }

    public String getTicketNumber(int index) {
        setTicketNumber(1);
        return ticketNumber[index];
    }

    public void setPassengerFullName(int index ,String passengerFullName) {

        this.passengerFullName = new String[]{"Matt Jive", "Sally Fields", "Posh Quattro"};;
    }
    public String getPassengerFullName(int index) {

        return passengerFullName[index];
    }


    public String getFlightCompany() {

        return FlightCompany;
    }


    public LocalDate getDepartureDate() {

        return DepartureDate;
    }

    public LocalDate getReturnDate() {

        return ReturnDate;
    }

    public int getTotalPassengers() {

        return TotalPassengers;
    }

    public double getTotalTicketPrice() {

        return TotalTicketPrice;
    }

    public double getDepartingTicketPrice() {

        return DepartingTicketPrice;
    }

    public double getReturnTicketPrice() {

        return ReturnTicketPrice;
    }





    public void setFlightCompany(String FlightCompany) {

        this.FlightCompany = FlightCompany;
    }


    public void setDepartureDate(LocalDate departureDate) {
        //this.DepartureDate = DepartureDate;
        String sdepart = "2023-03-04";
        this.DepartureDate = LocalDate.parse(sdepart);
    }

    public void setReturnDate(LocalDate returnDate) {
        // this.ReturnDate = ReturnDate;
        String sreturn = "2023-03-05";


        this.ReturnDate = DepartureDate.plusDays(2);

        
    }

    public void setTotalPassengers(int totalPassengers, int TotalPassengers) {

        this.TotalPassengers = ChildPassengers + AdultPassengers;
    }

    public void setTotalTicketPrice() {

        this.TotalTicketPrice = Math.abs(2* ((0*(300 + (0.15*300) + (0.1*300) + 250)) + (3*(300 + (0.15*300) + (0.1*300) + 250))));
    }

    public void setDepartingTicketPrice(int child, int adult) {

        this.DepartingTicketPrice = DepartingTicketPrice;
    }

    public void setReturnTicketPrice() {

        this.ReturnTicketPrice = ReturnTicketPrice;
    }


    

    Random random = new Random();

    public void setTicketNumber(int index) {
        String ticketNumber = null;
        switch (tripType) {
            case ONE_WAY:
                ticketNumber = "11";
                break;
            case RETURN:
                ticketNumber = "22";
                break;
        }
        switch (bookingClass) {
            case FIRST:
                ticketNumber = ticketNumber + "F";
                break;
            case BUSINESS:
                ticketNumber = ticketNumber + "B";
                break;
            case ECONOMY:
                ticketNumber = ticketNumber + "E";
                break;
        }
        for (int i = 0; i < 4; i++) {
            char f = (char) ((random.nextInt(26) + 65));
            ticketNumber = ticketNumber + f;
        }
        //this.TicketNumber = ticketNumber + "DOM";
        if (tripSource == tripSource.NANJING && tripDestination == tripDestination.BEIJING) {
            this.ticketNumber[index] = ticketNumber + "DOM";
        }
        if (tripSource == tripSource.BEIJING && tripDestination == tripDestination.NANJING) {
            this.ticketNumber[index] = ticketNumber + "DOM";
        }
        if (tripSource == tripSource.OULU && tripDestination == tripDestination.HELSINKI) {
            this.ticketNumber[index] = ticketNumber + "DOM";
        }
        if (tripSource == tripSource.HELSINKI && tripDestination == tripDestination.OULU) {
            this.ticketNumber[index] = ticketNumber + "DOM";
        }
        if (tripSource == tripSource.NANJING && tripDestination == tripDestination.OULU) {
            this.ticketNumber[index] = ticketNumber + "INT";
        }
        if (tripSource == tripSource.OULU && tripDestination == tripDestination.NANJING) {
            this.ticketNumber[index] = ticketNumber + "INT";
        }
        if (tripSource == tripSource.NANJING && tripDestination == tripDestination.HELSINKI) {
            this.ticketNumber[index] = ticketNumber + "INT";
        }
        if (tripSource == tripSource.HELSINKI && tripDestination == tripDestination.NANJING) {
            this.ticketNumber[index] = ticketNumber + "INT";
        }
        if (tripSource == tripSource.BEIJING && tripDestination == tripDestination.OULU) {
            this.ticketNumber[index] = ticketNumber + "INT";
        }
        if (tripSource == tripSource.OULU && tripDestination == tripDestination.BEIJING) {
            this.ticketNumber[index] = ticketNumber + "INT";
        }
        if (tripSource == tripSource.BEIJING && tripDestination == tripDestination.NANJING) {
            this.ticketNumber[index] = ticketNumber + "INT";
        }
        if (tripSource == tripSource.HELSINKI && tripDestination == tripDestination.BEIJING) {
            this.ticketNumber[index] = ticketNumber + "INT";
        }
    }


    private ConfirmationMessage confirmationMessage;

    enum ConfirmationMessage {
        CHANGE, SAVE
    }

    public void setConfirmationMessage(String confirmationmessage) {
        switch (confirmationmessage) {
            case "1":
                this.confirmationMessage = confirmationMessage.CHANGE;
                System.out.println("Thank you for booking your flight with " + FlightCompany + ". Following are the details \n" +
                        "of your booking and the trip: \n" +
                        "Ticket Number: " + ticketNumber + "\n" +
                        "Passenger Name: " + passengerFullName + "\n" +
                        "From TripSource to " + TripDestination + "\n" +
                        "Date of departure: " + DepartureDate + "\n" +
                        "Date of return: ReturnDate (Changed from old ReturnDate to new\n" +
                        ReturnDate + ")\n" +
                        "Total passengers: " + TotalPassengers + "\n" +
                        "Total ticket price in Euros: " + TotalTicketPrice + "\n" +
                        "IMPORTANT NOTICE: As per our policy, the return date was changed because it was \n" +
                        "less than two days apart from your departure date");
                break;
            case "2":
                this.confirmationMessage = confirmationMessage.SAVE;
                System.out.println("Thank you for booking your flight with " + FlightCompany + ".Following are the details \n" +
                        "of your booking and the trip: \n" +
                        "Ticket Number: " + ticketNumber + "\n" +
                        "Passenger Name: " + passengerFullName + "\n" +
                        "From TripSource to " + TripDestination + "\n" +
                        "Date of departure: " + DepartureDate + "\n" +
                        "Date of return: " + ReturnDate + "\n" +
                        "Total passengers: " + TotalPassengers + "\n" +
                        "Total ticket price in Euros: " + TotalTicketPrice + "\n");

                break;
        }


    }



    public void reserveTickets() {

        for (int i = 0; i < totalTickets; i++) {
            System.out.println("Enter details for passenger " + (i + 1));
            System.out.print("Full Name: ");
            setPassengerFullName(i, scanner.nextLine());

            System.out.print("Gender: ");
            setPassengerGender(i, scanner.nextLine());

            System.out.print("Age: ");
            setPassengerAge(i, scanner.nextInt());
            scanner.nextLine();

            setTicketNumber(i);
        }


    }

    public void displayTripDetails() {
        System.out.println("Thank you for booking your flights with FLIGHT_COMPANY.");
        System.out.println("You reserved a total of " + totalTickets + " tickets.");

        for (int i = 0; i < totalTickets; i++) {
            System.out.println("Here are the trip details for Passenger No." + (i + 1));
            System.out.println("Passenger's Ticket Number: " + getTicketNumber(i));
            System.out.println("Passenger's Full Name: " + getPassengerFullName(i));
            System.out.println("Passenger's Age: " + getPassengerAge(i));
            System.out.println("Passenger's Gender: " + getPassengerGender(i));
            System.out.println("From: " + tripSource);
            System.out.println("To" + tripDestination);
            System.out.println("The flight departs on:" + departureDate);
            System.out.println("And the return flight is on:" + returnDate);
































}
    }
}