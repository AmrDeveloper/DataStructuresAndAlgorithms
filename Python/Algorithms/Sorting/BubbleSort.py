
#Bubble Soring Algorithms
def Sorting(array):
    for i in range(0,len(array),1):
        for a in range(0,i,1):
            if array[a] > array[i]:
                array[a] , array[i] = array[i] , array[a]