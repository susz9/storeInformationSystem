/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.coursework;

/**
 *
 * @author Sulav
 */
class EverestComputers {

    
    private String modelNumber, name, category, discount, recommendation;
    private int price;

    public EverestComputers(String modelNumber, String name, String category, String recommendation, int price, String discount) {
        this.modelNumber = modelNumber;
        this.name = name;
        this.category = category;
        this.discount = discount;
        this.recommendation = recommendation;
        this.price = price;
    }
    
    public String getModelNumber() {
        return modelNumber;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
    
    public String getRecommendation() {
        return recommendation;
    }

    public String getDiscount() {
        return discount;
    }
    
    public int getPrice() {
        return price;
    }
}
