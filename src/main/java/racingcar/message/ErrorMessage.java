package racingcar.message;

public enum ErrorMessage {
    OUT_OF_NAME_LENGTH_ERROR ("차 이름은 5자 이하로 입력해주세요."),
    BLANK_NAME("이름은 5자 이내로 꼭 입력해야 합니다."),
    ERROR("[ERROR] ");

    private String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
