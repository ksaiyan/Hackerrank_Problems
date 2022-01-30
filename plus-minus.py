#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'plusMinus' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def plusMinus(arr):
    p = 0
    n = 0
    z = 0
    for i in range(len(arr)):
        if(arr[i] > 0):
            p=p+1
        elif(arr[i]<0):
            n=n+1
        else:
            z=z+1
        
    arz = [n,p,z]
    
    p=p/len(arr)
    n = n/len(arr)
    z=z/len(arr)
    
    print("{:.6f}".format(p))
    print("{:.6f}".format(n))
    print("{:.6f}".format(z))
    # Write your code here

if __name__ == '__main__':
    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    plusMinus(arr)
