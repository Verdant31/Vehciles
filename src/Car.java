public class Car extends Vehicle implements Consume {
    //A quantidade de pessoas dentro do carro intefere diretamente no consumo do carro por causa do peso extra.
    public int people;

    public int getPeople() {
        return this.people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    @Override
    public void calcularConsumo() {
        if(people == 1) {
            consume = (kmTraveled / tankSize);
        }
        consume = (kmTraveled / tankSize) - ((kmTraveled / tankSize) * (people / 10));
    }
    
}
