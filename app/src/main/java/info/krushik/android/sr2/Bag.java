package info.krushik.android.sr2;


public class Bag {
    private int weight;
    private String nameCompany;
    private String purpose;

    public Bag(int weight, String nameCompany, String purpose) {
        this.weight = weight;
        this.nameCompany = nameCompany;
        this.purpose = purpose;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public String toString() {

        return String.format("Вес: %s, Изготовитель: %s, назначение: %s", weight, nameCompany, purpose);
    }
}
