package info.krushik.android.sr2;


public enum Purpose {

    ENUM1("для компа"),
    ENUM2("для учебы"),
    ENUM3("для картошки");

    private String purpose;

    private Purpose(String purpose){
        this.purpose = purpose;
    }

    @Override public String toString(){
        return purpose;
    }

}
