
class Carro {
    private String name;
    private String brand;
    private Integer year;
    private Float v_max;
    private String message = 
        "The %s field has been set to default, and inserting an ivalid or empt %s has been denied, to improve data integrity.\n";

    // default construct
    Carro (){
        //TODO
    }

    // full construct
    Carro (String nome, String brand, Integer year, Float topSpeed) {
        this.name = nome;
        this.brand = brand;
        this.year = year;
        this.v_max = topSpeed;
    }

    // Metodo de acesso para nome
    public String getName() {
        return this.name;}
    // Metodo modificador para nome
    public void setName(String varName) {
        if (varName != "") {
            this.name = varName;
        } else {
            System.out.printf(this.message, "name", "name");
        }
    }

    // Metodo de acesso para marca
    public String getBrand() {
        return this.brand;}
    // Metodo modificador para marca
    public void setBrand(String varBand) {
        if (varBand != "") {
            this.brand = varBand;
        } else {
            System.out.printf(this.message, "brand", "brand");
        }
    }

    // Metodo de acesso para ano
    public Integer getYear() {
        return this.year;}
    // Metodo modificador para o campo ano
    public void setYear(Integer varYear){
        if (varYear < 1885 && varYear >= 2024) {
            this.year = varYear;
        }else{
            System.out.printf(this.message, "year", "year");
        }
    }

    // Metodo de acesso para velocidade maxima
    public Float getVMax() {
        return this.v_max;
    }

    // Metodo para alterar valor de velocidade maxima do carro
    public void increaseVelocity(Float value) {
        this.v_max += value;
    }

    // Metodo para diminuir o valor de velocidade maxima do carro
    public void decreaseVelocity(Float value) {
        this.v_max -= value;
    }
}