import java.awt.*;

public class Got2 implements Runnable {

    private final Turtle Got;
    public Got2(){
        this.Got = new Turtle();
        Got.fillColor(Color.BLUE);
        Got.up();
        Got.speed(0.1);
        Got.setPosition(-200,0);
        Got.down();
    }



    @Override
    public void run() {

        for (int i=0; i<360 ;i++){
            Got.forward(1);
            Got.left(1);
        }

    }
}
