class Book{
    private String name,publisher;
    private int price,totalpage;
    private String category,Isbn;
    public Book(String name1,String isbn1,String publisher1,int price1,int totalpage1,String category1){
        this.name = name1;
        this.Isbn=isbn1;
      this.category=category1;
        this.publisher=publisher1;
        this.price=price1;
        this.totalpage=totalpage1;
    }
    public void setName(String name1){
        this.name = name1;
    }
    public String getName(){
        return this.name;
    }

    public void setIsbn(String isbn) {
        this.Isbn = isbn;
    }

    public String getIsbn() {
        return Isbn;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setTotalpage(int totalpage) {
        this.totalpage = totalpage;
    }

    public int getTotalpage() {
        return totalpage;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }


    public void show(){
        System.out.println( "Name: "+this.getName()
                +"\nIsbn: "+this.getIsbn()
                +"\nCatetory: "+getCategory()
                +"\nPublisher: "+this.getPublisher()
                +"\nPrice: "+this.getPrice()
                +"\nTotalpage: "+this.getTotalpage());
    }
}
