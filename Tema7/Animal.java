package Tema7;

class Animal {
    public void emitirSom() {
        System.out.println("Som genérico");
    }
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Latido");
    }
}