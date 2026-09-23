package practice5;

public class Plane extends Transport {
    public Plane (){
        super(1000,2000);
    }
    @Override
    public void start(){
        System.out.println("Plane fly");
    }
}
