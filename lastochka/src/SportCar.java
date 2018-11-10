import java.util.logging.Logger;

public class SportCar extends Car_Driver {

    private int horsepower;
    private float hundredInSec;
    private static Logger log = Logger.getLogger(SportCar.class.getName());


    public SportCar(String Mark, int Year, String Color, int MaxSpeed, String driver_name, int driver_age,int horsepower, float hundredInSec) {
        super(Mark, Year, Color, MaxSpeed, driver_name, driver_age);
        this.horsepower=horsepower;
        this.hundredInSec=hundredInSec;
        log.info("Конструктор SportCar");
    }

    @Override
    public final void MoveForward(){
        System.out.println("вввввввВВВИИИууууууууууу...");
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void setHundredInSec(float hundredInSec) {
        this.hundredInSec = hundredInSec;
    }


    @Override
    public final void MoveBack(){
        System.out.println("Never move back...");
    }

    @Override
    public final void info() {
        super.info();
        System.out.println(horsepower+" "+hundredInSec+" ");
    }

    public int getHorsepower() {
        return horsepower;
    }

    public float getHundredInSec() {
        return hundredInSec;
    }

    @Override
    public final void MoveLeft() {
        super.MoveLeft();
    }

    @Override
    public final void MoveRight() {
        super.MoveRight();
    }

    @Override
    public final void beep() {
        super.beep();
    }
}
