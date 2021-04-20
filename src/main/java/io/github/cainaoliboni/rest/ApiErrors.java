package io.github.cainaoliboni.rest;

import java.util.Arrays;
import java.util.List;

public class ApiErrors {

    private List<String> errors;

    public ApiErrors(String mensagemErro){
        this.errors = Arrays.asList(mensagemErro);
    }

    public ApiErrors(List<String> errors) {
        this.errors = errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ApiErrors)) return false;
        final ApiErrors other = (ApiErrors) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$errors = this.getErrors();
        final Object other$errors = other.getErrors();
        if (this$errors == null ? other$errors != null : !this$errors.equals(other$errors)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ApiErrors;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $errors = this.getErrors();
        result = result * PRIME + ($errors == null ? 43 : $errors.hashCode());
        return result;
    }

    public String toString() {
        return "ApiErrors(errors=" + this.getErrors() + ")";
    }

    public List<String> getErrors() {
        return this.errors;
    }
}
