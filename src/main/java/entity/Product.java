package entity;


public  class Product{


    private String id;

    private String name;
    private String price;
    private int quiantity;
    private String category;

    private String url;

    private String description;
    private String labels;


    public Product(String id, String name, String price, int quantity, String url, String category, String description, String labels) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.url = url;
        this.category = category;
        this.description = description;
        this.labels = labels;
    }


    public Product(int id, String name, double price, String url, String category, String description, String labels) {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", url='" + url + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", labels='" + labels + '\'' +
                '}';
    }


}

