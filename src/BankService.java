import java.io.*;

public class BankService {
    private String pathToOurSerialisedData = "resources/data.ser";


    public void serialize(Bank b) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pathToOurSerialisedData))){
            oos.writeObject(b);
            oos.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Bank deserialize() {
        Bank b;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pathToOurSerialisedData))){
            b = (Bank) ois.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return b;
    }
}
