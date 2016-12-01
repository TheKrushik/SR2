package info.krushik.android.sr2;


public enum States {

    ENUM1("для компа"),
    ENUM2("для учебы"),
    ENUM3("для картошки");

    private String bag;

    States(String bag) {
        bag = bag;
    }

    @Override public String toString() {
        return bag;
    }

}
