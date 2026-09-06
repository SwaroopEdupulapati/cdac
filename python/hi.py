class Product:
    products=[
        {"id":1,"name":"Laptop","category":"Electronics","price":1000,"quantity":10},
        {"id":2,"name":"Smartphone","category":"Electronics","price":500,"quantity":10}
        ]
    def menu(self):
        while(True):
            print("""1 add product
            2 view all product
            3 Search product
            5 delete product
            6 exit
            """)
            try:
                ch=int(input("Enter your choice:"))
                if(ch>=1 or ch<=6):
                    return ch
            except :
                return -1


    def add_product(self):
        name=input("Enter product name = ").title()
        category=input("Enter product catrgory = ")
        price=float(input("Enter the price = "))
        Quantity=int(input("Enter Quantity = "))
        id=len(Product.products)+1
        product= {"id":id,"name":name,"category":category,"price":price,"quantity":Quantity},
        cl.products.append(product)
    def view_products(self):
        if len(cl.products)==0:
            print("no products found")
        else:
            for i in cl.products:
                print(i)
        return
    def search_product(self):
        idOrName=input("Enter search ").title()
        print(" searched=  ",idOrName)
        l=[]
        for product in cl.products:
            if  product["name"] == idOrName:
                #print(product)
                l.append(product)
        if len(l)>0:
            print(l)
        else:
            print("Product not found")
        return
        print("Product not found")
    def update_product(self):
        pass
    def delete_product():
        pass

cl=Product()
while(True):
    ch=cl.menu()
    match ch:
        case 1:
            cl.add_product()
        case 2:
            cl.view_products()
        case 3:
            cl.search_product()
        case 4:
            cl.update_product()
        case 5:
            cl.delete_product()
        case 6:
            break
        case _:
            print("Invalid input chose the correct option")