package HW4;

enum OperationType {
    ERROR(0),
    PURCHASE(1),
    CANCELLATION(2);

    private int value;

    OperationType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
