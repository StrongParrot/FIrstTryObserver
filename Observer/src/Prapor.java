public class Prapor extends Weapon {

    private static int nextNum=1;
    private int num;

    public Prapor(){
        num=nextNum++;
    }

    @Override
    public void launch() {
        if (!isArmed)
            return;
        System.out.println("со склада было похищено "+3+" литра спирта");

    }
}
