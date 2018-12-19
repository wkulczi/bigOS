public enum SaID{           //todo->public?
    SYSTEM(0),
    HIGH(1),
    MEDIUM(2),
    LOW(3),
    UNTRUSTED(4);

    private int sec_level; //security level

    public int getSec_level() {
        return sec_level;
    }

    public void setSec_level(int sec_level) {
        this.sec_level = sec_level;
    }

    SaID(int level)
    {
        this.sec_level=level;
    }

}
