package org.springlearning.implementation;

import org.springframework.stereotype.Component;
import org.springlearning.interfaces.Speakers;

@Component
public class SonySpeakers implements Speakers {
    @Override
    public String makeSound(){
        return "Playing music with Sony Speakers";
    }
}
