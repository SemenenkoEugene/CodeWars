package Sprint4_4.Theme2_5.Lesson5_5;

public class RecyclableMaterial {
    // объявите переменные с правильными модификаторами
    private int code;
    private boolean isRecyclable;
    private String description;
    private MaterialType type;

    RecyclableMaterial(int code, MaterialType type, boolean isRecyclable, String description) {
        this.code = code;
        this.type = type;
        this.isRecyclable = isRecyclable;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public MaterialType getType() {
        return type;
    }

    public boolean isRecyclable() {
        return isRecyclable;
    }

    public String getDescription() {
        return description;
    }
}
