import java.util.logging.Logger;

public class Car_Driver extends Car {
    String driver_name;
    int driver_age;
    private static Logger log = Logger.getLogger(Car_Driver.class.getName());

    public Car_Driver(String Mark, int Year, String Color, int MaxSpeed,String driver_name,int driver_age ) {
        super(Mark, Year, Color, MaxSpeed);
        this.driver_name=driver_name;
        this.driver_age=driver_age;
        log.info("Конструктор Car_Driver");
    }

    @Override
    public void MoveBack() {
    if (driver_age>=18)
        System.out.println("Автомобиль может ездить с этим водителем");
    else
        System.out.println("Вызвать ДПСника, чтобы поймали малолетку");
    }

    @Override
    public void MoveForward() {
    if (driver_age>=18)
        System.out.println("Автомобиль может ездить с этим водителем");
    else
        System.out.println("Вызвать ДПСника, чтобы поймали малолетку");
    }

    @Override
    public void info() {
        super.info();
        System.out.println(driver_name+" "+driver_age+" ");
    }
}
