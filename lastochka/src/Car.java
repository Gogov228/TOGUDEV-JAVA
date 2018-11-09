import java.util.logging.Logger;

public class Car {

    private String Mark;
    private int Year;
    private String Color;
    private int MaxSpeed;
    private static Logger log = Logger.getLogger(Car.class.getName());

    public Car(String Mark,int Year, String Color, int MaxSpeed){
        this.Mark=Mark;
        this.Year=Year;
        this.Color=Color;
        this.MaxSpeed=MaxSpeed;
        log.info("Конструктор Car");
    }

    public String getMark() {
        return Mark;
    }

    public int getYear() {
        return Year;
    }

    public String getColor() {
        return Color;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public void MoveForward(){
        System.out.println("Move Forward");
    }

    public void MoveBack(){
        System.out.println("Move Back");
    }
    public void MoveLeft(){
        System.out.println("Move Left");
    }
    public void MoveRight(){
        System.out.println("Move Right");
    }
    public void beep(){
        System.out.println("Beep Beep");
    }

    public void info() {
        System.out.println(getMark() + " " + getYear() + " " + getColor() + " " + getMaxSpeed()+" ");
    }

    public boolean equals(Car car)
    {
        if(car == this)
            return true;
        if(car == null){
            return false;
        }
        /* Удостоверимся, что ссылки имеют тот же самый тип */
        if(!(getClass() == car.getClass())){
            return false;
        }
        else
        {
            if(car.Mark == this.Mark && car.Year == this.Year &&
                    car.Color == this.Color && car.MaxSpeed == this.MaxSpeed)
                return true;
            else
                return false;
        }
    }
}
