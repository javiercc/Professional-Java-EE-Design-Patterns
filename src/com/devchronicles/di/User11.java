package com.devchronicles.di;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class User11 {

    private String fullName;
    
    public String getFullName(){
        return this.fullName;
    }
    
// some method not included for brevity
}
