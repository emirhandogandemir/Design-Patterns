package StructuralPattern.adapter.adapterexample4;

public interface Client {
    public void setSorter(Sorter sorter);

    public int[] sortArray(int[] array);
}
