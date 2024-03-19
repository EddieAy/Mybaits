package zera.mybatis.pojo;

import java.math.BigDecimal;

public class Car {
    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carnum='" + carnum + '\'' +
                ", brand='" + brand + '\'' +
                ", guideprice=" + guideprice +
                ", producetime='" + producetime + '\'' +
                ", cartype='" + cartype + '\'' +
                '}';
    }

    private Long id;

    private String carnum;

    private String brand;

    private BigDecimal guideprice;

    private String producetime;

    private String cartype;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarnum() {
        return carnum;
    }

    public void setCarnum(String carnum) {
        this.carnum = carnum == null ? null : carnum.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public BigDecimal getGuideprice() {
        return guideprice;
    }

    public void setGuideprice(BigDecimal guideprice) {
        this.guideprice = guideprice;
    }

    public String getProducetime() {
        return producetime;
    }

    public void setProducetime(String producetime) {
        this.producetime = producetime == null ? null : producetime.trim();
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }
}