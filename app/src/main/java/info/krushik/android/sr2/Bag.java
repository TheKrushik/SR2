package info.krushik.android.sr2;


public class Bag {

    private String name;
    private int weight;
    private Purpose purpose;

    public Bag(String name, int weight, Purpose purpose) {
        this.name = name;
        this.weight = weight;
        this.purpose = purpose;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bag bag = (Bag) o;

        if (Float.compare(bag.weight, weight) != 0) return false;
        if (name != null ? !name.equals(bag.name) : bag.name != null) return false;
        return purpose == bag.purpose;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (weight != +0.0f ? Float.floatToIntBits(weight) : 0);
        result = 31 * result + (purpose != null ? purpose.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Портфель: %s, вес: %s, Назначение: %s", name, weight, purpose);
    }
}
