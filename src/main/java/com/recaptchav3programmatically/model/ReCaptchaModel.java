package com.recaptchav3programmatically.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ReCaptchaModel implements Serializable {

    private boolean success;
    private double score;
    private String action;
    private String challenge_ts;
    private String hostname;

    // Данная аннотация установлена потому что google возвращает поле "error-codes"
    // с дефисом. В java дефисы в названии полей недопустимо
    @JsonProperty("error-codes")
    private String[] error_codes;






    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getChallenge_ts() {
        return challenge_ts;
    }

    public void setChallenge_ts(String challenge_ts) {
        this.challenge_ts = challenge_ts;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String[] getError_codes() {
        return error_codes;
    }

    public void setError_codes(String[] error_codes) {
        this.error_codes = error_codes;
    }
}
