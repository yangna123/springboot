package com.hspedu.extend_;

public class PC extends Computer {
    private String brands;

    public PC(String cpu, int memory, int disk, String brands) {
        super(cpu, memory, disk);
        this.brands = brands;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }
    public void printInfo(){
        System.out.println("PC信息如下====");
        System.out.println(getDetail()+ "brand"+brands);
    }
}
