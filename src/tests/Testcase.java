package tests;

public enum Testcase {
    CASE1("abcDefg"),
    CASE2("abcdefg"),
    CASE3("1abcdefg"),
    CASE4("!abcDefg");
    
    private final String value;
    
    Testcase(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
}
