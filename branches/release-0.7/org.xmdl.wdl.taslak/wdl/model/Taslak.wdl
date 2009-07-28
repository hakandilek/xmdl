project {
	projectName :"org.xmdl.wdl.taslak"
	basePackage : "org.xmdl.taslak"
}

type Double
type Long
type String
type Date is java.util.Date
type Currency is java.util.Currency
type User is org.xmdl.mesken.model.User

enum ProductType {
    RAWMATERIAL(1)
    INTERMEDIATEPRODUCT(2)
    PRODUCT(3)
    SERVICE(4)
}

embed Money {
	Double amount
	Currency currency
}

entity Order {
    String name
    Double priceTotals
    Date createDate
    OrderElement* orderElements
}

entity OrderElement {
    Long quantity
    Order order
    Product product
}

entity Product {
    String name
    Money price
    ProductType productType
	OrderElement* orderElements
	Supplier* suppliers
}


entity Profile {
    User user
    String privatePhone
}

entity Supplier {
	String name
	Product* products
}
