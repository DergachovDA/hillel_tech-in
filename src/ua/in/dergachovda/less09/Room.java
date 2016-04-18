package ua.in.dergachovda.less09;

public class Room {

    private int students;
    private int places;

//    Room (int students, int places) {
//        this.students = students;
//        this.places = places;
//    }

    public static Room createRoom(int students, int places) {
        Room room = new Room();
        room.students = students;
        room.places = places;
        return room;
    }

    void addStudents() {
        if (places > students)
            students++;
        else
            handleNoSeats();
    }

    private void handleNoSeats() {
        System.out.println("No places left");
    }

}
