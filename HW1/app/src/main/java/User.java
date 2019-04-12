
public class User {
    Integer weight;
    String gender;
    Double genderValue;
    Boolean active = false;
    Double a514 = 0.0;

    public User() {
        this.a514 = 0.0;
    }

    public void setWeight(Integer i){
        this.weight = i;
    }

    public void setGender(String s){
        this.gender = s;
        this.genderValue = (s == "male")? .73 : .66;
    }

    public void setDrinkSelection(String oz, Integer level){
        this.a514 = this.a514 + this.calculateA514(oz,(level * 5));

    }

    public void setAsActive(){
        this.active = true;
    }

    public Integer getWeight(){
        return this.weight;
    }

    public String getGender(){
        return this.gender;
    }

    public Boolean getActiveValue(){
        return this.active;
    }

    public Double getBac(){
        return this.a514/(this.weight * this.genderValue);
    }

    private Double calculateA514(String drinkOz, Integer drinkLevel){
        double calculationResult;
        double tempAlcoholPercent = (drinkLevel/100.0);
        int oz = 1;

        if(drinkOz.equalsIgnoreCase("5oz")) oz = 5;
        else if(drinkOz.equalsIgnoreCase("10oz")) oz = 10;
        else if(drinkOz.equalsIgnoreCase("1oz")) oz = 1;

        calculationResult =  (5.14 * (oz * tempAlcoholPercent ));

        return calculationResult;
    }

}
