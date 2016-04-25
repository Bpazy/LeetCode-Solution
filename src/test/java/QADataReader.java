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

    public String getQuestion(int pos) {
        if (ready)
            return data.get(pos).getQuestion();
        return "Get question error.";
    }

    public String getAnswer(int pos) {
        if (ready)
            return data.get(pos).getAnswer();
        return "Get answer error";
    }

    public int size() {
        return data.size();
    }
}
