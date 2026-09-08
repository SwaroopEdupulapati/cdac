blist=[]
id_counter=1

def add_book_entry(blist,nextid):
    title=input("Enter title   = ")
    author=input("Enter author = ")
    genere=input("Enter genere = ")
    price=float(int("Enter price   = "))
    copies=int(input("Enter copies = "))
    book={"Id":nextid,"Title":title,"Author":author,"Genere":genere,"Price":price,"Copies":copies}
    blist.append(book)
    return nextid+1

def render_catalog(blist):
    if(len(blist)>0):
        print(blist)
    else:
        print("Books are empty")

def query_books(blist,search):
    
    l=[]
    for i in blist:
        if(str(i["Id"])==search or i["Title"]==search or i["Author"]==search):
            l.append(i)
    return l
def query_books_id(blist,search):
    l=[]
    for i in blist:
        if(str(i["Id"])==search):
            l.append(i)
    return l
def query_books_title(blist,search):
    
    l=[]
    for i in blist:
        if(i["Title"]==search):
            l.append(i)
    return l
def query_books_author(blist,search):
    
    l=[]
    for i in blist:
        if( i["Author"]==search):
            l.append(i)
    return l
def remove_books(blist,search):
    for i in blist:
        if(str(i["Id"])==search or i["Title"]==search ):
            blist.remove(i)
def modify_book_details(blist,bid):
    for i in blist:
        if(str(i["Id"])==bid ):
            i["Title"]=input("Enter title   = ")
            i["Author"]=input("Enter author = ")
            i["Genere"]=input("Enter genere = ")
            i["Price"]=float(int("Enter price   = "))
            i["Copies"]=int(input("Enter copies = "))
            
            print("Book updated")
            print(i)
            return True
    return False
                 

                    
def main():
    while(True):
        print("""
        1. Add Book 
        2. View Catalog 
        3. Search Books 
        4. Update Details 
        5. Delete Book 
        6. Save to File 
        7. Load from File
        8. Exit
                """)
        ch=int(input("Enter choise"))
        match ch:
            case 1:
                id_counter=add_book_entry(blist,id_counter)
                break
            case 2:
                render_catalog(blist)
                break
            case 3:
                search=input("Enter Id or Title or author = ")
                l=query_books(blist,search)
                print(l)
                break
            case 4:
                bid=input("Enter Book Id = ")
                if(modify_book_details(blist,bid)):
                    print("successfully modified")
                else:
                    print("not modified")
            case 5:
                rid=input("Enter Id or Title to remove = ")
                remove_books(blist,rid)
            case _:
                print("Invalid")

                
main()