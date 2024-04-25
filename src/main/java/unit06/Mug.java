package unit06;

public class Mug {
    private double size;
    private String color;
    private double fillLevel;
    private String phrase;
    private Material material;

    public Mug(double size, String color, double fillLevel, String phrase, Material material) {
        this.size = size;
        this.color = color;
        this.fillLevel = fillLevel;
        this.phrase = phrase;
        this.material = material;
    }

    public double getSize() {
        return this.size;
    }

    public double getFillLevel() {
        return this.fillLevel;
    }

    public String getColor() {
        return this.color;
    }

    public String getPhrase() {
        return this.phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public Material getMaterial() {
        return this.material;
    }

    public void fill(double liquid) {
        this.size += liquid;
        if(fillLevel > size) {
            fillLevel = size;
        }
    }

    public void drain(double liquid) {
        if(liquid > fillLevel) {
            liquid = fillLevel;
        }
        fillLevel -= liquid;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Mug) {
            Mug other = (Mug)obj;
            return this.size == other.size && this.material.equals(other.material);
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "A " + color + " " + material + " mug that says '" + phrase + "'";
    }

}
