public class Main {
    public static void main(String[] args) {

        AirDefenseControlRoom bunker=new AirDefenseControlRoom();


        AntiAirGun alfa=new AntiAirGun(15);
        AntiAirGun bravo=new AntiAirGun(15);
        AntiAirGun charlie=new AntiAirGun(20);

        Fighter delta=new Fighter("spitfire");
        Fighter echo=new Fighter("spitfire");
        Fighter foxtrot=new Fighter("spitfire");

        Nuke golf=new Nuke();
        Nuke hotel=new Nuke();

        Prapor india=new Prapor();
        Prapor juliett=new Prapor();
        Prapor kilo=new Prapor();

        bunker.addWeapon(alfa);
        alfa.putOnAlert();

        bunker.addWeapon(bravo);
        bravo.disarm();

        bunker.addWeapon(charlie);
        charlie.putOnAlert();

        bunker.addWeapon(delta);
        delta.putOnAlert();

        bunker.addWeapon(echo);
        echo.putOnAlert();
        bunker.removeWeapon(echo);

        bunker.addWeapon(foxtrot);
        foxtrot.putOnAlert();

        bunker.addWeapon(golf);
        golf.putOnAlert();

        bunker.addWeapon(hotel);
        hotel.putOnAlert();

        bunker.addWeapon(india);
        india.putOnAlert();

        bunker.addWeapon(juliett);
        juliett.putOnAlert();

        bunker.addWeapon(kilo);
        kilo.putOnAlert();


        bunker.ALARM();

    }
}
