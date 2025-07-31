package models;

public class Hashtag {
    private String name;
    private int count;

    public Hashtag(String name, int count) {
        this.name = name;
        this.count = count;
    }

    // Getters and Setters
    public String getName() { return name; }
    public int getCount() { return count; }
    public void setCount(int count) { this.count = count; }
}