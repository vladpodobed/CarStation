package com.vlad.taxistation.entity.car;

/**
 * Created by higgs on 29.03.15.
 */

public class SportLittleCityCar extends LittleCityCar {
    private double acceleration;

    public SportLittleCityCar(String brand, int price, double fuelConsumption, double maxSpeed, double turnRadius, double acceleration) {
        super(brand, price, fuelConsumption, maxSpeed, turnRadius);
        this.acceleration = acceleration;
    }

    public double getAcceleration() {
        return acceleration;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SportLittleCityCar that = (SportLittleCityCar) o;

        if (Double.compare(that.acceleration, acceleration) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(acceleration);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "SportLittleCityCar{" +
                "acceleration=" + acceleration +
                "} " + super.toString();
    }

}
