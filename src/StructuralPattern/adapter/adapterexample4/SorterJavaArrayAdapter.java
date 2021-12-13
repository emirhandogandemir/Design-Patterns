package StructuralPattern.adapter.adapterexample4;

public class SorterJavaArrayAdapter implements Sorter{

    private JavaArraySorter javaArraySorter;

    public SorterJavaArrayAdapter(JavaArraySorter javaArraySorter) {
        this.javaArraySorter = javaArraySorter;
    }


    @Override
    public int[] sort(int[] array) {
        javaArraySorter.sort(array);
        return array;
    }
}
