package mjeks.athenkosi;

public class Timeout {
    private int totItems;
    public Timeout(int totItems) {
        this.totItems = totItems;
    }

    public int loop(){
        int x;
        for(x = 0; x < totItems; x++){
            System.out.println(x);
        }
        return x;
    }
}
