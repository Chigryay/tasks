package enums;

public enum WorkStatus {
    ACTIVE(1),
    DISMISS(2);

    private final int statusCode;

    WorkStatus(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}

