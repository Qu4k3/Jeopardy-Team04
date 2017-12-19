package utils;

public enum EnumValueBox {
    B1(200), B2(400), B3(600), B4(800), B5(1000);

    private final int value;

    private EnumValueBox(int value) {
        this.value = value;
    }
}
