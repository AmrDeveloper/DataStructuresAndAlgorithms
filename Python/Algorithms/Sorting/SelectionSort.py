
def sorting(array):
    for i in range(0,len(array),1):
        for a in range(i+1,len(array),1):
            if(array[a] < array[i]):
                array[a], array[i] = array[i], array[a]