package me.dri.buscarcep.exception;

import java.io.Serializable;
import java.time.Instant;

public class StandardError  implements Serializable  {

    private Instant instant;
    private Integer status;
    private String error;
    private String message;


    public StandardError() {

    }

    public StandardError(Instant instant, Integer status, String error, String message) {
        this.instant = instant;
        this.status = status;
        this.error = error;
        this.message = message;

    }

    public Instant getInstant() {
        return instant;
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
