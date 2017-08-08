#Insertion Sort
def sorting(array):
    for i in range(1,len(array),1):
        for a in range(i,0,-1):
            if(array[a] < array[a-1]):
                array[a] , array[a-1] = array[a-1] , array[a]
