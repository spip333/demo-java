package org.nstern.demos.dto;

import java.util.List;

public class MyDto {
    int id;
    String name;
    String description;
    float value;
    List<MyDto> children;

    public MyDto() {
    }

    public MyDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public void setChildren(List<MyDto> children) {
        this.children = children;
    }

    public List<MyDto> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "id: " + id + ";name:" + name;
    }

    public static class DtoBuilder{

        MyDto myDto = new MyDto();

        public DtoBuilder withId(int id){
            myDto.setId(id);
            return this;
        }

        public DtoBuilder withName(String name){
            myDto.setName(name);
            return this;
        }

        public DtoBuilder withDescription(String description){
            myDto.setDescription(description);
            return this;
        }
                public DtoBuilder withValue(float value){
            myDto.setValue(value);
            return this;
        }

        public DtoBuilder withChildren(List<MyDto> children) {
            myDto.setChildren(children);
            return this;
        }

        public MyDto build(){
            return myDto;
        }

    }
}
