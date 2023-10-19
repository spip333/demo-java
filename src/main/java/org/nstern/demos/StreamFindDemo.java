package org.nstern.demos;

import static org.nstern.demos.util.DataUtil.createSampleCarList;

import java.util.List;

import org.nstern.demos.dto.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StreamFindDemo {

    private static final Logger log = LoggerFactory.getLogger(StreamFindDemo.class);

    public static void main(String[] args) {
        demo();
    }

    private static void demo() {
        List<Car> carList = createSampleCarList();
        var result = carList.stream().filter(car -> car.getModel().equals("cmax")).findFirst().orElseThrow();

        if (log.isInfoEnabled()) {
            log.info(result.toString());
        }
    }

}
