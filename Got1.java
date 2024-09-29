import java.awt.*;

public class Got1 implements Runnable {

    private final Turtle Got;
    public Got1(){
        this.Got = new Turtle();
        Got.fillColor(Color.GREEN);
        Got.up();
        Got.setPosition(200,0);
        Got.down();
    }



    @Override
    public void run() {

        for (int i=0; i<3 ;i++){
            Got.forward(100);
            Got.left(120);
        }
    }
}
