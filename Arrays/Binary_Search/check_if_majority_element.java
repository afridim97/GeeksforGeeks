int arr[] = {1, 2, 3, 4, 4, 4, 4};
        int n = arr.length;
        int x = 4;
        if (isMajority(arr, n, x)==true)
           System.out.println(x+" appears more than "+
                              n/2+" times in arr[]");
        else
           System.out.println(x+" does not appear more than "+
                              n/2+" times in arr[]");
