
public class QAData {
    private String raw;
    private String expect;

    public QAData() {
        raw = expect = "Please initiate raw data and expect data";
    }

    public QAData(String raw, String expect) {
        this.raw = raw;
        this.expect = expect;
    }

    public String getRaw() {
        return raw;
    }

    public void setData(String raw, String expect) {
        this.raw = raw;
        this.expect = expect;
    }

    public void setRaw(String raw) {
        this.raw = raw;
    }

    public String getExpect() {
        return expect;
    }

    public void setExpect(String expect) {
        this.expect = expect;
    }
}
