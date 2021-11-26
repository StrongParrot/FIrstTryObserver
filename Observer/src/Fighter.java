public class Fighter extends Weapon {


    private static int nextNum=1;
    private int num;
    private String model;

    public Fighter(String model){
        this.model=model;
        num=nextNum++;
    }

    @Override
    public void launch() {
        if (!isArmed)
            return;
        System.out.println("истребитель номер "+num+" модели "+model+" поднят по тревоге");
    }
}
