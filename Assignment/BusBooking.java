public class BusBooking {
    public static void main(String[] args) {
        int availableSeats = 2;
        int requestedSeats = 5;

        try {
            if (requestedSeats > availableSeats) {
                throw new Exception("Seats not available.");
            }

            System.out.println("Booking Confirmed");

        } catch (Exception e) {
            System.out.println("Booking Failed: " + e.getMessage());
        }
    }
}