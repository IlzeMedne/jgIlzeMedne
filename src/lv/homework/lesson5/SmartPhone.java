package lv.homework.lesson5;

import java.util.Objects;

public class SmartPhone {

    private String manufacturer;
    private String color;
    private String processorType;
    private Double screenSize;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null
                || getClass() != obj.getClass()) return false;
        SmartPhone that = (SmartPhone) obj;
        return Objects.equals(manufacturer, that.manufacturer) &&
                Objects.equals(color, that.color) &&
                Objects.equals(processorType, that.processorType) &&
                Objects.equals(screenSize, that.screenSize);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "manufacturer=" + manufacturer + "" + '\'' +
                ", color=" + color + '\'' +
                ", processorType=" + processorType + '\'' +
                ", screenSize=" + screenSize + '}';
    }
}
