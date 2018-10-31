public class Car {

    private String Mark;
    private int Year;
    private String Color;
    private int MaxSpeed;

    public Car(String Mark,int Year, String Color, int MaxSpeed){
        this.Mark=Mark;
        this.Year=Year;
        this.Color=Color;
        this.MaxSpeed=MaxSpeed;
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
}
