package ru.samsung.itschool.textquest.classes;

public class Sit5Factory implements ISituationFactory {
    @Override
    public ISituation Create() {
        return new Situation5();
    }
}
