public class Subject {
    String name;
    String introduction;
    int views;
    Publisher publisher =  new Publisher();
    Topic[] topics = { new Topic(), new Topic(), new Topic() };

    void increaseViews() {
        this.views += 1;
    }
}
