package utils;

public enum EnumTypeCategory {
    DEPORTES(0), PROGRAMACION(1),
    CULTURA(2), TECNOLOGIA(3),
    MUNDO_LABORAL(4);
    private final int value;

    private EnumTypeCategory(int value) {
        this.value = value;
    }

}
