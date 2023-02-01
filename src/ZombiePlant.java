public class ZombiePlant {
    //properties
    private int potency;
    private int treatments;
    private boolean dangerous;

    //constructor
    public ZombiePlant(int p, int t){
        potency = p;
        treatments = t;
        dangerous = (treatments > 0);
    }
    //behavior
    public int treatmentsNeeded(){
        return treatments;
    }
    public void treat(int n){
        if (n<=potency && n>0 && treatments != 0){
            treatments--;
        } else if (n>potency && n>0) {
            treatments++;
        }
        if (treatments == 0)
            dangerous=false;
    }
    public boolean isDangerous(){
        return dangerous;
    }

    public int getPotencyRequired(){
        return potency;
    }

}
