public class Nuke extends Weapon {


    private static int nextNum=1;
    private int num;

    public Nuke(){
        num=nextNum++;
    }

    @Override
    public void launch() {
        if (!isArmed)
            return;
        System.out.println("ядерная орудие номер "+num+" приведено в боеготовность по тревоге");
    }
}
