package com.example.ecmall.model;

/**
 * Class SettlementResponse represents the response of a settlement operation.
 * It encapsulates the result of the settlement, providing a way to check whether the settlement was successful through getter and setter methods.
 */
public class SettlementResponse {
    private boolean result;

    /**
     * Constructs a SettlementResponse object with the specified settlement result.
     *
     * @param result the boolean value indicating the success or failure of the settlement
     */
    public SettlementResponse(boolean result) {
        this.result = result;
    }

    /**
     * Checks if the settlement was successful.
     *
     * @return true if the settlement was successful; otherwise, false
     */
    public boolean isResult() {
        return result;
    }

    /**
     * Sets the settlement result.
     *
     * @param result the boolean value indicating the success or failure of the settlement
     */
    public void setResult(boolean result) {
        this.result = result;
    }
}
