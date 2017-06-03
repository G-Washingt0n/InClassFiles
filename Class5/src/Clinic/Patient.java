/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinic;

import java.util.Objects;

/**
 *
 * @author lenovo
 */
public class Patient extends People {
    private String id = "jlyb";
   
    public Patient() {
        System.out.println("CREATE Patient with " + id);
    }
    
}
