import java.util.ArrayList;

public class AirDefenseControlRoom {
     ArrayList<Weapon> primary= new ArrayList<>();

    public void addWeapon(Weapon weapon){
        primary.add(weapon);
    }

    public void removeWeapon(Weapon weapon){
        primary.remove(weapon);
    }

    public void ALARM(){
        for (Weapon aim:
             primary) {
            aim.launch();

        }

    }
}
