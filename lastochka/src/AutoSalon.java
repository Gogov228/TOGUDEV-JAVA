public class AutoSalon {
    public static void main(String[] args) {

        Car Lastochka=new Car("Lada Zhiguli", 1976,"Vishnevaya",228);
        Car Hynday=new Car("Solaris",2018,"Earth brown", 240);
        Car BUXANKA=new Car("Lada BUXANKA",2118,"White",320);
        Car BomzheMers=new Car("mercedes benz e", 2005,"black",90);
        Car BUXANKA_New=new Car("Lada BUXANKA",2118,"White",320);
        Car_Driver BUXANKA_TOP=new Car_Driver("Lada BUXANKA",2118,"White",320,"Иваныч",45);
        Autobus Shkolni=new Autobus("Для школьников",2118,"White",120,"Иваныч",45,80,450);
        SportCar Lamba=new SportCar("ЛАМБАРДЖИНИ ДИАБЛО", 2015,"Orange",480,"Sanya",22,672, 3.5f);

        Lastochka.info();
        Lastochka.MoveForward();
        Hynday.info();
        Hynday.MoveLeft();
        BUXANKA.info();
        BUXANKA.beep();
        BomzheMers.info();
        BomzheMers.MoveBack();
        BUXANKA_TOP.info();
        BUXANKA_TOP.beep();
        BUXANKA_TOP.MoveForward();
        Shkolni.info();
        Shkolni.LoadBagage(228);
        Shkolni.LoadBagage(432);
        Shkolni.LoadPeople(34);
        Shkolni.LoadPeople(55);
        Lamba.info();
        Lamba.MoveForward();
        Lamba.MoveBack();
        BUXANKA_TOP.info();

        if(BUXANKA.equals(BUXANKA_New))
            System.out.println("Эти ласточки одинаковые");
        else
            System.out.println("Ласточки совершенно разные");
    }
}
