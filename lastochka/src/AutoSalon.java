public class AutoSalon {
    public static void main(String[] args) {

        Car Lastochka=new Car("Lada Zhiguli", 1976,"Vishnevaya",228);
        Car Hynday=new Car("Solaris",2018,"Earth brown", 240);
        Car BUXANKA=new Car("Lada BUXANKA",2118,"White",320);
        Car BomzheMers=new Car("mercedes benz e", 2005,"black",90);

        System.out.println(Lastochka.getMark()+" "+Lastochka.getYear()+" "+Lastochka.getColor()+" "+Lastochka.getMaxSpeed());
        Lastochka.MoveForward();
        System.out.println(Hynday.getMark()+" "+Hynday.getYear()+" "+Hynday.getColor()+" "+Hynday.getMaxSpeed());
        Hynday.MoveLeft();
        System.out.println(BUXANKA.getMark()+" "+BUXANKA.getYear()+" "+BUXANKA.getColor()+" "+BUXANKA.getMaxSpeed());
        BUXANKA.beep();
        System.out.println(BomzheMers.getMark()+" "+BomzheMers.getYear()+" "+BomzheMers.getColor()+" "+BomzheMers.getMaxSpeed());
        BomzheMers.MoveBack();
    }
}
