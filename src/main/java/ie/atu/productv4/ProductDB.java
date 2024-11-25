package ie.atu.productv4;



public class ProductDB {

    public static Product getProduct(String productCode) { // parent class
    // In a more realistic application, this code would get the data for the product from a file or database
    // For now, this code just uses if/else statements to return the correct product data

    //We need all the book and software objects, but what kind of object do we return?// }

    Product item = null;
        if (productCode.equalsIgnoreCase("java")) {
        Book myBook = new Book();
        myBook.setCode(productCode);
        myBook.setDescription("ATU Java Programming");
        myBook.setPrice(57.50);
        myBook.setAuthor("Joe Brown");
        item = myBook;
    } else if (productCode.equalsIgnoreCase("jsp")) {
        Book myBook = new Book();
        myBook.setCode(productCode);
        myBook.setDescription("Java Servlets and JSP");
        myBook.setPrice(57.50);
        myBook.setAuthor("Mike White");
        item = myBook;
    } else if (productCode.equalsIgnoreCase("mysql")) {
        Book myBook = new Book();
        myBook.setCode(productCode);
        myBook.setDescription("Lennon's MySQL");
        myBook.setPrice(54.50);
        myBook.setAuthor("Jim Lennon");
        item = myBook;
    }
        else if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            item = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            item = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            item = mySoftware;
        }
        else if(productCode.equalsIgnoreCase("PINK")) {// music data base
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Wish you were here");
            myMusic.setArtist("Pink Flyod");
            myMusic.setLabel("Columbia Group");
            myMusic.setPrice(8.00);
            item = myMusic;
        }
        else if(productCode.equalsIgnoreCase("kdl43")){// telly data base
            Tv myTv= new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("SONY BRAVIA SMART TV KDL43WF663");
            myTv.setManufacture("Sony");
            myTv.setSize("55");
            myTv.setPrice(819.00);
            item = myTv;
        }

        return item;
}
}

