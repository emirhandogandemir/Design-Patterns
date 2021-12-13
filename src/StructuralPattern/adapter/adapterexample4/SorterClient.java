package StructuralPattern.adapter.adapterexample4;

public class SorterClient implements Client{
    private Sorter sorter;

    @Override
    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    @Override
    public int[] sortArray(int[] array) {
        sorter.sort(array);
        return array;
    }
}
