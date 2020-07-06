/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prajwal Raj Basnet
 */
public class InventoryDetails {
    String productCode, productName, manufacturer, category, range;
    int quantity;
    int price;

    public InventoryDetails(String productCode, String productName, String manufacturer, int quantity, int price,String range, String category) {
        this.productCode = productCode;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
        this.range=range;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }
    
    public String getRange(){
        return range;
    }

    public String getCategory() {
        return category;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
}
