package design.prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume liudehua = new Resume("刘德华");
        liudehua.setPersonInfo("男","60");
        liudehua.setWorkExperience("1978-2021","TVB");

        Resume liudehua2 = (Resume)liudehua.clone();
        liudehua2.setPersonInfo("男","63");
        liudehua2.setWorkExperience("2021-2023","CCTV");

        liudehua.Display();
        liudehua2.Display();

    }
}
