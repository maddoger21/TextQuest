package ru.samsung.itschool.textquest.classes;

public class SitEndFactory implements ISituationFactory {
    @Override
    public ISituation Create() {
        return new SituationEnd();
    }
}
