package ru.samsung.itschool.textquest.classes;

public class Sit4Factory implements ISituationFactory {
    @Override
    public ISituation Create() {
        return new Situation4();
    }
}
