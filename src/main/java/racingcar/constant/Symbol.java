package racingcar.constant;

public enum Symbol {

    DELIMITER(",");

    private String value;

    Symbol(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}