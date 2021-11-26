import java.util.ArrayList;

public class AirDefenseControlRoom {
    ArrayList<Weapon> primary= new ArrayList<Weapon>();

    public void addWeapon(Weapon aim){
        primary.add(aim);
    }

    public void removeWeapon(Weapon aim){
        primary.remove(aim);
    }

    public void ALARM(){

    }
}
