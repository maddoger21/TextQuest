package ru.samsung.itschool.textquest.classes;

public class Sit1Factory implements ISituationFactory {
    @Override
    public ISituation Create() {
        return new Situation1();
    }
}
