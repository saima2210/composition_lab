package products;

public interface IProduct { // everything in interface is public as methods outside of the class needs to be coded
    public float getPrice();
    public long getInventory();
    public void setPrice(float price);
    public void setInventory(long amount);
    public void setTitle(String title);
    public String getTitle();
    public void addInventory(long amount);
    public void removeInventory(long amount);
}
