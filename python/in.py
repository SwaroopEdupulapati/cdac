products = [ 
    {"id": 1, "name": "Laptop", "category": "Electronics", "price": 55000, "quantity": 10}, 
    {"id": 3, "name": "Smartphone", "category": "Electronics", "price": 20000, "quantity": 25} ,
    {"id": 4, "name": "Smartphone", "category": "Electronics", "price": 17800, "quantity": 12} ,
    {"id": 5, "name": "Smartphone", "category": "Electronics", "price": 31000, "quantity": 3} ,
    {"id": 2, "name": "Chair", "category": "Furniture", "price": 1500, "quantity": 50} ,
    {"id": 6, "name": "Smartphone", "category": "Electronics", "price": 200000, "quantity": 2} ,
] 
id_counter=len(products)

def menu():
    menu_text='''
    1.Add Product
    2.View All product
    3.Search product
    4.Update product
    5.Delete product
    6.Exit'''
       
    print("***Product Inventory management System***")
    print(menu_text)
    try:
        choice=int(input("Enter a your chioce : "))
    except:
        choice=-1

    return choice



def Add_product():
    global id_counter
    try:
        print("***Add new product details ***")
        name=input("Name: ")
        category=input("category: ")
        price=float(input("price: "))
        quantity=int(input("quantity: "))

        products.append(dict(id=id_counter+1,name=name,category=category,price=price,quantity=quantity))
        id_counter += 1
    except ValueError:
        print('please retry with a numerical value')

def view_product():
    if len(products)==0:
        print("No product found")
    elif len(products)==1:
        print(products[0])
    else:
        for i in products:
            print(i)

def search_product():
    search=input("enter a product name: ")
    search=search.title()
    for product in products:
        if product["name"]==search:
            print(product)

def update_product():
    update=int(input("enter a product_id to update:"))
    try:
        update = int(input("Enter a product_id to update: "))
        for product in products:
            if product["id"] == update:
                product["name"] = input("Name: ")
                product["category"] = input("Category: ")
                product["price"] = float(input("Price: "))
                product["quantity"] = int(input("Quantity: "))
                print("Product updated successfully!")
                return
        print("Product not found.")
        
    except ValueError:
        print("Please retry with a numerical value.")




def main():
    while True:
        choice=menu()

        match choice:
            case 1:
                Add_product()
            case 2:
                view_product() 
            case 3:
                search_product()
            case 4:
                update_product()
            case _ :
                print('Invalid choice. Please retry.')
main()