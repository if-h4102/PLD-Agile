package controllers;

public abstract class MainControllerState {
    public void enterState(MainController mainController) {

    }

    public void leaveState(MainController mainController) {

    }

    public MainControllerState onOpenCityMapButtonAction(MainController mainController) {
        return this;
    }

    public MainControllerState onOpenDeliveryRequestButtonAction(MainController mainController) {
        return this;
    }

    public MainControllerState onCumputePlanningButtonAction(MainController mainController) {
        return this;
    }
}