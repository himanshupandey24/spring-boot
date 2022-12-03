package org.springlearning.interfaces;

public interface Speakers {
    default String makeSound() {
        return null;
    }
}
