package com.patterns.template.tea;

public class TeaAddict{
 
    public static void main(String[] args) {
         
        TeaTemplate teaType = new GreenTea();
        teaType.makeTea();       
        teaType = new HerbalTea(); 
        teaType.makeTea();
    }
 
}