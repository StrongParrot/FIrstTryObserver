public abstract class Weapon {

    protected boolean isArmed;


    public void putOnAlert() {
        this.isArmed=true;
    }


    public void disarm() {
        this.isArmed=false;
    }

    public abstract void launch();
}
