public class RoomBookSy {
    public void bookRoom(String roomType) {
        System.out.println("Room of type " + roomType + " booked.");
    }

    public void cancelBooking(String roomType) {
        System.out.println("Booking for " + roomType + " room canceled.");
    }

    public boolean checkAvailability(String roomType) {
        System.out.println("Checking availability for " + roomType + " room.");
        return true; 
    }
}