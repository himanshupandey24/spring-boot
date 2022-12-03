package org.springlearning.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springlearning.interfaces.Speakers;
import org.springlearning.interfaces.Tyres;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON) //@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class VehicleServices {
    private Speakers speakers;
    private Tyres tyres;

    @Autowired
    public VehicleServices(Speakers speakers, Tyres tyres) {
        this.speakers = speakers;
        this.tyres = tyres;
    }

    public void playMusic(){
        String music = speakers.makeSound();
        System.out.println(music);
    }

    public void moveVehicle(){
        String status = tyres.rotate();
        System.out.println(status);
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
