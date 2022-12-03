package org.springlearning.implementation;

import org.springframework.stereotype.Component;
import org.springlearning.interfaces.Tyres;

@Component
public class MichelenTyres implements Tyres {
    @Override
    public String rotate() {
        return "Vehicle moving with Michelin Tyres";
    }
}
