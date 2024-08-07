package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("singleton")
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "rapsodiya";
    }
    
    public void doMyInit(){
        System.out.println("do my init");
    }
    public void doMyDestroy(){
        System.out.println("bye");
    }
    public ClassicalMusic(){};
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
}
