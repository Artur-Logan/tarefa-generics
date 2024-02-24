
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Carro> carroList = new ArrayList<>();

        carroList.add(new Corsa());
        carroList.add(new Camaro());

        for (Carro carro : carroList){
            System.out.println(carro);
        }
    }
}