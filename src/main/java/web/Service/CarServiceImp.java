package web.Service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiceImp implements CarService {

    private  List<Car> auto = new ArrayList<>();
    {
        auto.add(new Car(1, "white", "model1"));
        auto.add(new Car(2, "black", "model2"));
        auto.add(new Car(3, "yellow", "model3"));
        auto.add(new Car(4, "blue", "model4"));
        auto.add(new Car(5, "red", "model5"));
    }


    @Override
    public List<Car> countCar(Integer count) {
        if ( count != null && count > 0  && count <= auto.size() ){
            return  auto.stream().limit(count).collect(Collectors.toList());
        }
        return  auto;
    }
}
