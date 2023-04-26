public enum Color {
    RED("\u001B[31m"), YELLOW("\u001B[33m"), BLUE("\u001B[34m");
    private String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
