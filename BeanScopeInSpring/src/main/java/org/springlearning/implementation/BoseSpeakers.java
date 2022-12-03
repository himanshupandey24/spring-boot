package org.springlearning.implementation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springlearning.interfaces.Speakers;


@Component
@Primary
public class BoseSpeakers implements Speakers {
    @Override
    public String makeSound(){
        return "Playing music with Bose Speakers";
    }
}
