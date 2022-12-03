package org.springlearning.implementation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springlearning.interfaces.Tyres;

@Component
@Primary
public class BrideStoneTyres implements Tyres {
    @Override
    public String rotate(){
        return "Vehicle moving with BridgeStone Tyres";
    }
}
