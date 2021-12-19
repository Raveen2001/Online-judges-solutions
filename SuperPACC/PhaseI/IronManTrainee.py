def sequ(str):
    aco=0
    bco=0
    cco=0
    for i in str:
        if(i=='a'):
            aco=(1+2*aco)%(pow(10,9)+7)
        if(i=='b'):
            bco=(aco+2*bco)%(pow(10,9)+7)
        if(i=='c'):
            cco=(bco+2*cco)%(pow(10,9)+7)
    return(cco)
            
str=input()
print(sequ(str))