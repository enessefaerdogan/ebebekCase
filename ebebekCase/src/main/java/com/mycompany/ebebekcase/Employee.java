/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ebebekcase;

/**
 *
 * @author esefa
 */
public class Employee {
    
    
    
    public String name;
    public double salary;
    public int workHours;
    public int hireYear;
    
    
    static int bonus;
    static double vergi;
    static double artis;
    

    public Employee(String name, int salary, int workHours, int hireYear) {
        
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        
    }
            
  
    public void tax(){
         
        if (this.salary < 1000) {
           vergi =  0;
        }
        else{
           vergi = this.salary*0.03;
        }
        
    }
    
  
    public  void bonus(){
     
        if (this.workHours > 40) {
            //this.salary = this.salary + (this.workHours-40)*30;
           bonus = (this.workHours-40)*30; 
        }
        
    }
     
    
    public void raiseSalary(){
        
        if (2021-this.hireYear < 10) {
            artis = this.salary*0.05;
        }
        else if (2021-this.hireYear > 9 && 2021-this.hireYear < 20) {
            artis = this.salary*0.1;
        }
        else if (2021-this.hireYear > 19) {
            artis = this.salary*0.15;
        }
         
    }
    

    @Override
    public String toString() {
        
        return "Çalışanın ismi : " + this.name + "\n" +
               "Çalışanın maaşı : " + this.salary + "\n" +
               "Çalışanın çalışma saati : " + this.workHours + "\n" +
               "Çalışanın işe giriş yılı: " + this.hireYear + "\n" +
               "vergi : " + vergi + "\n" + 
               "bonus : " + bonus + "\n" + 
               "maaş artışı : " + artis + "\n" +
               "vergi ve bonuslarla maaş : " + (this.salary + bonus - vergi ) + "\n" +
               "toplam maaş : "+ (this.salary + artis + bonus - vergi); 
        
    }
        
          
}
