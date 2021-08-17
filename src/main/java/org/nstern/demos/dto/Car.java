package org.nstern.demos.dto;

public class Car {

    Integer code;
    String mark;
    String model;
    Integer price;
    Boolean fun;


    public Car() {
    }

    public Car(int c, String m, String mod) {
        code = Integer.valueOf(c);
        mark = m;
        model = mod;
    }

    public Car(int c, String m, String mod, Boolean f) {
        code = Integer.valueOf(c);
        mark = m;
        model = mod;
        fun = f;
    }

    public Car(int c, String m, String mod, int p) {
        this(c, m, mod);
        price = p;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
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

    public Boolean isFun() {
        return fun;
    }

    public void setFun(Boolean fun) {
        this.fun = fun;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("code:" + code + ";")
                .append("mark:" + mark + ";")
                .append("model:" + model + ";")
                .append("price:" + price + ";")
                .append("fun:" + fun)
                .toString();
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
        if ((getCode() == other.getCode()) && (getMark().equals(other.getMark())) && (getModel().equals(other.getModel()))) {
            return true;
        }
        ;

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

        public Builder withIsFun(Boolean fun) {
            car.setFun(fun);
            return this;
        }

        public Car build() {
            return car;
        }
    }


}
