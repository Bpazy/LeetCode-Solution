import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class QADataReader {
    private BufferedReader reader;
    private List<QAData> data = new LinkedList<>();
    private boolean ready = false;

    public QADataReader(String name) {
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(name), "UTF8"));
        } catch (UnsupportedEncodingException | FileNotFoundException e) {
            e.printStackTrace();
        }
        initData();
    }

    private void initData() {
        if (reader == null) {
            return;
        }
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] split = line.trim().split("\\|");
                if (split.length != 2) {
                    System.out.println("Data File format error.");
                    break;
                }
                data.add(new QAData(split[0].trim(), split[1].trim()));
            }
            ready = true;
        } catch (IOException e) {
            System.out.println("Read data failed.");
        }
    }

    public String getRawString(int pos) {
        if (ready)
            return data.get(pos).getRaw();
        return "Get raw data error.";
    }

    public String getExpectString(int pos) {
        if (ready)
            return data.get(pos).getExpect();
        return "Get expect data error";
    }

    public int size() {
        return data.size();
    }
}
