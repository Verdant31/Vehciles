public class Motorcycle extends Vehicle implements Consume{

    @Override
    public void calcularConsumo() {
        consume = kmTraveled / tankSize;
    }

    
}