package StructuralPattern.adapter.adapterexample4;

public class SorterApacheAdapter implements Sorter{

   private ApacheSorter apacheSorter ;

    public SorterApacheAdapter(ApacheSorter apacheSorter) {
        this.apacheSorter = apacheSorter;
    }

    @Override
    public int[] sort(int[] array) {
        double[] x = new double[5];
        double[] y = new double[7];
        apacheSorter.sortInPlace(x,y);
        return array;
    }


}
