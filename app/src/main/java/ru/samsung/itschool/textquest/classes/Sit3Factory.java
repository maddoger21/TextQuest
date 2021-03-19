package ru.samsung.itschool.textquest.classes;

public class Sit3Factory implements ISituationFactory {
    @Override
    public ISituation Create() {
        return new Situation3();
    }
}
