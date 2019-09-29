package entity;

/**
 * Created by chrzanekk on 28.09.2019
 */
public class Boots extends Product {
    private String size;
    private boolean isNaturalSkin;

    public Boots(Long id, String productName, Float price, Float weight, String color, int productCount, String size,
                 boolean isNaturalSkin) {
        super(id, productName, price, weight, color, productCount);
        this.size = size;
        this.isNaturalSkin = isNaturalSkin;
    }

    public String getSize() {
        return size;
    }

    public boolean isNaturalSkin() {
        return isNaturalSkin;
    }
    @Override
    public String toString() {
        return super.toString() + "Boots{" + "size='" + size + '\'' + ", isNaturalSkin=" + isNaturalSkin +'}';
    }

}
