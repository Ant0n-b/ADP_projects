public class HoFa {
    private RooBooSys rooBooSys;
    private ResSys resSys;
    private EveManSys eveManSys;
    private CleSer cleSer;

    public HoFa() {
        this.rooBooSys = new RooBooSys();
        this.resSys = new ResSys();
        this.eveManSys = new EveManSys();
        this.cleSer = new CleSer();
    }

    public void bookRoomWithExtras(String rooTyp, String fooIte) {
        if (rooBooSys.cheAvai(rooTyp)) {
            rooBooSys.booRoo(rooTyp);
            resSys.ordFoo(fooIte);
            cleSer.schCle(rooTyp);
            System.out.println("Room booked with food and cleaning services.");
        } else {
            System.out.println("Room is not available.");
        }
    }

    public void orgEve(String halNam, String equ, String rooTyp) {
        eveManSys.booEveHal(halNam);
        eveManSys.ordEqu(equ);
        rooBooSys.booRoo(rooTyp);
        System.out.println("Event organized with hall, equipment, and room booking.");
    }

    public void booResTabWitTax(int tabNum) {
        resSys.booTab(tabNum);
        System.out.println("Taxi service has been notified for restaurant table booking.");
    }

    public void canAll(String rooTyp, int tabNum) {
        rooBooSys.canBoo(rooTyp);
        resSys.canTabBoo(tabNum);
        System.out.println("All bookings canceled.");
    }
}
