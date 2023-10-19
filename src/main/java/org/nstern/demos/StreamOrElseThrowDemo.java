package org.nstern.demos;

import static org.nstern.demos.util.DataUtil.createSampleCarList;

import java.util.Collections;
import java.util.List;

import org.nstern.demos.dto.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class StreamOrElseThrowDemo {

    private static final Logger log = LoggerFactory.getLogger(StreamOrElseThrowDemo.class);

    public static void main(String[] args) {
        StreamOrElseThrowDemo main = new StreamOrElseThrowDemo();

        List<Car> carListEmpty = Collections.emptyList();
        List<Car> carListNotEmpty = createSampleCarList();

        if (log.isInfoEnabled()) {
            log.info("list not empty ...");
        }

        try {
            if (log.isInfoEnabled()) {
                log.info(main.doIt(carListNotEmpty));
            }
        } catch (Exception e) {
            if (log.isErrorEnabled()) {
                log.error(e.getMessage());
            }
        }

        if (log.isInfoEnabled()) {
            log.info("list empty ...");
        }

        try {
            if (log.isErrorEnabled()) {
                log.info(main.doIt(carListEmpty));
            }
        } catch (Exception e) {
            if (log.isErrorEnabled()) {
                log.error(e.getMessage());
            }
        }

    }

    public String doIt(List<Car> carList) {
       Car car =  carList.stream().findFirst().orElseThrow(RuntimeException::new);
        return "List was not empty: no exception. One car found:" + car;
    }

}
