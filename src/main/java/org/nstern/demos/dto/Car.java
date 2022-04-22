package org.nstern.demos.dto;

import java.util.ArrayList;
import java.util.List;

public class Car {

    Integer code;
    String mark;
    String model;
    Integer price;
    List<String> options = new ArrayList<>();

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<String> getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return "mark:" + mark
               + ";" + "model:" + model
               + ";" + "price:" + price
               + ";" + "options:" + options
                ;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Car other = (Car) obj;
        if (other == this) {
            return true;
        }
        if ((getCode().equals(other.getCode()) && getMark().equals(other.getMark())) && (getModel().equals(other.getModel()))) {
            return true;
        }

        return super.equals(obj);
    }

    public static class Builder {
        Car car = new Car();

        public Builder withCode(Integer code) {
            car.setCode(code);
            return this;
        }
        public Builder withPrice(Integer price) {
            car.setPrice(price);
            return this;
        }

        public Builder withMark(String mark) {
            car.setMark(mark);
            return this;
        }

        public Builder withModel(String model) {
            car.setModel(model);
            return this;
        }

        public Builder withOption(String option) {
            car.options.add(option);
            return this;
        }

        public Car build() {
            return car;
        }
    }


}
