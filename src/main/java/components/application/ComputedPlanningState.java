package components.application;

import models.Intersection;
import java.util.concurrent.CompletableFuture;

public class ComputedPlanningState extends WaitOpenDeliveryRequestState {

    ComputedPlanningState(MainController mainController) {
        super(mainController);
    }

    @Override
    public void enterState() {

    }

    @Override
    public void leaveState() {

    }

    @Override
    public MainControllerState onPromptIntersection(CompletableFuture<Intersection> future) {
        return new SelectingIntersectionState(this.mainController, future);
    }

    @Override
    public MainControllerState onComputePlanningButtonAction() {
        System.out.println("Computed");
        return this;
    }
}
