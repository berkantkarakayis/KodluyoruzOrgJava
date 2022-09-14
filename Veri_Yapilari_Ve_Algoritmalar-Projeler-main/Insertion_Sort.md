# Insertion Sort  
> En basit sorting algoritmalarından biridir.
> Verilen örüntüye ait en küçük elemanı buluyor ve en baştaki sayı ile yer değiştiriyor.
--------------
## [22,27,16,2,18,6] -> Insertion Sort

1. Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.

* Start:         [22,27,16,2,18,6]
* First Pass:   [2,27,16,22,18,6]
* Second Pass:  [2,6,16,22,18,27]
* Third Pass:   [2,6,16,18,22,27]

----------

2. Big-O gösterimini yazınız.

* Big-O ($n^2$) 

3. Time Complexity: Average case: Aradığımız sayının ortada olması,Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.

4. Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.
* 18 sayısı **Average Case** kapsamına girer 
----------

## [7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.

* Start:         [7,3,5,8,2,9,4,15,6]
* First Pass:   [2,3,5,8,7,9,4,15,6]
* Second Pass:  [2,3,4,8,7,9,5,15,6]
* Third Pass:   [2,3,4,5,7,9,8,15,6]
* Fourth Pass:  [2,3,4,5,6,9,8,15,7]