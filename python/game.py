"""list1=[1,2,4,6,7,8,9,10]
r=2
while(len(list1)!=1):
    l=[]
    for i in range(1,len(list1)+1):
        if(i%r==0):
            list1.remove(list1[i-1])
        else:
            l.append(list1[i-1])
    
    list1=list(set(l)).remove(0)"""

n=int(input("Enter a number: "))
m=int(input("Enter a number: "))
o=int(input("Enter a number: "))