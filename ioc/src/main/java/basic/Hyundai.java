package basic;

public class Hyundai {
    public Car sell(Money money){
        System.out.println("현대 자동차 돈주면 차를 팝니다." + money.getAmount());
        Car car = new Car("제네시스");

        System.out.println("현대 자동차 돈주면 차를 팝니다." + car.getName());
        return car;
    }

}
