//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        float heightMeters = 1.73F; // рост человека в метрах
        int massKG = 73; // масса тела человека в килограммах
        System.out.println("Ваш индекс массы тела = " + service.calculate(heightMeters, massKG));
    }
}