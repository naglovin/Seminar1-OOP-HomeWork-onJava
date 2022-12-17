//Реализуйте класс Product (товар), содержащий данные о товаре, и VendingMachine (торговый автомат), содержащий в себе методы
//        initProducts (List <Product>) и
//        getProduct (String name)
//Реализовать конструкторы, get/set методы, построить логику VendingMachine на основе кода реализованного в задании 1.
//Реализовать наследника класса Product, добавив новому классу доп переменную (например вес или объем напитка)
//*Реализовать наследника класса VendingMachine , продающий только конкретный продукт.
//Реализовать у класса VendingMachine, метод void restore() и реализовать логику.
//        Создать в main список из нескольких объектов VendingMachine и нескольких объектов его наследников.
 //       Вызвать метод restore() для каждого элемента в списке.
//        Переопределить метод restore() у потомков и повторить пункт 3
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<VendingMachine> vm = new ArrayList<>();
        vm.add(new VendingMachine());
        vm.add(new DrinkVendingMachine());
        vm.add(new HotDrinkVendingMachine());
        for(VendingMachine i: vm){
            i.restore();
        }
    }
}

//public class Main extends Product {
//    public void setWight(double wight) {
//        this.wight = wight;
//    }
//
//    public void setVolume(double volume) {
//        this.volume = volume;
//    }
//
//    private double wight;
//    private  double volume;
//
//    public Main(double wight, double volume) {
//        this.wight = wight;
//        this.volume = volume;
//    }
//    public Main(String name, double price, double wight, double volume){
//        super(name, price);
//        this.wight = wight;
//        this.volume = volume;
//    }
//}