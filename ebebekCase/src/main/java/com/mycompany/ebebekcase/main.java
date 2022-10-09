/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ebebekcase;

/**
 *
 * @author esefa
 */
public class main {

    public static void main(String[] args) {
        
        
        
        Employee employee1 = new Employee("Enes",3000,45,2012);
        
        employee1.bonus();
        employee1.tax();
        employee1.raiseSalary();
                
        System.out.println(employee1);
       
       
       
    }
}
