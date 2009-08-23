project {
	projectName :"taslak"
	basePackage : "org.xmdl.taslak"
}

type Double
type Long
type String
type Date is java.util.Date
type User is org.xmdl.mesken.model.User

enum ProductType {
    RAWMATERIAL(1)
    INTERMEDIATEPRODUCT(2)
    PRODUCT(3)
    SERVICE(4)
}

embed Money {
	Double amount
}

entity Order {
    String name
    Double priceTotals
    Date createDate
    OrderElement# orderElements
}

entity Supplier {
	String name
	Product* products
}

entity Product {
    String name
    Money price
    ProductType productType
	OrderElement* orderElements
	Supplier* suppliers
}

entity OrderElement {
    Long quantity
    Order order
    Product product
}

entity Profile {
    User user
    String privatePhone
}

query ProductsByNameAndType<Product> 
with (String name, ProductType productType) {
	Product.name = name
	.productType = productType
	-max(10)
	-offset(0)
	-order(.price-)
}