package practice5;

public class Ship extends Transport {
public Ship(){
    super(3000,5000);
}
@Override
    public void start(){
    System.out.println("Ship swim");
}
}
