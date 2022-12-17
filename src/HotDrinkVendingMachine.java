public class HotDrinkVendingMachine extends VendingMachine{
    private double temperature;

    public double getTemperature() {
        return temperature = 50;
    }

    @Override
    public void getProduct(String name) {
        System.out.println("Кофе");
    }

    @Override
    public void restore(){
        System.out.println("Горячий напиток " + getTemperature() + " градусов");
    }
}