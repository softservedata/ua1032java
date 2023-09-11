package com.softserve.edu.CollectionPart1.MyCollection;

public interface ICollectionOperation<T, T1, T2>{
    public void addRanElements(T1 t1);
    public void swapMaxMin(T1 t1);

    public void addDigitElementsAftNegative(T1 t1);

    public void insertZeroBetweenPosAndNeg(T1 t1);

    public T firstElements(T1 t1, int k);

    public T lastElements(T1 t1, int k);

    public void removeLastEvenElement(T1 t1);

    public void removeElemAfterMin(T2 t2);
}
