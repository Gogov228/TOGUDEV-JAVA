import java.util.logging.Logger;

public class Autobus extends Car_Driver {
    private int people_max;
    private int max_bagage_kg;
    private int people=0;
    private int bagage=0;
    private static Logger log = Logger.getLogger(Autobus.class.getName());

    public Autobus(String Mark, int Year, String Color, int MaxSpeed, String driver_name, int driver_age,int people_max,int max_bagage_kg) {
        super(Mark, Year, Color, MaxSpeed, driver_name, driver_age);
        this.people_max=people_max;
        this.max_bagage_kg=max_bagage_kg;
        log.info("Конструктор Autobus");
    }

    public void LoadPeople(int pep){
        if(people==people_max) {
            System.out.println("Количество людей максимально!");
            return;
        }
        if (people_max<=(pep+people)) {
            System.out.println("Возможно загрузить только "+ (people_max-people)+" людей");
            return;
        }
        people+=pep;
        return;
    }

    public void UnloadPeaple(int pep){
        people-=pep;
        return;
    }
    public void LoadBagage(int bag){
        if(bagage==max_bagage_kg) {
            System.out.println("Количество багажа максимально!");
            return;
        }
        if (max_bagage_kg<=(bag+bagage)) {
            System.out.println("Возможно загрузить только "+ (max_bagage_kg-bagage)+" кг багажа");
            return;
        }
        bagage+=bag;
    }

    public void UnloadBagage(int bag){
        bagage-=bag;
    }

    public int getPeople_max() {
        return people_max;
    }

    public int getMax_bagage_kg() {
        return max_bagage_kg;
    }

    public int getPeople() {
        return people;
    }

    public int getBagage() {
        return bagage;
    }

    @Override
    public void info() {
        super.info();
        System.out.println(people_max+" "+max_bagage_kg);
    }
}
