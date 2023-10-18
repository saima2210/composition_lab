package parts;

import products.IProduct;

public interface IPart extends IProduct { // can inherit from inheritance
    String getManufacturer();
    long getPartNumber();
    void setManufacturer(String man);
    void setPartNumber(long num);
}
