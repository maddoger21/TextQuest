package ru.samsung.itschool.textquest.classes;

public class Sit2Factory implements ISituationFactory {
    @Override
    public ISituation Create() {
        return new Situation2();
    }
}
