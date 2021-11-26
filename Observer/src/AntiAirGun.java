public class AntiAirGun extends Weapon{

    private int caliber;
    private static int nextNum=1;
    private int num;

    public AntiAirGun( int caliber){
        this.caliber=caliber;
        num=nextNum++;
    }

    @Override
    public void launch() {
        if (!isArmed)
            return;
        System.out.println("батарея номер "+num+" зенитных орудий калибром "+caliber+" приведена в боеготовность по тревоге");


    }
}
