package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("property")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "wind cries marry";
    }
}
